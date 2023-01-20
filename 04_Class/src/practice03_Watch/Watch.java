package practice03_Watch;

public class Watch {
	
		// 필드
		private int hour;  // 0 ~ 23
		private int minute;  // 0 ~ 59
		private int second;  // 0 ~ 59
		
		// 생성자
		public Watch(int hour, int minute, int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		
		// 메소드
		
		public void addHour(int hour) {
			this.hour += hour;
			
			while(this.hour > 24) {
				this.hour =- 24;
			}
			
			
		}
		
		
		public void addMinute(int minute) {
			this.minute += minute;
			
			
			
		}
		
		public void addSecond(int second) {
			
			
			
			
		}
		
		
		public void see() {
			
			
			System.out.println(hour + "시 " + minute + " 분 " + second + "초");
			
			
		}
		
		
		
		
		
		
		
		
}
