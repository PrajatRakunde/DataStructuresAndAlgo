import java.util.Arrays;

public class PermutationOfTwoStrings {

	public static void main(String[] args) {
		
		String x = "aaabcdb";
		String y = "abcdqwe";
		
		System.out.println(isPermtation2(x,y));
		
	}

	static boolean isPermtation(String x, String y) {
		
		if(x.length() == y.length()) {
			char[] x1 = x.toCharArray();
			char[] y1 = y.toCharArray();
			
			Arrays.sort(x1);
			Arrays.sort(y1);
			
			for(int i=0; i<x.length(); i++) {
				
				if(x1[i] != y1[i])
					return false;
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	static boolean isPermtation2(String x, String y) {
		
		if(x.length() == y.length()) {
			char[] x1 = x.toCharArray();
			char[] y1 = y.toCharArray();
			int[] letters = new int[128];
			
			for(char c : x1) {
				letters[c]++;
			}
			
			for(int i = 0; i<letters.length; i++) {
				System.out.print(letters[i]);
			}
			
			for(int i = 0; i<y.length(); i++) {
				
				int c = y.charAt(i);
				letters[c]--;
				System.out.println(letters[c]);
				System.out.println(c);
				if(letters[c] < 0) 
					return false;
				
				
			}
			return true;
		}
		
		return false;
	}
	
}
