
public class RotationOfString {

	public static void main(String[] args) {
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println(isRotation(s1,s2));
		
	}

	private static boolean isRotation(String s1, String s2) {
		
		String s1s1 = s1 + s1;
		System.out.println(s1s1.indexOf(s2));
		return s1s1.indexOf(s2) > 0 && s1.length() == s1.length();
		
	}
	
}
