package day6;

public class _03_while {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println("안녕하세요" + i);
			i ++;
		}
		
		int j = 1;
		while(j <= 9) {
			System.out.println("6 X "+j+" = "+ (6*j));
			j ++;
		}
		
		int sum = 0;
		int k = 1;
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("합계 : "+sum);
	}	

}
