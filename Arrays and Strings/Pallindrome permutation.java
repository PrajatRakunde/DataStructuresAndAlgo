import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//given String str = tact coa
// result palindrom formed from above str = tacocat sor return true
// for a string tobe pallindrom it should satisfy the following rules:
//1. if str length is even, then count of each character must be even
//2. if str is odd, then then count of each character must be even and only one char can have count odd


public class PalindromPermutation {

	
	public static void main(String[] args) {
		
		String str = "tactllllllcoa";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		boolean result = palindromeCheck(str);
		System.out.println(result);
	
	}

	private static boolean palindromeCheck(String str) {
		
		Map<Character,Integer> strMap = new HashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>();
		int oddCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(strMap.containsKey(str.charAt(i))) {
				strMap.put(str.charAt(i),strMap.get(str.charAt(i))+1);
			} else {
				strMap.put(str.charAt(i),1);
			}

		}
		
		
		System.out.println(strMap);
		
		set = strMap.keySet();
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int value = strMap.get(itr.next());
			
			if(value % 2 == 0)
				continue;
			
			if(value % 2 == 1)
				oddCount++;
			
		}
		
		if(oddCount<=1)
			return true;
		
		return false;
		
	}
	
}
