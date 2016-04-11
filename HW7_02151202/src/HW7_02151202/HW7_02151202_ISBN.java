package HW7_02151202;

import java.util.Scanner;

public class HW7_02151202_ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 鄭琮霖 02151202
		  
		//ISBN
		System.out.println("請輸入前9位數字");
		Scanner input = new Scanner(System.in);
		int d = input.nextInt();
		int d9 = d%10;
	    int d8 = (d/10)%10;
	    int d7 = (d/100)%10;
	    int d6 = (d/1000)%10;
	    int d5 = (d/10000)%10;
	    int d4 = (d/100000)%10;
	    int d3 = (d/1000000)%10;
	    int d2 = (d/10000000)%10;
	    int d1 = (d/100000000)%10;
	    //將輸入的9位數分隔出來，以算出第10位數
	    int d10= (d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
	    //算出第10位數
	    if (d10==10) {System.out.println("你的ISBN碼：" +d+ "X");}
	    else {System.out.println( "你的ISBN碼: "+(d)+ (d10));}
	    //利用if來判斷當第10位數=10的時候顯示X，!=10時則顯示該數字。
	    
	    
	}

}
