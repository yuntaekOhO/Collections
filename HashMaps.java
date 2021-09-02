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
		
		System.out.println("isEmpty() : "+hm.isEmpty()); //isEmpty() ��������� true /
		
		hm.put("�ϳ�", 1); // �ؽøʿ� ����
		hm.put("��", 2);
		hm.put("��", 3);
		System.out.println("toString() or hm :"+hm.toString());
		// key�� value ������ ���. ����Ǵ� ����,��ġ ����.  hm.toString == hm
		
		System.out.println("size() : "+hm.size());
		// HashMap ũ�� ����
		System.out.println("keySet() : "+hm.keySet());
		// �ؽ� key set ����
		
		System.out.println("get(key) : "+hm.get("�ϳ�"));
		// get(key) key�� value ����
		
		System.out.println("containsKey(key) : "+hm.containsKey("��"));
		// �ؽøʿ� �ش� key�� ������ true ����
		
		System.out.println("containsValue(Value) : "+hm.containsValue(3));
		// �ؽøʿ� �ش� value�� ��ġ�ϴ� key ������ true ����
		
		hm.remove("�ϳ�");
		System.out.println("remove(key) : "+hm);
		// �ش� key�� ã�� key�� Value ����
		
		hm.clear();
		System.out.println("clear() : "+hm);
		// HashMap ��� ��ü ��� ����
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("��", 1);
		hm2.put("��", 2);
		hm2.put("��", 3);
		hm.putAll(hm2);
		System.out.println("putAll() : "+hm);
		// HashMap�ȿ� �ٸ� HashMap ����
		
		System.out.println("values() : "+hm.values());
		// HashMap�� value���� �÷��� ���·� ���
		
		HashMap<String, Integer> hm3 = (HashMap<String, Integer>)hm.clone();
		System.out.println("clone() : "+hm3);
		// ���� �ٸ� HashMap�� ������ �����ϴ� HashMap�� ���� 
		
		hm3.put("��", 4);
		hm3.put("��", 5);
		Set<Entry<String, Integer>> set = hm3.entrySet();
		//Set set = hm3.entrySet() �� ����
		System.out.println("Set entrySet() : " + set);
		//HashMap�� ����� key,value ��Ʈ�� ���·� set�� ����
		
		System.out.println("getOrDefault() - ã�� Ű(��) ���� : "+hm3.getOrDefault("��", 0) +
				", ã�� Ű(��) ���� : "+hm3.getOrDefault("��", 0));
		// ã�� key�� �����Ѵٸ� ã�� key�� value ����, ���ٸ� default ����
		// getOrDefault(search key, default value)
		
		hm3.putIfAbsent("��", 6);
		System.out.println("putIfAbsent(��, 6) = key ���� ���� value : "+hm3.putIfAbsent("��", 6));
		System.out.println("putIfAbsent(��, 6) = key (��) ���� �߰� �� : "+hm3);
		//key�� ������ �ش� key�� value ���� ,
		//key�� ������ key�� value �߰�
		
		hm3.put("A", 7);
		System.out.println("�ش� key (A)�� �� ���� value = "+hm3.compute("A", (s, integer) -> integer+1));
		System.out.println("compute(key, (type) -> Function) : "+hm3);
		//key�� ���� ���ؼ� ��� �������� �����Ѵ�. ������ Ű�� ���� ���� ���� ��� V�� null�� �����ȴ�.
		
		hm3.computeIfAbsent("A", key -> 10); //key�� A�ΰ��� ����  
		hm3.computeIfAbsent("B", key -> 10); //key�� B�ΰ��� ���� = key "B" ����� value 10 
		System.out.println("computeIfAbsent(key, key -> 10) �� get(A) : "+hm3.get("A"));	// =value 8
		System.out.println("computeIfAbsent(key, key -> 10) �� get(B) : "+hm3.get("B"));	// =value 10
		System.out.println("computeIfAbsent(key, Function) ���� �� : "+hm3);
		//compute�� ����ϴ�. key ���� ���� ��쿡 function ����.
		
		System.out.println("key= B �� ������ function ����"+hm3.computeIfPresent("B", (s, number) -> number*number));
		System.out.println("key= C ��� function �̼��� "+hm3.computeIfPresent("C", (s, number) -> 20));
		System.out.println("computeIfPresent(key, (type) -> function) : "+hm3);
		//key "B"�� ������ Function ����
		
		TreeMap sortedMap = new TreeMap(hm3);
		System.out.println("TreeMap�� �̿��� key ���� : "+sortedMap);
		//key�� ������� ����
	}

}
