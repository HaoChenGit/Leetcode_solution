import java.util.LinkedList;
import java.util.List;

/*
 * Given an array target and an integer n. In each iteration, you will read a number from  list = {1,2,3..., n}.

Build the target array using the following operations:

    Push: Read a new element from the beginning list, and push it in the array.
    Pop: delete the last element of the array.
    If the target array is already built, stop reading more elements.

You are guaranteed that the target array is strictly increasing, only containing numbers between 1 to n inclusive.

Return the operations to build the target array.

You are guaranteed that the answer is unique.
 */

public class Build_an_Array_With_Stack_Operations implements Problem {

	List<String> list;
	int[] target;
	int n;
	
	public Build_an_Array_With_Stack_Operations(int[] target, int n) {
		// TODO Auto-generated constructor stub

		   list = new   LinkedList<String>();
		   this.target = target;
		   this.n = n;
	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub
	        String push = "Push";
	        String pop = "Pop";
	        int num = 0;
	        int supposed = 1;
	        while(num < target.length){
	            list.add(push);
	            if(target[num] == supposed ){
	                num++;
	            }else{
	                list.add(pop);
	            }
	            
	            
	            supposed++;
	        }
	        
	        
	}

	@Override
	public Object getSolution() {
		// TODO Auto-generated method stub
		return list;
	}
	/*
	 * Example 1:

Input: target = [1,3], n = 3
Output: ["Push","Push","Pop","Push"]
Explanation: 
Read number 1 and automatically push in the array -> [1]
Read number 2 and automatically push in the array then Pop it -> [1]
Read number 3 and automatically push in the array -> [1,3]

Example 2:

Input: target = [1,2,3], n = 3
Output: ["Push","Push","Push"]

Example 3:

Input: target = [1,2], n = 4
Output: ["Push","Push"]
Explanation: You only need to read the first 2 numbers and stop.

Example 4:

Input: target = [2,3,4], n = 4
Output: ["Push","Pop","Push","Push","Push"]

 

Constraints:

    1 <= target.length <= 100
    1 <= target[i] <= 100
    1 <= n <= 100
    target is strictly increasing.

	 */

}
