package LeetCode;

public class FindTheDifference389 {
	
	public static char findTheDifference(String s, String t) {
		
		char diff = 0;
		
		for (char c: s.toCharArray()) {
			diff = (char) (diff^c);
		}
		for (char c: t.toCharArray()) {
			diff = (char) (diff^c);
		}

		return diff;
    
    }
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}

}
