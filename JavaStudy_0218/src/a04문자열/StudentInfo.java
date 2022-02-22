package a04문자열;

public class StudentInfo {

	public static void main(String[] args) {
		String name = "주예찬";
		char name1 = '주';
		
		System.out.println(name);
		
		
		
		int i_year = 2022;
		String academy ="코리아아이티 아카데미 부산";
		String year = ""+(++i_year);
		String month = "2";
		String day = "22";
		
		//System.out.println(year+1); 사용불가능
		System.out.println(Integer.parseInt(year)+1);
		
		System.out.println(year + "년" + month +"월" + day +"일" + academy + "학생정보" + "\n학생이름:" +name);
		
		/*
		 * 문자열 형변환
		 * 문자열 (String) ->Integer(int)
		 * Integer.pareseInt("100); ->숫자 100으로 변환
		 * Double.paresDouble("15.112); ->실수 15.112 변환
		 * Boolean.paresBoolean("true");
		 * 
		 * 
		 * 정수 실수 등을 문자열로 형변환
		 * Integer.toString(100); ->문자열 100으로 변환
		 * Integer.toString(3.41); -> 문자열 3.41로 변환
		 * Boolean.toString(true); -> 믄자열 true로 변환
		 */
		
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("3.14");
		System.out.println(num +20);
		System.out.println(dNum+10);
		System.out.println(!Boolean.parseBoolean("true"));
		System.out.println(""+ 100);
		
		String num2 = Integer.toString(200);
		System.out.println(num2+200);
	}

}
