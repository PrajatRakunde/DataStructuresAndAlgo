// given string str = "MR John Smith"
// output = "MR%20John%20Smiyh"
public class URLify {

	public static void main(String[] args) {
		
		String str = "MR John Smith";
		String result = urlify(str);
		System.out.println(result);
		
	}

	private static String urlify(String str) {
		
		String[] strArr = str.split(" ");
		String result = "";
		for(int i = 0; i<strArr.length; i++) {
			
			if(i<strArr.length-1) {
				result = result + strArr[i] + "%20";
			} else {
				result = result + strArr[i];
			}
		}
		
		return result;
		
	}
	
}
