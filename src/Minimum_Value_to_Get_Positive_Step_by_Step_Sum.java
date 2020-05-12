
public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum implements Problem{

	
	private int[] nums;
	
	public Minimum_Value_to_Get_Positive_Step_by_Step_Sum(int[] nums) {
		// TODO Auto-generated constructor stub
		this.nums = nums;
	}

	@Override
	public Object solve() {
		// TODO Auto-generated method stub
		int minValue = 1;
		int result = 1;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			result += j;
			if(result < 1) {
				minValue += 1 + (0 - result);
				result = 1;
			}
		}
		return minValue;
	}

}
