package a03_연산자;

public class Operation04 {
	
	/*
	 *  논리연산자
	 *  AND -> && -> 곱
	 *  OR  -> || -> 합
	 *  NOT -> !  -> 부정
	 *  
	 *  true(1), false(0)
	 *  
	 *  true && true => true
	 *  true && false => false
	 *  
	 *  true || true => true
	 *  true || false => true
	 *  false || false => false
	 *  
	 *  !(true || false) => false
	 *  ! true || false => false
	 *  
	 */

	public static void main(String[] args) {
		
//		int score = 20;
     	boolean result;
//		
//		result = !(score <0 || score>100);
//		
//		
//		System.out.println("결과: " + result);
		//score가 음수도 안되고 100초과도 안된다.
		
		char grade = 'D';
		//grade가 소문자여도 되고 대문자여도 되는데 a,b,c,A,B,C 만가능
		result = grade=='a' | grade =='b' | grade == 'c'| grade=='A' | grade=='B' | grade=='C';
		System.out.println("출력2:" + result);
		result = true;
		
		
		
	}

}
