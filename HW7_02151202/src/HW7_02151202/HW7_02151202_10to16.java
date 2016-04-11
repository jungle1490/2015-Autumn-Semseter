package HW7_02151202;

import java.util.Scanner;

public class HW7_02151202_10to16 {

	private static char[] d1;
	private static String d12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 鄭琮霖 02151202
		  
				//10進位轉16進位
				System.out.println("請輸入四位數的10進位數字");
				Scanner input = new Scanner(System.in);
				int dt = input.nextInt();
				System.out.println("16進位數字為：" );
				
				//將10進位轉換成16進位，並使用if來判斷16進位中大於9之數字，每一次運算都判斷一次
				int d;
				 d = dt/4096;
				 if (d==10){ System.out.print( "A");}
				 else if (d==11){ System.out.print( "B");}
				 else if (d==12){ System.out.print( "C");}
				 else if (d==13){  System.out.print( "D");}
				 else if (d==14){  System.out.print( "E");}
				 else if (d==15){  System.out.print( "F");}
				 else {System.out.print( d);}
				 
				 d = (dt%4096/256);
				 if (d==10){ System.out.print( "A");}
				 else if (d==11){ System.out.print( "B");}
				 else if (d==12){ System.out.print( "C");}
				 else if (d==13){  System.out.print( "D");}
				 else if (d==14){  System.out.print( "E");}
				 else if (d==15){  System.out.print( "F");}
				 else {System.out.print( d);}
				 
				 d = ((dt%4096)%256/16);
				 if (d==10){ System.out.print( "A");}
				 else if (d==11){ System.out.print( "B");}
				 else if (d==12){ System.out.print( "C");}
				 else if (d==13){  System.out.print( "D");}
				 else if (d==14){  System.out.print( "E");}
				 else if (d==15){  System.out.print( "F");}
				 else {System.out.print( d);}
				 
			
				 d = ((dt%4096)%256)%16;
			
				 if (d==10){ System.out.print( "A");}
				 else if (d==11){ System.out.print( "B");}
				 else if (d==12){ System.out.print( "C");}
				 else if (d==13){  System.out.print( "D");}
				 else if (d==14){  System.out.print( "E");}
				 else if (d==15){  System.out.print( "F");}
				 else {System.out.print(d);}
				 
				 
				 
				
				 
				

				
				
	}

}
