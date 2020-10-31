import java.util.Arrays;

public class PermutationOfTwoStrings {

	public static void main(String[] args) {
		
		String x = "abcd";
		String y = "dbca";
		
		System.out.println(isPermtation(x,y));
		
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
	
}
