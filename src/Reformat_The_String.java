/**
 * 
 Given alphanumeric string s. 
 * (Alphanumeric string is a string consisting of lowercase English letters and digits).
You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. 
That is, no two adjacent characters have the same type.
Return the reformatted string or return an empty string if it is impossible to reformat the string.
 * @author Hao Chen
 *
 */



public class Reformat_The_String implements Problem {
	private String s;
	
	
	public Reformat_The_String(String s) {
		this.s = s;
	}

	@Override
	public Object solve() {
		int size = s.length();
		if(size == 0) 
			return new String("");
		
		int numDigit = 0;
		int numChar = 0;
		for (int i = 0; i < size; i++) {
			if(Character.isDigit(s.charAt(i))) {
				numDigit++;
			}else {
				numChar++;
			}
			
		}
		
		if(Math.abs(numChar-numDigit) > 1)
			return  new String("");
		
		
		boolean needChar = numChar > numDigit ? true : false;
		char[] result = s.toCharArray();
		
		char temp;
		for (int i = 0; i < size; i++) {
			int nextPos = getNext(result, i, needChar);
			needChar = !needChar;
			temp = result[i];
			result[i] = result[nextPos];
			result[nextPos] = temp;
		}	
		
		
		
		return new String(result);
	}
	
	
	
	
	private int getNext(char[] array,int pos,boolean getChar) {
		pos = pos > -1 ? pos: 0;
		for (; pos < array.length; pos++) {
			char c = array[pos];
			if(Character.isDigit(c)) {
				if(!getChar) {
					return pos;
				}
			}else {
				if(getChar) {
					return pos;
				}
			}
			
		}
		return pos;
	}

}
