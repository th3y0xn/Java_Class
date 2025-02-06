package day3;

import java.util.Scanner;

public class _05_frofile {

	public static void main(String[] args) {
		/* 1. 이름
		 * 2. 주소
		 * 3. 나이
		 * 4. 키
		 * 당신의 이름은 ***입니다.
		 * 당신의 주소는 ****입니다.
		 * 당신의 나이는 *살 입니다.
		 * 당신의 키는 *cm 입니다. ( 소수점 1자리까지 포함 )
		 * 출력은 printf 사용
		 **/

		
		
		System.out.printf("프로필을 입력하세요(이름/주소/나이/키) : " );
		
		Scanner profile = new Scanner(System.in);
		String name, adress;
		int age;
		double height;
		
		name = profile.next();
		adress = profile.next();
		age = profile.nextInt();
		height = profile.nextDouble();
		profile.close();
		
		System.out.printf("당신의 이름은 %s 입니다.",name);
		System.out.printf("당신의 주소는 %s 입니다.",adress);
		System.out.printf("당신의 나이는 %d 입니다.",age);
		System.out.printf("당신의 나이는 &f 입니다.",height);
		
		
		
		
		
		

	}

}
