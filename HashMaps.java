import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println(hm.isEmpty()); //isEmpty() ��������� true /
		
		hm.put("�ϳ�", 1); // �ؽøʿ� ����
		hm.put("��", 2);
		hm.put("��", 3);
		System.out.println(hm.toString()); //����Ǵ� ����,��ġ ���� / hm.toString == hm
		
		System.out.println("�ؽ� ���� ������� : "+hm.size());
		
		System.out.println(hm.keySet()); // �ؽ� key set ����
		
		System.out.println(hm.get("�ϳ�")); // get(key) key�� value ����
		
		System.out.println(hm.containsKey("��")); // �ؽøʿ� �ش� key�� ������ true ����
		
		System.out.println(hm.containsValue(3));
	}

}
