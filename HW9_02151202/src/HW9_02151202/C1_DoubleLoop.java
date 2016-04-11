package HW9_02151202;

public class C1_DoubleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //eco03 02151202 鄭琮霖
		char i= '*';
		int c,l;
		l=0;
		//c為欄數，l為行數
		while(l<6){
			l++;
			//表示這次迴圈將輸出之行數
			
			for(c=0;c!=l;c++){
				System.out.print(i+" ");
			}
			//每一次迴圈，c都從0開始，每輪迴一次都輸出i+" "，且讓c加1，直到欄數與行數相等時停止迴圈(c=l)。
			if (l<6)
				System.out.println("");
		    //在第6行時不換行
		
		}
	    //行數小於7行時，重複此迴圈
	
	}

}
