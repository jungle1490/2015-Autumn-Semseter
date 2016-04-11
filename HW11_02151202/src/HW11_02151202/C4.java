package HW11_02151202;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 02151202 鄭琮霖
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入數個0-9的整數，欲結束請輸入-1：");
		int x=input.nextInt();
		int []count=new int [10];
		int [] print=new int [10];
		int j=0;
		//判斷輸入的數字有沒有重複
		while(x!=(-1)){
			for(int i=0;i<10;i++){
			   if(i==x){
					//如果沒有重複，則在count陣列上記一筆，表示輸入過。
				    //並將其加進print陣列，等待最後輸出
				   if(count[i]==0){
						count[i]++;
						print[j]=x;
						j++;
						
						}
				}
			}
			x=input.nextInt();
		}
		//輸出print陣列，如果
		System.out.print("Distinct numbers are:");
		for(int i=0;i<10;i++){
			if(print[i]!=0)
				System.out.printf("%2d",print[i]);
			
		}
	}

}
