// Given 2 Strings, verify one string is exactly one edit away from each other
// bake, fake -> true -> 1 replacement away
// take, tke -> true -> 1 insertion away
// take, babe -> false -> 2 replacement away 


public class OneEditAway {

	public static void main(String[] args) {
		
		String s1 = "bake";
		String s2 = "bale";
		
		checkOneEditAway(s1,s2);
		
	}

	private static void checkOneEditAway(String s1, String s2) {
		if(s1.length() == s2.length()) {
			System.out.println(oneReplaceAway(s1,s2));
		} else if(s1.length() - s2.length() == 1) {
			System.out.println(oneInsertAway(s1,s2));
		} else if(s2.length() - s1.length() == 1) {
			System.out.println(oneInsertAway(s2,s1));
		} else System.out.println(false);
	}

	private static boolean oneInsertAway(String s1, String s2) {

		int i1 = 0;
		int i2 = 0;
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i)+ " --> "+ s2.charAt(i2));
			if(s1.charAt(i1) != s2.charAt(i2)) {
				if(i2<i1)
					return false;
				i1++;
			} else {
				i1++;
				i2++;
			}
			
		}
		
		return true;
		
	}

	private static boolean oneReplaceAway(String s1, String s2) {
		
		boolean foundDif = false;
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDif) {
					return false;
				}
				foundDif = true;
			}
	
		}
		return true;
	}
	
}
