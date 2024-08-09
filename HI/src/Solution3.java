import java.util.*;
public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int test_case=1; test_case<=T; test_case++) {
			String s = sc.next();
		
			int count = 0;
			int sum = 0;
			for(int i = 0; i<s.length(); i++) {
				char c = s.charAt(i);
			
				if (c == '(') {
					count++;
				}
				else if (c == ')') {
					if(s.charAt(i-1) == '(') {
						count --;
						sum += count;
					}
					
					else {
						count--;
						sum+=1;
					}
				}
				
			}
			System.out.println("#" + test_case + " " + sum);

		}
		
	}

}

//()() 이것처럼 인접해 있는 애들은 +=2가 아님.
