package HW8_02151202;

public class HW8_02151202_StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 鄭琮霖 02151202
		String s1="Welcome";
		String s2="welcome";
		boolean isEqual= (s1.equals(s2));
		System.out.println(isEqual);
		//s1內容等於s2嗎?
		isEqual= s1.equalsIgnoreCase(s2);
		System.out.println(isEqual);
		//s1內容等於s2嗎？（不管大小寫）
		int x = s1.compareTo(s2);
		System.out.println(x);
		//s1跟s2第一個不一樣的字的差異比對
		x= s1.compareToIgnoreCase(s2);
		System.out.println(x);
		//s1跟s2第一個不一樣的字的差異比對（不管大小寫）
		boolean b = s1.startsWith("AAA");
		System.out.println(b);
		//s1從AAA開始嗎？
		b= s1.endsWith("AAA");
		System.out.println(b);
		//s1由AAA結束嗎？
		x= s1.length();
		System.out.println(x);
		//s1的字的長度是？
		x= s1.charAt(1);
		System.out.println((char)x);
		//s1在位置1的字母是？
		String s3=s1.concat(s2);
		System.out.println(s3);
		//s3=s1和s2的合併
		System.out.println(s1.substring(1));
		//s1在位置1之後的字串為？
		System.out.println(s1.substring(1,4));
		//s1在位置1和位置4中間的字串為？
		s3= s1.toLowerCase();
		System.out.println(s3);
		//s3是全部換成小寫的s1
		s3= s1.toUpperCase();
		System.out.println(s3);
		//s3是全部換成大寫的s1
		s3 = s1.trim();
		System.out.println(s3);
		//s3是後面空白
		
	}

}
