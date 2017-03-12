
public class permutation {
	public static void main(String[] args) {
		
		permutate("", "abcdefgh");
		
//		char[] chars = {'a', 'b', 'c','d'};
//		permutate(chars, 0, chars.length);
	}
	
	public static void permutate(String prefix, String postfix) {
		if(postfix.length() == 0) {
			System.out.println(prefix);
		} else {
			for(int i=0; i<postfix.length(); i++) {
				permutate(prefix + postfix.charAt(i),
						  postfix.substring(0, i) + postfix.substring(i+1, postfix.length()));
			}
		}
	}
	
	public static void permutate(char[] chars, int start, int end) {
		char tmp;
		if(start<end-1) {
			permutate(chars, start+1, end);
			for(int i=start+1; i<end; i++) {
				tmp = chars[i];
				chars[i] = chars[start];
				chars[start] = tmp;
				permutate(chars, start+1, end);
				tmp = chars[i];
				chars[i] = chars[start];
				chars[start] = tmp;
			}
		} else {
			for(char c: chars) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
