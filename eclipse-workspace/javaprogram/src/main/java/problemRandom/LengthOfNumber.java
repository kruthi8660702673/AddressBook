package problemRandom;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {

		int x1, x2, y1, y2;
		double dis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of X1");
		x1=sc.nextInt();
		System.out.println("Enter the value of X2");
		x2=sc.nextInt();		
		System.out.println("Enter the value of Y1");
		y1=sc.nextInt();
		System.out.println("Enter the value of Y2");
		y2=sc.nextInt();
		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("LenghtOfNumber"+dis);
	}

}




