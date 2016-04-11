package Test_02151202;

import java.util.Scanner;

public class C1_02151202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入一句話:");
		String text=input.nextLine();
		int []count=new int[2];
		for(int i=0;i<text.length();i++){
			switch(text.charAt(i)){
			case 'a':				 
			case 'A':				
			case 'e':				
			case 'E':							
			case 'i':			
			case 'I':			
			case 'o':				
			case 'O':			
			case 'u':
			case 'U':
				count[0]+=1;
			     break;
			     
			case '1':			
			case '2':				
			case '3':				
			case '4':				
			case '5':				
			case '6':			
			case '7':				
			case '8':			
			case '9':				
			case '0':
				 count[1]+=1;
			     break;
			}
			}
		System.out.println("母音的數量為: "+ count[0]);
		System.out.println("數字的數量為: "+ count[1]);
	

	}

}
