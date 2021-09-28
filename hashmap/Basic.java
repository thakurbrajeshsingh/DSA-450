package hashmap;
import java.util.HashMap;

public class Basic {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		
		map.put("abc", 1);
		map.put("def",2);
		map.put("xyz", 3);
		
		if(map.containsKey("abc")) {
			System.out.println("Contains ABC ");
		}
		
		if(map.containsKey("def")){
			System.out.println("Contains DEF");
		}
		
	int v1 = 0;
		if(map.containsKey("abcd"))
		{
			v1 = map.get("abcf");
		}
		System.out.println("v1 has value "+v1);

	}

}
