package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class XMLMainClass {
	
	
	public static void ex01() {
		
		/*
			한국공항공사_항공기 운항정보 : 공항 코드 정보
			1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
			2. 요청 변수(Request Parameter)
				1) serviceKey : 인증키
		 	
		 */
		
//		String encodingKey = "rmk119MGF%2FXqg2wLlk7F4b1v%2FXNTmQLfGyvheu%2Fdjqpyfvh%2BxAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw%3D%3D";	
//		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
//		apiURL += "?serviceKey=" + encodingKey;	
		
		String serviceKey = "rmk119MGF/Xqg2wLlk7F4b1v/XNTmQLfGyvheu/djqpyfvh+xAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");	// GET방식
			//http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList?serviceKey=rmk119MGF/Xqg2wLlk7F4b1v/XNTmQLfGyvheu/djqpyfvh+xAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw==
			url = new URL(apiURL);
			
			con =  (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");	
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");	
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {		// HttpURLConnection. HTTP_OK이 200을 의미한다.
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
			
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되었습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void ex02() {
		
		/*
		한국공항공사_항공기 운항정보 : 국제선 운항 스케줄
		1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		2. 요청 변수(Request Parameter)
			1) serviceKey : 인증키
			2) pageNo : 조회할 페이지번호
			3) schDate : 검색일자
			4) schDeptCityCode : 출발도시코드
			5) schArrvCityCode : 도착도시코드
	 	
	 */
		
		String serviceKey = "rmk119MGF/Xqg2wLlk7F4b1v/XNTmQLfGyvheu/djqpyfvh+xAqjfrEwEH1mDZaEKrNRAoETYudkyVjVHCiBRw==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");	// GET방식
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20221231";
			apiURL += "&schDeptCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");	
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");	
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {		// HttpURLConnection. HTTP_OK이 200을 의미한다.
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
			
			File file = new File("C:" + File.separator + "storage", "국제선운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("국제선운항스케줄.xml이 생성되었습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
