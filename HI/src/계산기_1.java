import java.util.*;

public class 계산기_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			String s = sc.next();
			
			String postfix = infixToPostfix(s, T);
			int result = evalpostfix(postfix);
			System.out.println("#" + test_case + " " + result);
		}
	}
	
	static Map<Character, Integer> map = new HashMap<>();

	static {
		map.put('+', 1);
		map.put('*', 2);
	}

	
	static String infixToPostfix(String s, int T) {
		String postfix = "";
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<T; i++) {
			char c = s.charAt(i);
			
			if(c <= '9' && c >= '0') {
				postfix += c;
			}
			else if (c == '(')
				stack.push(c);
			
			else if(c == ')') {
				char popItem = stack.pop();
				while(popItem != '(') {
					postfix += popItem;
					popItem = stack.pop();
				}
			}
			
			else {
				while(!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) >= map.get(c)) {
					char popItem = stack.pop();
					postfix += popItem;
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			postfix += stack.pop();
		}
		
		return postfix;
	}
	
	static int evalpostfix(String postfix) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i< postfix.length(); i++) {
			char c = postfix.charAt(i);
			
			if('0' <= c && c <= '9') {
				stack.push(c - '0');
				
			} else {
				int num2 = stack.pop();
				int num1 = stack.pop();
				
				int result = 0;
				if(c == '+')
					result = num1+num2;
				else if(c == '*')
					result = num1*num2;
				
				stack.push(result);
			}
		}
		return stack.pop();
		
	}
}
