import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
				
			if(M>N) {
				int temp = N;
				N = M;
				M = temp;
			}
			
			int[] arr = new int[N];
			int index = 0;
			for(int i = M+1; i<=N+1; i++) {
				arr[index++] = i;
			}
			System.out.print("#" + test_case + " ");
			int i = 0;
			while(arr[i] != 0 ) {
				System.out.print(arr[i++] + " ");
			}
			System.out.println();
		}
		
	}
}
