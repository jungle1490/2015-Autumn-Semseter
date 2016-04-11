package HW8_02151202;

import java.util.Scanner;

public class HW8_02151202_StringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 鄭琮霖 02151202
       char qwe= 'a';
       char asd= '5';
		String s4= "213";
	    System.out.println(qwe);
		Scanner input= new Scanner(System.in);
		double x =100/3;
		String c = "";
		System.out.printf("答案是%.55s",x);
		
		
		
		System.out.print("Enter Stirng s1: ");
		
		String s1= input.next();
		System.out.print("Enter Stirng s2: ");
		String s2 = input.next();
		
	
		System.out.println(c);
		if (s1.contains(s2)) {
			System.out.println(s2+ " is a substring of "+ s1+" .");
		}
		else {
			System.out.println(s2+ " is not a substring of "+ s1+" .");
			
		
		}
	}

}
