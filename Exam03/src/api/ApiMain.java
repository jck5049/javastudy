package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;






public class ApiMain {

	
public static void ex01() {
		
		String serviceKey = "rmk119MGF/Xqg2wLlk7F4b1v/XNTmQLfGyvheu/djqpyfvh+xAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		
		try {
			
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&Type=json");
			sbURL.append("&siDo=1100");
			sbURL.append("&guGun=1125");
			sbURL.append("&searchYear=2021");
			sbURL.append("&numOfRows=10");
			sbURL.append("&pageNo=1");
			
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == 200 ) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
		
			
			System.out.println(sb.toString());
			
			JSONArray items = new JSONObject(sb.toString())
	                    .getJSONObject("items")
	                    .getJSONArray("item");
			
			List<JSONObject> list = new ArrayList<>();
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				
				list.add(item);
				
				System.out.println(item);
				
				String occrrncdt = item.getString("occrrnc_dt");
				String occrrncdaycd = item.getString("occrrnc_day_cd");
				String dthdnvcnt = item.getString("dth_dnv_cnt");
				String injpsncnt = item.getString("injpsn_cnt");
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

public static void ex02() {
	
	try {
		
		// API 주소
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		apiURL += "?serviceKey=" + URLEncoder.encode("rmk119MGF/Xqg2wLlk7F4b1v/XNTmQLfGyvheu/djqpyfvh+xAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw==", "UTF-8");     
		apiURL += "&searchYear=" + URLEncoder.encode("2021", "UTF-8");
		apiURL += "&siDo=" + URLEncoder.encode("1100", "UTF-8");
		apiURL += "&guGun=" + URLEncoder.encode("1125", "UTF-8");
		apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
		apiURL += "&numOfRows=" + URLEncoder.encode("10", "UTF-8");
		apiURL += "&pageNo=" + URLEncoder.encode("1", "UTF-8");
		
		// URL 객체 생성(API주소의 형식 검증)
		URL url = new URL(apiURL);
		
		// API주소로 접속
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		// GET 방식의 요청임을 처리
		con.setRequestMethod("GET");	// 주소창에 ?랑 &가 주렁주렁 있는게 GET방식이다.
		
		// 응답 데이터는 "json"임을 처리하는 과정
		// 웹 상에서 주고 받는 데이터의 타입 : Content-Type
		con.setRequestProperty("Content-type", "application/json; charset=UTF-8"); // ; charset=UTF-8" 이 코드는 받아 오는 코드가 한글이 없는경우 생략 가능!     
		
		// 접속된 API로부터 데이터를 읽어 들일 입력 스트림 생성
		// 1. 정상 스트림과 에러 스트림으로 구분해서 생성
		// 2. API 입력 스트림은 오직 바이트 입력 스트림만 지원하므로 문자 입력 스트림으로 바꾸는 작업이 필요하다.
		// 3. 속도 향상을 위해서 Buffer가 내장된 스트림을 생성
		BufferedReader reader = null;
		if(con.getResponseCode() == 200) {
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		}else {
			reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		
		// BufferedReader는 readLine 메소드를 지원한다.
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine()) != null) {
			sb.append(line);
		}
		
		
		// 이제 API의 응답 데이터는 sb에 저장되어 있다.
		// System.out.println(sb.toString());
		
		// API의 응답 데이터를 분석하기 위해서 JSONObject로 변환한다.
		// json 라이브러리 사용을 위해서 Build Path 작업을 수행한다.
		
		/*
		방법 1.
		
		JSONObject obj = new JSONObject(sb.toString());
		JSONObject items = obj.getJSONObject("items");
		JSONArray itemList = items.getJSONArray("item");
		*/
		
		// 방법 2.
		JSONArray itemList = new JSONObject(sb.toString())
									.getJSONObject("items")
									.getJSONArray("item");
		
		// Accident 객체에 만들어진 데이터를 1개로 모으기 위해 만든 ArrayList이다!
		List<Accident> list = new ArrayList<Accident>();
		
		
		for(int i = 0; i < itemList.length(); i++) {
			// 응답 데이터에서 필요한 데이터를 분석(파싱)한다.
			JSONObject item = itemList.getJSONObject(i);
			String occrrncDt = item.getString("occrrnc_dt");
			String occrrncDayCd = item.getString("occrrnc_day_cd");
			int dthDnvCnt = item.getInt("dth_dnv_cnt");
			int injpsnCnt = item.getInt("injpsn_cnt");
			
			// Accident 객체에 위 정보 4개를 1개의 객체로 만든 작업(Accident는 따로 클래스 만들고 필드 생성하여 GETTER와 SETTER를 생성함)
			// 응답 데이터에서 추출한 데이터를 하나의 객체(Bean)로 만든다.
			// 현재는 객체를 만든 방법 또 다른 방법은 List<Map<String, Object>> 을 만들어 구현해도 된다.
			Accident accident = new Accident();
			accident.setOccrrncDt(occrrncDt);
			accident.setOccrrncDayCd(occrrncDayCd);
			accident.setDthDnvCnt(dthDnvCnt);
			accident.setInjpsnCnt(injpsnCnt);
			
			// 객체를 ArrayList에 저장한다.
			list.add(accident);
			
			
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
	
	
	
public static void ex03() {
	
	
			
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
					
					
		            weather.put("온도", data.getInt("temp") + "도");
		            weather.put("날씨", data.getString("wfKor"));
		            weather.put("시간", data.getInt("hour") + "시");
					
					
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

	

	
	

	
	
	public static void main(String[] args) {
		ex03();

	}
	
}
