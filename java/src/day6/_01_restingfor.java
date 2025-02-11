package day6;

public class _01_restingfor {

	public static void main(String[] args) {
		/*
		 	***
		 	***
		 	***
		 	***
		 	*** 
		 * */
		
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
		
//		for(int i = 0; i < 5; i++) { // 행
//			for(int j = 0; j < 3; j++) { // 행 안에 들어가는 요소 반복
//				System.out.print("*");
//			}
//		}	System.out.println();
		
		// 0시 0분부터 23시 59분까지 출력해보기
		
		for(int t = 0; t < 24; t++) {
			for(int m = 0; m < 60; m++) {
				System.out.println(+ t + "시 " + m + "분");		
			}
		}
		
	}

}
