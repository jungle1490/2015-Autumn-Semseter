package HW11_02151202;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 02151202 鄭琮霖
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入數個0-9的整數，並以0做為結尾：");
		int x=input.nextInt();
		int []count=new int [10];
		//判斷輸入的數字是多少
		while(x!=0 && x>0){
			switch(x){
			case 1:
				count[1]+=1;
				break;
			case 2:
				count[2]+=1;
				break;
			case 3:
				count[3]+=1;
				break;
			case 4:
				count[4]+=1;
				break;
			case 5:
				count[5]+=1;
				break;
			case 6:
				count[6]+=1;
				break;
			case 7:
				count[7]+=1;
				break;
			case 8:
				count[8]+=1;
				break;
			case 9:
				count[9]+=1;
				break;		
			}
			x=input.nextInt();
		}
		//0必定只有一次，但不會進入迴圈故在最後才加
		count[0]+=1;
		//輸出整數數字
		System.out.printf("%-13s","Digit:");
		for(int i=0;i<10;i++){
			System.out.printf("%-2d",i);
		}
		System.out.println();
		//輸出整數數字各被輸入幾次
		System.out.printf("%-13s","Occurrences:");
		for(int i=0;i<10;i++){
			System.out.printf("%-2d",count[i]);
		}
		
	}

}
