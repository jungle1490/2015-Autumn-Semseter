package OO4_02151202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C2_02151202 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//經三B 02151202 鄭琮霖
		java.io.File File =new File("C:/4IN.txt");
		Scanner input=new Scanner (File);
		
		int [] money =new int [5];
		String [] category={"Food","Clothing","Transportation",
			"Housing","Entertainment"};
	
		
		while(input.hasNext()){
			
			int index=input.nextInt();
			String diff=input.next();
			int cost=input.nextInt();
			
		for(int i=0;i<money.length;i++){
		if(category[i].equals(diff)){
		   money[i]+=cost;
		}}
		}
		input.close();
		
	
		
		//find max
		int max =0;
		for(int i=0;i<money.length;i++){
			
			for(int j=i+1;j<money.length-1;j++){
				if(money[max]<money[j])
					max=j;
			}
		}
		
		//print
		System.out.print("Sum up: \n------- \n");
		for(int i=0;i<category.length;i++){
		System.out.printf("%-14s %5d \n",category[i],money[i] );
		}
		
		System.out.printf("-------------------------- \n"
				+ "Highest Cost: %6s", category[max]);
       
	}

}
