package HW11_02151202;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 02151202 鄭琮霖
		
		Scanner input=new Scanner(System.in);
		//創建陣列
		int [] a= new int[10];
		int [] b= new int [10];
		//得到a陣列
		System.out.print("請輸入10個數字到a陣列: ");
		for (int i =0;i<10;i++){
			a[i]=input.nextInt();
		}
		//得到b陣列
		System.out.print("請輸入10個數字到b陣列: ");
		for (int i =0;i<10;i++){
			b[i]=input.nextInt();
		}
		//兩陣列相加後輸出
		for(int i=0;i<10;i++){
			int total=a[i]+b[i];
			System.out.println("a["+i+"]+b["+i+"]= "+total);
		}
	}

}
