package Test_02151202;

import java.util.Scanner;

public class C3_02151202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] random = new int[3];
		int[] guess = new int[3];
		boolean notrepeat = true;
		// creating numbers,and make it not repeat
		do {
			notrepeat = true;
			for (int i = 0; i < random.length; i++) {
				random[i] = (int) (Math.random() * 10 + 1);
			}
			for (int i = 0; i < random.length; i++) {
				for (int j = 0; j < random.length; j++) {
					if (i!=j&&random[i] == random[j]) {
						notrepeat = false;
						break;
					}
				}
				if (notrepeat == false)
					break;
			}
		} while (notrepeat != true);

		for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}

		// guessing
		System.out.println("三個數字已產生...請猜測:");
		int[] result = new int[2];
		do {
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			for (int i = 0; i < guess.length; i++) {
				guess[i] = input.nextInt();
			}
			for (int i = 0; i < guess.length; i++) {
				for (int j = 0; j < guess.length; j++) {
					if (i == j && guess[i] == random[j]) {
						result[0] += 1;
					} else if (guess[i] == random[j]) {
						result[1] += 1;
					}
				}
			}
			if (result[0] != 3) {
				System.out.printf("猜測結果為 %3d A %3d B, 請繼續猜測\n", result[0], result[1]);
			} else
				System.out.printf("猜測結果為 %3d A , 恭喜成功!\n", result[0]);

		} while (result[0] != 3);
	}

	}


