package day3;

import java.util.Scanner;


public class _04_trapezold {

	public static void main(String[] args) {
		// 윗변,밑변,높이 입력받아서 윗,밑,높이를 가지고 너비를 구하는 코드를 작성
		// 실수형
		// 사다리꼴의 넓이를 구하는 공식 :(윗변+밑변)*높이/2
		
		double  top,base,height;
		
		Scanner in = new Scanner(System.in);
		System.out.println("윗변, 밑변, 높이를 연속으로 입력하세요(공백으로 구분) : ");
		top = in.nextDouble();
		base = in.nextDouble();
		height = in.nextDouble();
		in.close();
		
//		System.out.print("윗변은 몇입니까?");
//		Scanner high = new Scanner(System.in);
//		double high_num = high.nextDouble();
//		
//		System.out.print("밑변은 몇입니까?");
//		Scanner low = new Scanner(System.in);
//		double low_num = low.nextDouble();
//		
//		System.out.print("높이는 몇입니까?");
//		Scanner height = new Scanner(System.in);
//		double height_num = height.nextDouble();
//		high.close();
//		low.close();
//		height.close();
//		
//		System.out.println("사다리꼴의 너비는"+ (high_num + low_num) *height_num /2 + "입니다");
		
	}

}
