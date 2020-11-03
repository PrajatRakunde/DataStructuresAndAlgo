// given a String s = aaabbbbbcccaaaa
// output = a3b5c3a4


public class StringCompression {

	public static void main(String[] args) {
		
		String s = "aaabbbbbcccaaaa";
		String result = compress(s);
		System.out.println(result);
		
	}

	private static String compress(String s) {
		
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			countConsecutive++;
			if(i+1==s.length() || s.charAt(i) != s.charAt(i+1)) {
				
				compressed.append(s.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
				
			}
	
		}
		return compressed.toString();
		
	}
	
}
