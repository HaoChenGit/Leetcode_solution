import java.util.LinkedList;

public class String_Matching_in_an_Array implements Problem{

	
	private String[] words;
	
	public String_Matching_in_an_Array(String[] words) {
		this.words = words;
	}

	@Override
	public Object solve() {
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < words.length; i++) {
			String sub = words[i];
			for (int j = 0; j < words.length; j++) {
				String string = words[j];
				if(i != j && string.contains(sub)) {
					list.add(sub);
					break;
				}
			}
		}
		return list;
	}

}
