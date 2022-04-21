package HalloWelt;

import java.util.HashMap;

public class Data {
	
	HashMap<String, String> hash;
	
	Data(String[] keys, String[] values){
		this.hash = new HashMap<String, String>();
		int i = 0;
		for(String key : keys) {
			if (i > values.length-1) {
				break;
			} else {
				this.hash.put(key, values[i]);
				i++;
			}
		}
	}
	
	public void printValues() {
		for (String key: this.hash.keySet()) {
			System.out.printf("%s: %s%n", key, this.hash.get(key));
		}
	}

}
