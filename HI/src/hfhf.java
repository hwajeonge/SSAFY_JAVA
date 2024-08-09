import java.util.*;

class hfhf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] arr = new int[26];
        for(int i = 0; i<26; i++) {
        	arr[i] = -1;
        }
        
        for(int i = 0; i<str.length(); i++) {
        	if(i>0 && str.charAt(i) == str.charAt(i-1))
        		arr[str.charAt(i) - 'a'] = i-1;
        	else 
        		arr[str.charAt(i) - 'a'] = i;
        }

        
        
        System.out.println(Arrays.toString(arr));

    }
}
