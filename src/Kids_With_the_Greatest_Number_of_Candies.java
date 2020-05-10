import java.util.ArrayList;

public class Kids_With_the_Greatest_Number_of_Candies implements Problem{

	private int[] candies;
	private int extraCandies;
	
	
	
	public Kids_With_the_Greatest_Number_of_Candies(int[] candies, int extraCandies) {
		this.candies = candies;
		this.extraCandies = extraCandies;
	}

	@Override
	public Object solve() {
		int max = candies[0];
		int size = candies.length;
		for (int i : candies) {
			if(i > max) 
				max = i;
		}
		ArrayList<Boolean> result = new ArrayList<Boolean>(size);
		
		for (int i = 0;i < size; i++) {
			result.add( new Boolean((candies[i] + extraCandies) >= max));
		}
		
		
		return result;
	}

}
