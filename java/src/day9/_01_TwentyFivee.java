package day9;

public class _01_TwentyFivee {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 생성 후 각각의 칸에 1부터 25까지 넣기!
		 * 1부터 증가하는 변수를 만들어놓고 증가시키기*/
		
		int[][] arr = new int[5][5];
		int j,i;
		int count = 1;
		
		for(i = 0; i <= arr.length; i++) {
			for(j = 0; j <= arr[i].length; j++) {
				arr[i][j] = count ++;
				System.out.print(arr[i][j] + " ");
			}
			
		}
		

	}

}
