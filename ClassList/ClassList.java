import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class ClassList {
	Map<String,String> classList = new HashMap<String,String> ();
	public ClassList() { 
		classList.put("Bob","A");
		classList.put("Mary","C");
		classList.put("Sarah","B");
		classList.put("Philip","A");
		classList.put("Greg","F");
	}
	public void printClassList() {
		Iterator<Map.Entry<String, String>> entries = classList.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	    }	
		}
	public void printClassList2() {
		for (Map.Entry<String, String> entry : classList.entrySet()) {
		System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
		}
	
		for (String key : classList.keySet()) {
		System.out.println("Key = " + key);
		}
		
		for (String value : classList.values()) {
		System.out.println("value =" + value);
		}
	}
	public static void main(String[] args) {
		ClassList myClassList = new ClassList();
		myClassList.printClassList();
		myClassList.printClassList2();
	}
}	
