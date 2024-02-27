import java.util.Scanner;

public class Test2 {
	// 정수a, b를 포함하여 그 사이의 모든 정수의 총합을 구합니다
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		// 6 4 > 456   1 4 > 1234
		int a1 = 0;
		int a2 = 0;
		if (a > b) {
			a1 = b;
			a2 = a;
		} else {
			a1 = a;
			a2 = b;
		}
		int ss = 0;
		for (int i = a1; i <= a2; i++) {
			ss += i;
		}
		
		System.out.println(ss);
		
	}

	
}
