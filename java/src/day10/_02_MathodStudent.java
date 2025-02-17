package day10;

//클래스
class Student {
	
	// 필드
	String name;
	int grade;
	double englishNum;
	double mathNum;
	
	// 생성자 추가
	Student(String n, int g,double e,double m){
		name = n;
		grade = g;
		englishNum = e;
		mathNum = m;
		
	}
	
	// 평균점수 계산 메서드
	public double average() {
		return (englishNum + mathNum) / 2.0;
	}
	
	// 정보출력 메서드
	public void studentInfo() {
		System.out.println("이름 : " + name +"학년 : "+ grade );
		System.out.println("수학 점수 : "+ mathNum + " / 영어 점수 : " + englishNum);
		System.out.println("평균 점수 : " + average());
	}
}


public class _02_MathodStudent {

	public static void main(String[] args) {
		/*
		 * 이름,학년,영어점수,수학점수 필드가 들어있는 클래스를 만들고
		 * 평균을 구하는 반환값이 있는 메서드를 만들어서 철수,영희의 정보를 출력해보기*/

		//생성자로 객체 생성
//		Student student1 = new Student();
//		student1.name = "김철수";
//		student1.grade = 3;
//		student1.englishNum = 90;
//		student1.mathNum = 85;
//		
//		Student student2 = new Student();
//		student2.name = "박영희";
//		student2.grade = 2;
//		student2.englishNum = 78;
//		student2.mathNum = 88;
//		
//		student1.studentInfo();
//		System.out.println();
//		student2.studentInfo();
		
		Student student1 = new Student("김철수", 3, 90, 85);
		Student student2 = new Student("박영희", 2, 78, 88);
		student1.studentInfo();
		System.out.println();
	    student2.studentInfo();
	}

}
