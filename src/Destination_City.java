import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
 * Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 * @author Hao Chen
 *
 */

public class Destination_City implements Problem {
	List<List<String>> paths;
	
	public Destination_City(List<List<String>> paths) {
		this.paths = paths;
		
	}

	@Override
	public Object solve() {
		 String str="";
	        Set<String>set=new HashSet<>();
	        for(List<String> path:paths)
	        {
	            if(!set.contains(path.get(0)))
	                set.add(path.get(0));
	        }
	        for(List<String> path:paths)
	        {
	            if(!set.contains(path.get(1)))
	            {
	                str=path.get(1);
	                break;
	            }
	                
	        }
	        return str;
		
	}


}


/*
 Example 1:
	List<List<String>> paths = new ArrayList<List<String>>(10);
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		paths.add(new ArrayList<String>(2));
		
		paths.get(0).add("London");
		paths.get(0).add("New York");
		
		paths.get(1).add("New York");
		paths.get(1).add("Lima");
	
		paths.get(2).add("Lima");
		paths.get(2).add("Sao Paulo");
		
		
		Problem p = new Destination_City(paths);
		Object solution = p.solve();
		
		System.out.println(solution);

Example 2:














*/
