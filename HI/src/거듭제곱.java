import java.util.Scanner;
public class 거듭제곱 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int N = sc.nextInt();
			int k = sc.nextInt();
			
			int result = square(N, k);
			System.out.println("#" + T + " " + result);
			
		}
	}
	
	public static int square(int N, int k) {
		if(k == 0) {
			return 1; 
		}
		
		return N * square(N, k-1);
	}

}
