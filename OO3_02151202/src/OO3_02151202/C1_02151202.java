package OO3_02151202;

import java.util.Scanner;

public class C1_02151202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //經三B 02151202 鄭琮霖
		Scanner input=new Scanner (System.in);
		
		//creating array
		System.out.println("Please enter the number of students:");
		int x=input.nextInt();
		String [] name=new String[x];
		int [] score=new int[x];
		
		//enter the database
		//name&score
		System.out.println("Please enter student's name and score:");
		for(int i=0;i<name.length;i++){
			
			name[i]=input.next();
		    score[i]=input.nextInt();
			}
		
         
		//sorting
		for(int i =0;i<score.length;i++){
			int min=score[i];
			int minindex=i;
			String temp= name[i];
			for(int j=i+1;j<score.length-1;j++){
				if (min<score[j]){
					min=score[j];
					minindex=j;
					temp=name[j];
				}
			}
			
			if (score[i]!=min){
				score[minindex]=score[i];
				score[i]=min;
				name[minindex]=name[i];
				name[i]=temp;
			}
		}
		
		
		//print
		System.out.println("Students who get more than 60:");

		for(int i=0;i<score.length;i++){
			if(score[i]>=60){
				System.out.printf(" %15s %2d \n",name[i],score[i]);
			}
		}
	}

}
