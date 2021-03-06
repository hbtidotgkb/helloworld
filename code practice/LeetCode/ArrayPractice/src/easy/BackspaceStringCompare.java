package easy;

/**
 * 
 * @author Gaurav
 * 
 *         Google: Easy
 *         "xywrrmp"
 * "xywrrmu#p"
 *
 */
public class BackspaceStringCompare {
	public static void main(String[] args) {
		System.out.println(new BackspaceStringCompare().backspaceCompare("ab##", "c#d#"));

	}

	public boolean backspaceCompare(String S, String T) {
		StringBuilder s = new StringBuilder(S);
		StringBuilder t = new StringBuilder(T);
		
		
		String ss = buildString(s);
		String tt = buildString(t);
		
		return ss.equals(tt); 

	}

	private String buildString(StringBuilder s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();) {
			if(s.charAt(i) =='#') {
				s.deleteCharAt(i);
				s.deleteCharAt(i-1);
				i=i-2;
			}
			i++;
		}
		return s.toString();
	}

}
