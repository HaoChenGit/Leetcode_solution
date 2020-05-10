import java.util.ArrayList;
import java.util.List;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> paths = new ArrayList<List<String>>(10);
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		
		paths.get(0).add("B");
		paths.get(0).add("C");
		
	
		paths.get(2).add("D");
		paths.get(2).add("B");
		
		paths.get(1).add("C");
		paths.get(1).add("A");
	
		
		Problem p = new Destination_City(paths);
		Object solution = p.solve();
		
		System.out.println(solution);
		
	}

}
