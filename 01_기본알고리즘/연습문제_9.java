import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		while (true) {
			a = s.nextInt();
			b = s.nextInt();
			
			if ( b > a ) {
				break;
			} else {
				System.out.println("뒤자리가 더 커야함 다시 입력");
			}
		}
		
		
		int ss = b-a;
		
		System.out.println(ss);
		
	}

	
	
	
	
	
	
	
}
