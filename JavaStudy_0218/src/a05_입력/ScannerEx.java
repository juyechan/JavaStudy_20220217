package a05_입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String name = "김준일";
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(str);
		int studentCode = in.nextInt();
		System.out.println(studentCode + 10);
		
	}

}
