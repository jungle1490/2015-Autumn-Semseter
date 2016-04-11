package HW04_02151202;

import java.util.Scanner;

public class HW04_02151202 {
//Eco03 02151202 鄭琮霖
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
	    System.out.println( "二進位數字:")	;
		
	    int a= input.nextInt();
	
	    int b0= a%10*1;
	    int b1= (a/10%10)*2 ;
	    int b2= (a/100%10) *2*2 ;
	    int b3= (a/1000%10) *2*2*2 ;
	    int b4= (a/10000%10) *2*2*2*2 ;
	    int b5= (a/100000%10) *2*2*2*2*2 ;
	    int b6= (a/1000000%10) *2*2*2*2*2*2 ;
	    int b7= (a/10000000%10) *2*2*2*2*2*2*2 ;
	    //讓二進位數的每一位數都變成最後一位，然後取10的餘數，再將餘數乘上該次方的2後，全部加總，即可得知其十進位數。
	    //例如：二進位數 101，最後一位為1，取10的餘數為1，將1乘2的0次方，得1;
	    //再把101除以10，讓101的0變成最後一位，再取10的餘數為0，將0乘2的1次方，得0;
	    //最後再將101除以100，讓101的1變成最後一位，再取10的餘數為1，將0乘2的2次方，得4;
	    //最後再把1,0,4加起來等於5，得解，並以此類推！
	  
	    
	    System.out.println("十進位數字："+(b0+b1+b2+b3+b4+b5+b6+b7));
	}

}
