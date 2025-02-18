package day11;

class Book {
	String name;
	int series;
	int page;
	
	Book(){
		name = "범죄도시";
		series = 4;
		page = 400;
		
	}
	Book(String n){
		name = n;
		series = 4;
		page = 400;
	}
	Book(String n, int s){
		name = n;
		series = s;
		page = 400;
	}
	Book(String n, int s,int p){
		name = n;
		series = s;
		page = p;
	}
	
	void bookInfo() {
		System.out.println("제목 : "+ name +" / 시리즈 : " + series +" / 페이지 수 : " + page);
	}
	
}




public class _02_OverLoding2 {

	public static void main(String[] args) {
		/*
		 * Book 이라는 클래스
		 * 제목, 시리즈, 페이지 수
		 * 
		 * 기본생성자 만들고
		 * 각각의 값만 바꿀 수 있는 오버로딩 생성자들을 만들기*/
		
		Book book1 = new Book();
		book1.bookInfo();
		
		Book book2 = new Book("트와일라잇");
		book2.bookInfo();
		
		Book book3 = new Book("뉴문",2);
		book3.bookInfo();
		
		Book book4 = new Book("이클립스",3,300);
		book4.bookInfo();
		
		Book book5 = new Book("브레이킹던 Part1",5,400);
		book5.bookInfo();
		
		

	}

}
