import java.util.*;
import java.io.*;

public class Solution_queue {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
      for (int t = 1; t < 11; t++) {
          
          int T = Integer.parseInt(br.readLine());
          System.out.print("#" + T);
          Queue<Integer> queue = new LinkedList<>();
          
          String[] inputs = br.readLine().split(" ");
          for (int i = 0; i < inputs.length; i++) {
             queue.add(Integer.parseInt(inputs[i]));
          }
			
			int sub = 1;
			while (true) {
				int ans = queue.remove() - sub;
				if(ans <= 0) {
					queue.add(0);
					break;
				}
				else
					queue.add(ans);
				
				sub++;
				if(sub == 6) {
					sub = 1;
				}

			}
			
			for(int i = 0; i<8; i++) {
				System.out.print(" " + queue.remove());
			}
			
			System.out.println();
		}
	}
}
