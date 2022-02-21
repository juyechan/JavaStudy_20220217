package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번 : 20220001 -> studentCode 정수
		 * 이름 : 주예찬	  -> name,name2,name3
		 * 학년 : 1		  -> studentYear 정수
		 * 성적 : 85.5	  -> score 실수
		 * 평점 : B		  -> grade 문자
		 * 성별 : 남(true),여성(false) -> gender(boolean)
		 * 
		 */
		int studentCode = 202200001;
		char name1 = '주';
		char name2 = '예';
		char name3 = '찬';
		int studentYear = 1;
		float score = 85.5f;
		char grade = 'B';
		boolean gender = true;
		
		System.out.println("학번 :" + studentCode);
		System.out.println("이름 :" + name1 + name2 + name3);
		System.out.println(""+ name1+name2+name3); //비어있는 문자열로 앞에 넣어줌으로써 업캐스팅되는과정 프로그램은 순서대로 진행
												   //순서를 지키면서 프로그래밍
//		System.out.print(name1);
//		System.out.print(name2);
//		System.out.println(name3);
		System.out.println("학년 :" + studentYear);
//		System.out.println(studentYear);
		System.out.println("성적 :" + score);
		System.out.println(score + 5);
		System.out.println("평점 :" + grade);
//		System.out.println(grade);
		System.out.println("성별 :" + gender);
//		System.out.print(gender);
	}

}
