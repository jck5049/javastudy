package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;





public class ApiMain {

	public static void main(String[] args) {
		
		try {
			
			String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1154551000";
			
			URL url = new URL(apiURL);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			con.setRequestProperty("Content-Type", "application/xml");
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			// 응답데이터(XML) 확인
			// System.out.println(sb.toString());
			
			// 응답데이터(XML)를 JSON데이터로 변환하기
			JSONObject obj = XML.toJSONObject(sb.toString());
			// System.out.println(obj);
			
			
			// pubDate 조회
			String pubDate = obj.getJSONObject("rss")
								.getJSONObject("channel")
								.getString("pubDate");
			System.out.println(pubDate);
			
			
			// category 조회
			String category = obj.getJSONObject("rss")
								.getJSONObject("channel")
								.getJSONObject("item")
								.getString("category");
			System.out.println(category);
			
			
			// data 속성에 저장된 날씨 배열 가져오기
			JSONArray dataList = obj.getJSONObject("rss")
									.getJSONObject("channel")
									.getJSONObject("item")
									.getJSONObject("description")
									.getJSONObject("body")
									.getJSONArray("data");
			
			
			// StringBuilder sbuilder = new StringBuilder();		스트링빌더
			// List<Weather> list = new ArrayList<Weather>();		객체  어레이리스트
			
			List<Map<String, Object>> day = new ArrayList<Map<String,Object>>();
			
			// 순회
			for(int i = 0; i < dataList.length(); i++) {
				JSONObject data = dataList.getJSONObject(i);
				
				Map<String, Object> weather = new HashMap<String, Object>();
				weather.put("온도", data.getInt("temp"));
				weather.put("날씨", data.getString("wfKor"));
				weather.put("시간", data.getInt("hour"));
				
				day.add(weather);
				
				// int temp = data.getInt("temp");				객체  어레이리스트
				// String wfKor = data.getString("wfKor");		객체  어레이리스트
				// int hour = data.getInt("hour");				객체  어레이리스트
				// Weather weather = new Weather();				객체  어레이리스트
				// weather.setTemp(temp);						객체  어레이리스트
				// weather.setWfKor(wfKor);						객체  어레이리스트
				// weather.setHour(hour);						객체  어레이리스트
				
				// list.add(weather);		객체  어레이리스트
				
				// 스트링빌더
				// sbuilder.append("온도 : " + data.getInt("temp") + ", 날씨 : " + data.getString("wfKor") + ", 시간 : " + data.getInt("hour") + "\n");
				
				/*
				System.out.println(data.getInt("temp"));		// 온도
				System.out.println(data.getString("wfKor"));	// 날씨
				System.out.println(data.getInt("hour"));		// 시간
				*/
				
				
			}
			
			// 결과 파일 만들기
			BufferedWriter writer = new BufferedWriter(new FileWriter("weather.txt"));	// 경로지정 안하면 프로젝트에 생김
			writer.write(pubDate + "\n");
			writer.write(category + "\n");
			
			for(int i = 0; i < day.size(); i++){
				writer.write(day.get(i).toString() + "\n");
			}
			
			// writer.write(day.toString());
			
			
			// writer.write(list.toString());		객체  어레이리스트
			// writer.write(sbuilder.toString());	스트링빌더
			
			writer.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
