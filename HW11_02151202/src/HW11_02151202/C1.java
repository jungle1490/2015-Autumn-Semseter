package HW11_02151202;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 02151202 鄭琮霖
		
		Scanner input=new Scanner (System.in);
		//建立陣列
		int [] a= new int[10];
		System.out.print("請輸入10個數字: ");
		//輸入數字到陣列裡
		for (int i =0;i<10;i++){
			a[i]=input.nextInt();
		}
		//反向輸出陣列裡的數字
		for (int j=9;j>=0;j--){
		System.out.print(a[j]+ " " );
		}
	}

}
