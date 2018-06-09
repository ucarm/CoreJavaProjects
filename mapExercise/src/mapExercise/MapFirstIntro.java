package mapExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFirstIntro {
public static void main(String[] args) {
	Map <String, String>map = new HashMap<>();
	map.put("JavaTeacher", "Akbar");
	map.put("TeachLeader", "Morufjon");
	map.put("CEO", "Kuzzat");
	map.put("ChicagoLeader", "Essen");
//	System.out.println(map);
//	
//	System.out.println(map.get("CEO"));
//	
//	System.out.println(map.containsKey("CEO1"));
//	System.out.println(map.containsValue("Kuzzat" ));
//	System.out.println(map.containsValue("Akbar"));
//	System.out.println(map.remove("CEO"));
//	Set<String> keys = map.keySet();
//	for(String key : keys) {
//		System.out.println(key + map.get(key));
//	}
//	
//	System.out.println(map.keySet());
//	System.out.println("-------------");
//	
//	System.out.println(map.entrySet());
//	
	Map <String, List<String>> position= new HashMap<String, List<String>>();
	List<String> name = new ArrayList<>();
	name.add( new String ("Essen"));
	name.add(new String ("Murodil"));
	position.put("JavaTeacher", name);
	System.out.println(map);
}
}
