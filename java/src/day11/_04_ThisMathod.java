package day11;

class ThisCar {
	String brend;
	String color;
	
	ThisCar(){
		this("현대","하얀색");
		// 생성자의 기본값을 정해놓고 싶을 때 활용
		// 하나의 생성자에서는 this() 를 두 번 이상 사용할 수 없다 !
	}
	
	ThisCar(String brend, String color){
		this.brend = brend;
		this.color = color;
	}
	
	void showInfo() {
		System.out.println("브랜드 : " + this.brend + " / 색상 : "+ this.color);
	}
}

public class _04_ThisMathod {

	public static void main(String[] args) {
		ThisCar car1 = new ThisCar(); // 기본 생성자
		car1.showInfo();
		
		ThisCar car2 = new ThisCar("페라리","빨간색");
		car2.showInfo();

	}

}
