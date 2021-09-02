import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMaps {
	/* 
	 * 			  	< HashMap >
	 * isEmpty()	toString()	size()
	 * keySet()		get(key)		containsKey(key)
	 * containsValue(value)	remove(key)	clear()
	 * putAll(HashMap)		values()	clone()
	 * entrySet()	getOrDefault()		putIfAbsent(key, value)
	 * compute(key, (type) -> Function)		computeIfAbsent(key, Function)
	 * computeIfPresent(key, (type) -> function)	TreeMap
	 * */
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		
		System.out.println("get(key) : "+hm.get("하나"));
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
		// HashMap 모든 객체 요소 삭제
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("김", 1);
		hm2.put("나", 2);
		hm2.put("박", 3);
		hm.putAll(hm2);
		System.out.println("putAll() : "+hm);
		// HashMap안에 다른 HashMap 저장
		
		System.out.println("values() : "+hm.values());
		// HashMap의 value들을 컬렉션 형태로 출력
		
		HashMap<String, Integer> hm3 = (HashMap<String, Integer>)hm.clone();
		System.out.println("clone() : "+hm3);
		// 서로 다른 HashMap에 기존에 존재하던 HashMap을 복사 
		
		hm3.put("이", 4);
		hm3.put("윤", 5);
		Set<Entry<String, Integer>> set = hm3.entrySet();
		//Set set = hm3.entrySet() 와 같다
		System.out.println("Set entrySet() : " + set);
		//HashMap에 저장된 key,value 엔트리 형태로 set에 저장
		
		System.out.println("getOrDefault() - 찾는 키(이) 있음 : "+hm3.getOrDefault("이", 0) +
				", 찾는 키(오) 없음 : "+hm3.getOrDefault("오", 0));
		// 찾는 key가 존재한다면 찾는 key의 value 리턴, 없다면 default 리턴
		// getOrDefault(search key, default value)
		
		hm3.putIfAbsent("송", 6);
		System.out.println("putIfAbsent(윤, 6) = key 있음 원래 value : "+hm3.putIfAbsent("윤", 6));
		System.out.println("putIfAbsent(송, 6) = key (송) 없음 추가 됨 : "+hm3);
		//key값 있으면 해당 key의 value 리턴 ,
		//key값 없으면 key와 value 추가
		
		hm3.put("A", 7);
		System.out.println("해당 key (A)의 값 변경 value = "+hm3.compute("A", (s, integer) -> integer+1));
		System.out.println("compute(key, (type) -> Function) : "+hm3);
		//key의 값에 대해서 어떻게 연산할지 정의한다. 기존의 키에 대한 값이 없는 경우 V는 null로 생성된다.
		
		hm3.computeIfAbsent("A", key -> 10); //key가 A인것은 있음  
		hm3.computeIfAbsent("B", key -> 10); //key가 B인것은 없음 = key "B" 만들고 value 10 
		System.out.println("computeIfAbsent(key, key -> 10) 후 get(A) : "+hm3.get("A"));	// =value 8
		System.out.println("computeIfAbsent(key, key -> 10) 후 get(B) : "+hm3.get("B"));	// =value 10
		System.out.println("computeIfAbsent(key, Function) 실행 후 : "+hm3);
		//compute와 비슷하다. key 값이 없을 경우에 function 실행.
		
		System.out.println("key= B 가 있으면 function 수행"+hm3.computeIfPresent("B", (s, number) -> number*number));
		System.out.println("key= C 없어서 function 미수행 "+hm3.computeIfPresent("C", (s, number) -> 20));
		System.out.println("computeIfPresent(key, (type) -> function) : "+hm3);
		//key "B"가 있으면 Function 실행
		
		TreeMap sortedMap = new TreeMap(hm3);
		System.out.println("TreeMap을 이용한 key 정렬 : "+sortedMap);
		//key의 순서대로 정렬
	}

}
