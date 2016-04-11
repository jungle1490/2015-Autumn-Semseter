package OO6_02151202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C_02151202 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		//經三B 02151202 鄭琮霖 
     java.io.File file =new File ("src/IN.TXT");
     Scanner input=new Scanner(file,"UTF-8");
     
     
       
     
     String []name=new String[1000];
     int []score=new int[1000];
     int count=0;
    // inputing
     
     
     
     while(input.hasNext()){
    	 
    	 name[count]=input.next();
    	
    	score[count]=input.nextInt();
    	 count++;
     }
     input.close();   
     
     //sorting 
     int max=0;
     int maxindex=0;
     String maxname="";
     count=0;
     int count2=0;
     
     while(score[count]!=0){
         max=score[count];
    	 maxindex=score[count];
    	 maxname=name[count];
    	 count2=count;
    	 
    	 while(score[count2]!=0){
    		if(max<score[count2]){
    			max=score[count2];
    			maxindex=count2;
    			maxname=name[count2];
    		}
    		count2++;
    	 }
    	 
    	if(score[count]!= max){
    		score[maxindex]=score[count];
    		 score[count]=max;
    		 name[maxindex]=name[count];
    		 name[count]=maxname;
    	 }
    	 count++;
     }
     
    //output
     count=0;
     while(score[count]!=0){
     System.out.printf("%-20s\t%d\n\n",name[count],score[count]);
     count++;
     }

	}}
