package runner;

import java.util.Scanner;

public class Checking {

	public static void main(String[] args) {
		
		for (int i = 0; i <=8; i++) {
			
			for (int j = 0; j <=8; j++) {
				
				if (i == 0 && j == 4) {
					
					System.out.print("* ");
					
				}else if (i==1 && (j >= 3 && j <= 5) ) {
					
					System.out.print("* ");
					
				}else if (i==2 && (j >= 2 && j <= 6)) {
					
					System.out.print("* ");
					
				}else if (i==3 && (j >= 1 && j <= 7)) {
					
					System.out.print("* ");
					
				}else if (i==4 && (j >= 0 && j <= 8)) {
					
					System.out.print("* ");
					
				}else if (i==5 && (j >= 1 && j <= 7)) {
					
					System.out.print("* ");
					
				}else if (i==6 && (j >= 2 && j <= 6)) {
					
					System.out.print("* ");
					
				}else if (i==7 && (j >= 3 && j <= 5)) {
					
					System.out.print("* ");
					
				}else if (i == 8 && j == 4) {
					
					System.out.print("* ");
					
				}else {
					
					System.out.print("  ");
				}

			}
			
			System.out.println();
		}
		
		
		System.out.println("=========================================");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int nex = scan.nextInt();
	
		int newnex = nex / 2;

		int num = newnex; int num2 = newnex; 
		
		for (int k = 0; k <= newnex; k++) {
			
			int num3 = k;
			
			for (int k2 = 0; k2 <= nex; k2++) {
				
				if (k == 0 && k2 == newnex) {
					
					System.out.print("* ");
				
				}else if (k != 0 && k == num3 && (k2 >= num && k2 <= num2) ) {
					
					System.out.print("* ");
					
				}else {
					
					System.out.print("  ");
				}
			}
			
			num = num - 1;  num2 = num2 + 1;
			
			System.out.println();
		}
		
		num = 1; num2 = nex -1; 
		
		for (int k = 0; k <= newnex; k++) {
			
			int num3 = k;
			
			for (int k2 = 0; k2 <= nex; k2++) {
				
				if (k == nex && k2 == newnex) {
					
					System.out.print("* ");
				
				}else if (k != nex && k == num3 && (k2 >= num && k2 <= num2) ) {
					
					System.out.print("* ");
					
				}else {
					
					System.out.print("  ");
				}
			}
			
			num = num + 1;  num2--;
			
			System.out.println();
		}
	}
}
