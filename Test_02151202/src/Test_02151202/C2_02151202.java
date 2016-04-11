package Test_02151202;

import java.util.Scanner;

public class C2_02151202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        String[] name=new String[5];
        double[] height=new double[5];
        System.out.println("請輸入五位學生的名字和身高:");
        for(int i=0;i<name.length;i++){
        	name[i]=input.next();
        	height[i]=input.nextDouble();
        	
        }
        
        System.out.println("請輸入欲查詢之學生的名字:");
        String find=input.next();
        boolean wehave=true;
        int n=0;
        for(int i=0;i<name.length;i++){
        	if(name[i].equals(find)){
        		System.out.println(name[i]+" :"+ height[i]+" cm");
        		break;
        	}
        	else{
        		wehave=false;
        	}
        }
        
        if(wehave==false)
        	System.out.println("查無此人");
       
	}

}
