import java.util.Arrays;
import java.util.Scanner;

public class Algo1_서울_06_이화정 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int test_case = 1 ; test_case<=T; test_case++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				arr[i][j] = sc.nextInt(); // 받아온 값을 배열에 저장
				
			}
		}
		
		//가로 줄의 최대값 구하기
		int max = 0; // 최대값
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum = 0; // 합계는 매행마다 초기화
			for(int j = 0; j<M; j++) {
				sum += arr[i][j];
			}
			max = Math.max(max, sum); // max보다 sum이 크면 최대값 갱신
		}
		
		//세로줄 계산하기
		for(int i = 0; i<M; i++) {
			sum = 0; // 합계는 매열마다 초기화
			for(int j = 0; j<N; j++) {
				sum += arr[j][i];
			}
			max = Math.max(max, sum); // max보다 sum이 크면 최대값 갱신
		}
		
		System.out.println("#" + test_case + " " + max);
		
	}
}
}
