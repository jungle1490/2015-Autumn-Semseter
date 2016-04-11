package HW8_02151202;

import java.util.Scanner;

public class HW8_02151202__CharSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eco03 鄭琮霖 02151202
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Letter: ");
		String a= input.next();
		
		System.out.print("The corresponding number is: ");	
		switch(a){
		// 利用case來使不同的字母顯示相對應的數字
		
		case "a": case "A":	case "b": case "B": case "c": case "C":
			System.out.println("2");
			break;
		case "d": case "D":	case "e": case "E": case "f": case "F":
			System.out.println("3");
			break;
		case "g": case "G":	case "h": case "H": case "i": case "I":
			System.out.println("4");
			break;
		case "j": case "J":	case "k": case "K": case "l": case "L":
			System.out.println("5");
			break;
		case "m": case "M":	case "n": case "N": case "o": case "O":
			System.out.println("6");
			break;
		case "p": case "P":	case "q": case "Q": case "r": case "R":case "S": case "s":
			System.out.println("7");
			break;
		case "t": case "T": case "u": case "U":case "v": case "V":
			System.out.println("8");
			break;
			case "W": case "w": case "x": case "X":case "y": case "Z":case "Y": case "z":
			System.out.println("9");
			break;
		default:
			//以上情況都不是的話，則顯示此。
			System.out.println(a+" is a valid input.");
		
		}
		
		
		
		
	}

}
