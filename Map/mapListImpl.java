package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"(1,2)", "(2,4)", "(7,2)"};
        Map<Character, List<Character>> map = new HashMap<>();
        
        for (String s : str) {
            char key = s.charAt(3);
            char value = s.charAt(1);
//            key->[list of values]
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(value);
        }
        
        // Print the map for verification
        for (Map.Entry<Character, List<Character>> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}

}
