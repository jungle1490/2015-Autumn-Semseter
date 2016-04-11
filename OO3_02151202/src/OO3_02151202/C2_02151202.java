package OO3_02151202;

import java.util.Scanner;

public class C2_02151202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//經三B 02151202 鄭琮霖
		//助教，因為我覺得每次在記帳的時候打那麼多字很麻煩，所以就把它稍微改了一下><!
				Scanner input=new Scanner (System.in);
				
				String [] type={"F","C","T",
						"H","E"};
				String [] whole={"Food","Clothing","Transportation",
						"Housing","Entertainment"};
						
				int [] money =new int [5];
				
				
				
				System.out.println("Types: \n F = Food \n C = Clothing \n T = Transportation \n"
						+  " H = Housing \n E = Entertainment \n");
				
				System.out.println("Please enter an index, the type, and the amount of money: "
						+ "(if it comes to the end, just enter -1)");
				int index=0;
				String typeinput="";
				int moneyinput=0;
				index=input.nextInt();
				
				while(index!=(-1)){
					//reset
					index=0;
					typeinput="";
					moneyinput=0;
					
					//input
					
					input.nextLine();
					typeinput=input.nextLine();
					moneyinput=input.nextInt();
					
					//sum
					for(int i=0;i<type.length;i++){
					    if(typeinput.equals(type[i])){
						money[i]+=moneyinput;
					}
				}
					index=input.nextInt();
			}
				
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
				for(int i=0;i<type.length;i++){
				System.out.printf("%-14s %5d \n",whole[i],money[i] );
				}
				
				System.out.printf("-------------------------- \n"
						+ "Highest Cost: %6s", whole[max]);
		       
	}

}
