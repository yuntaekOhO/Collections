import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {

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
		
		System.out.println("get(key) "+hm.get("�ϳ�"));
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
		// HashMap ��� ��� ����
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("��", 1);
		hm2.put("��", 2);
		hm2.put("��", 3);
		hm.putAll(hm2);
		System.out.println("putAll() : "+hm);
		// HashMap�ȿ� �ٸ� HashMap ����
		
		System.out.println("values() : "+hm.values());
		// HashMap�� value���� �÷��� ���·� ���
		
		HashMap<String, Integer> hm3 = (HashMap<String, Integer>) hm.clone();
		System.out.println("clone() : "+hm3);
		// ���� �ٸ� HashMap�� ������ �����ϴ� HashMap�� ���� 
		
		hm3.put("��", 4);
		hm3.put("��", 5);
		Set<Entry<String, Integer>> set = hm3.entrySet();
		//Set set = hm3.entrySet() �� ����
		System.out.print("Set entrySet() : ");
		System.out.println(set);
		//HashMap�� ����� key,value ��Ʈ�� ���·� set�� ����
	}

}
