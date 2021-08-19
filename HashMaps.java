import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println(hm.isEmpty()); //isEmpty() 비어있으면 true /
		
		hm.put("하나", 1); // 해시맵에 저장
		hm.put("둘", 2);
		hm.put("셋", 3);
		System.out.println(hm.toString()); //저장되는 순서,위치 랜덤 / hm.toString == hm
		
		System.out.println("해시 맵의 사이즈는 : "+hm.size());
		
		System.out.println(hm.keySet()); // 해시 key set 리턴
		
		System.out.println(hm.get("하나")); // get(key) key로 value 리턴
		
		System.out.println(hm.containsKey("둘")); // 해시맵에 해당 key가 있으면 true 리턴
		
		System.out.println(hm.containsValue(3));
	}

}
