package day13;

abstract class Cooking {
	abstract void cook();
}

class Pizza extends Cooking{
	@Override
	void cook() {
		System.out.println("오븐에서 피자굽기");
	}
}	
	
class Raman extends Cooking{
	@Override
	void cook() {
		System.out.println("보글보글 맛 좋은 라면");
	}
}



public class _04_AbstractClassFood {

	public static void main(String[] args) {
		/*
		 * 요리방법(추상메서드)이이 들어있는 추상클래스 만들기
		 * 피자클래스 - 추상클래스 상속받기
		 * 라면클래스 - 추상클래스 상속받기
		 * */
		
		Cooking myCook = new Pizza();
		myCook.cook();
		
		Cooking myCook1 = new Raman();
		myCook1.cook();

	}
}
