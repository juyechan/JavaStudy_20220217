package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = null;
		
		System.out.print("성적을 입력해 주세요 :");
		score = scanner.nextInt();
		
		grade = score>-1 && score<101 ? 
				score > 90 ?"A" :
					score > 80 ? "B":
						score >70 ? "C":
							score > 60 ? "D":"F"
										:"X";
								
		System.out.println("학생의 평점은 " + grade + " 입니다.");
	}

}
