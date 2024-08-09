import java.util.Scanner;

public class 스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = 9;
			int[][] sudoku = new int[N][N];
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					sudoku[r][c] = sc.nextInt();
				}
			}
			int ans = 0;
			if(check(N, sudoku))
				ans = 1;
			
			System.out.println("#" + test_case + " " + ans);
			//행, 열, 3x3영역 검증
		}
	}
	
	static boolean check(int N, int[][] sudoku) {
		for(int r = 0; r < N; r++) {
			boolean[] count = new boolean[10];
			for(int c = 0; c < N; c++) {
				int num = sudoku[r][c];
				if(count[num])
					return false;
				count[num] = true;
			}
		}
		
		for(int c = 0; c < N; c++) {
			boolean[] count = new boolean[10];
			for(int r = 0; r < N; r++)
			{
				int num = sudoku[r][c];
				if(count[num])
					return false;
				count[num] = true;
			}
		}
		
		boolean[][][] count = new boolean[3][3][10];
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < N; c++) {
				int num = sudoku[r][c];
				int i = r/3;
				int j = c/3;
				
				if(count[i][j][num]) {
					return false;
				}
				count[i][j][num] = true;
			}
		}
		return true;
	}

}
