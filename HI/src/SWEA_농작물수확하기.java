import java.util.*;
public class SWEA_농작물수확하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int  test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			
			for(int i = 0; i<N; i++) {
				String s = sc.next();
				for(int c = 0; c < N; c++) {
					map[i][c] = s.charAt(c) - '0';
				}
			}
			
			int start = N/2;
			int end = N/2;
			int sum = 0;
			
			for(int r = 0; r<N; r++) {
				for(int c = start; c <= end; c++) {
					sum += map[r][c];
				}
				
				if (r < N/2) {
					start --;
					end++;
				}
				else {
					start++;
					end--;
				}

			}
			System.out.println("#" + test_case + " " + sum);
		}
		
	}
	

}
