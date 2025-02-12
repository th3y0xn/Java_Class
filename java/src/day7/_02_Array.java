package day7;

import java.util.Arrays;

public class _02_Array {

	public static void main(String[] args) {
		// 배열 : 같은 자료형의 변수를 저장해서 여러 데이터를 저장할 수 있음
		// 변수 : 1개의 값만 저장
		
		/*
		 * 기본 타입 : byte / short / int / long / float / double / char / boolean 
		 * 기본타입을 제외한 모든 타입은 참조타입이라고 하며, 참조타입은 주소값을 저장함
		 * **/
		
		int[] a;
		a = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		a[2] = 99;
		System.out.println(a[2]);
		
		a[4] = 1234*34;
		System.out.println(a[4]);
		
		a[0] = a[2] + a[4];
		System.out.println(a[0]);
		
		char[] i;
		i = new char[3];
		
		i[0] = 'R';
		System.out.println(i[0]);
		i[1] = 'Q';
		System.out.println(i[2]);
		System.out.println(i[1]);
		
		//int[] num = new int[5]; //자바에서는 대게 이렇게 사용
		//int []num = new int[5];
		//int num[] = new int[5];
		
		int[] numArr = {1,2,3,4,5};
		System.out.println(Arrays.toString(numArr));
		
		

	}

}
