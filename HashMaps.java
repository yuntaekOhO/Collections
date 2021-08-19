import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("isEmpty() : "+hm.isEmpty()); //isEmpty() 비어있으면 true /
		
		hm.put("하나", 1); // 해시맵에 저장
		hm.put("둘", 2);
		hm.put("셋", 3);
		System.out.println("toString() or hm :"+hm.toString());
		// key와 value 쌍으로 출력. 저장되는 순서,위치 랜덤.  hm.toString == hm
		
		System.out.println("size() : "+hm.size());
		// HashMap 크기 리턴
		System.out.println("keySet() : "+hm.keySet());
		// 해시 key set 리턴
		
		System.out.println("get(key) "+hm.get("하나"));
		// get(key) key로 value 리턴
		
		System.out.println("containsKey(key) : "+hm.containsKey("둘"));
		// 해시맵에 해당 key가 있으면 true 리턴
		
		System.out.println("containsValue(Value) : "+hm.containsValue(3));
		// 해시맵에 해당 value에 일치하는 key 있으면 true 리턴
		
		hm.remove("하나");
		System.out.println("remove(key) : "+hm);
		// 해당 key를 찾아 key와 Value 삭제
		
		hm.clear();
		System.out.println("clear() : "+hm);
		// HashMap 모든 요소 삭제
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("김", 1);
		hm2.put("나", 2);
		hm2.put("박", 3);
		hm.putAll(hm2);
		System.out.println("putAll() : "+hm);
		// HashMap안에 다른 HashMap 저장
		
		System.out.println("values() : "+hm.values());
		// HashMap의 value들을 컬렉션 형태로 출력
		
		HashMap<String, Integer> hm3 = (HashMap<String, Integer>) hm.clone();
		System.out.println("clone() : "+hm3);
		// 서로 다른 HashMap에 기존에 존재하던 HashMap을 복사 
		
		hm3.put("이", 4);
		hm3.put("윤", 5);
		Set<Entry<String, Integer>> set = hm3.entrySet();
		//Set set = hm3.entrySet() 와 같다
		System.out.print("Set entrySet() : ");
		System.out.println(set);
		//HashMap에 저장된 key,value 엔트리 형태로 set에 저장
	}

}
