
public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,100};
				//{2,2,3,4};
		
		Problem p = new Find_Lucky_Integer_in_an_Array(arr);
		p.solve();
		String solution = p.toString();
		System.out.println(solution);
	}

}
