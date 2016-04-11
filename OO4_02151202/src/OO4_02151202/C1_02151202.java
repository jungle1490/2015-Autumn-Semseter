package OO4_02151202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1_02151202 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		  //經三B 02151202 鄭琮霖
		        java.io.File File =new File("C:/2IN.txt");
		        Scanner input =new Scanner (File);
				
				//creating array
				String []name=new String [1000];
				double []score=new double [1000];
				int count=0;
				while (input.hasNext()){
					
						name [count]=input.next();
						score[count]=input.nextDouble();
						count++;
					
				}
				input.close();
				
				//sorting
				for(int i =0;i<score.length;i++){
					double min=score[i];
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
						System.out.printf("%s %2.2f \n",name[i],score[i]);
					}
				}
	}

}
