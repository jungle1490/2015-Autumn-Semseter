package HW10_02151202;

import java.util.Scanner;

public class C1_whileArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 02151202 鄭琮霖  
		Scanner input=new Scanner(System.in);
		System.out.print("你打算輸入幾個數字呢？： ");
		int num=input.nextInt();
		System.out.print("請連續輸入0-9之間之數字（如打算結束，請輸入一負數）： ");
		int x = input.nextInt();
		int count=0;
		int i =0;
		int[] place= new int[num]; 
		int max=0;
		int maxnum=0;
		while(x>=0){
			place[i]=x;
			i++;
			if(i==num)
				break;
			x = input.nextInt();
			}
		//把輸入的數字放進陣列裡
		
		for(i=0;i<=9;i++){
			count=0;
			//從1開始跑到9的迴圈，用來檢驗的範本
			for(int j=0;j<=(num-1);j++){
			if (place[j]==i){
				count++;
			}}
			//此迴圈用於檢驗陣列裡的每個值是不是跟範本一樣
			if (count>=max){
				max=count;
				maxnum=i;}
			//如果他的次數比前一個還多，將會被設定為出現最多次的數字
			System.out.println(i+"出現"+ count+"次");
		}
		System.out.print(maxnum+"出現的次數最多。");
	}

}
