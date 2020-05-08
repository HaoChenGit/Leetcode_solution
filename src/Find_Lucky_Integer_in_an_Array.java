import java.util.Arrays;


public class Find_Lucky_Integer_in_an_Array implements Problem{
	
/*
 * Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. 
If there are multiple lucky integers return the largest of them. 
If there is no lucky integer return -1.
 */
	private int[] arr;
	private Integer result;
	
	
	public Find_Lucky_Integer_in_an_Array(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr; 
		result = -1;
	}

	@Override
	public void solve() {
		Arrays.sort(this.arr);
		int counter = 0;
		int num = -1;
		for (int i : arr) {
			if(i == num) {
				counter++;
			}else {
				if(num == counter) {
					result = num;
				}
				counter = 1;
				num = i;
			}
		}
		if(num == counter) {
			result = num;
		}
		
	}

	
	@Override
	public Object getSolution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return this.result.toString();
	}
	
}
