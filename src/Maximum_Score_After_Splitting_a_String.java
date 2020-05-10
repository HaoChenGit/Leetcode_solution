
/**
 * Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
 * @author Hao Chen
 *
 */
public class Maximum_Score_After_Splitting_a_String implements Problem {

	private String s;
	
	public Maximum_Score_After_Splitting_a_String(String s) {
		this.s = s;
	}

	
	private Object solve0() {
		int size = s.length();
		int maxScore = 0;

		if(s.charAt(0) == '0') maxScore++;
		for(int i =1; i < size; i++) {
			if(s.charAt(i) == '1')
				maxScore++;
		}
		
		int score = maxScore;
		for(int i =1; i < size-1; i++) {
			if(s.charAt(i) == '0') {
				score++;
			}else {
				score--;
			}
			if(score > maxScore)
				maxScore = score;
		}
		
		
		
		return maxScore;
	}
	
	
	
	
	@Override
	public Object solve() {
		
	        int counterZero = 0;
	        int counterOne = 0;
	        int result = 0;
	        int finalPos = s.length()-1;
	        int diff = 0;
	        for (int i=0;i< finalPos ;i++){
	            if (s.charAt(i) == '0'){
	            	counterZero++;
	            }
	            else{
	            	counterOne++;
	            }
	            diff = counterZero-counterOne;
	            if(diff > result)
	            	result = diff;
	            
	            
	        }
	        if (s.charAt(finalPos) == '1' ){
	        	counterOne++;
	        }
	        return result + counterOne;
	    
	}

}

/**
Example 1:

		String s = "00111";
		Problem p = new Maximum_Score_After_Splitting_a_String(s);
		Object solution = p.solve();
		
		System.out.println(solution);
		
		5
		



 */


