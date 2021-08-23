public class StringBuilders {
	/* 
	 * 				 [String Ŭ������ ������ �޼ҵ�] 		{
	 * charAt() : Ư�� �ε��� ��ġ�� ���� ��ȯ
	 * indexOf(String str) : ������ str �˻��ؼ� �ش� ���� ��ġ ��ȯ
	 * lastIndexOf(String str) : ������ str�� ������ ��ġ ��ȯ
	 * length() : ���ڿ��� ���� ��ȯ
	 * toString() : ����� ���ڿ��� ������ ���� String �ν��Ͻ��� ���� �� ��ȯ
	 * substring(int start, int end) : start��ġ ���� end��ġ �������� ���븸 ����
	 * }
	 * 
	 * append(boolean, char, double, float, int, Object, String)
	 * delete(int start, int end) : start ��ġ���� end ��ġ ������ ����
	 * insert(int offset, String str) : ���� sb�� offset��ġ�� ���ο� str ����
	 * replace(int start, int end, String str) : start��ġ ���� end��ġ ������ ���ο� str�� ��ü
	 * 			   �� String�� replace()�� �Ű����� type�� �ٸ�  String�� (String, String)
	 * reverse() : sb �� ����� ���ڿ� ������
	 * capacity() : StringBuilder�� �뷮 String Ŭ������ �ٸ��� char[] �迭 ����� �����ְ� ��Ƶ� 
	 * 			   �� append()�� ���ڿ� ������ �� �迭 ������ �ڵ� ����� byte ����
	 * deleteCharAt(int index) : ������ index ��ġ�� ���ڸ� ���� ; delete()���� ������ �ѱ��ڸ� ��°Ͱ� ������ ȿ��
	 * setCharAt(int index, char c) : Ư�� index ��ġ�� ���ڸ� c�� ���� (�ѱ��ڸ�)
	 * 			   �� insert()�� ���� ���ڿ� �߰��� �����̶�� setCharAt()�� �ش� ��ġ�� ���ڸ� '����' ����
	 * trimToSize() : ���ڿ��� ����� char[]�迭 ����� ���� ���ڿ� ���̿� �����ϰ� ����
	 * 			   �� String Ŭ������ trim()�� �� �� ������ �����ϴ� �Ͱ� ���� ���� ����� ����
	 * 			   �� �迭�� ���� ������� �����̹Ƿ� ���ڿ� �޺κ��� ������ ��� �����ϴ� �Ͱ� ����
	 * */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		boolean bool = true;
		sb.append(bool);
		System.out.println("append(boolean b) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		
		char c = 'c';
		sb.append(c);
		System.out.println("append(char c) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		
		double d = 1.231514;
		sb.append(d);
		System.out.println("append(double d) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		
		float f = 999999999;
		sb.append(f);
		System.out.println("append(float f) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		
		int i = 5515;
		sb.append(i);
		System.out.println("append(int i) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int start, int end) : StringBuilder ���� ����"+sb);
		
		Object obj = new Object();
		sb.append(obj.toString());
		System.out.println("append(object) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		
		String str = "�ȳ��ϼ���";
		sb.append(str);
		System.out.println("append(String str) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder ���� ����"+sb);
		System.out.println();
		
		String str1 = "�ݰ�����";
		sb.append(str);
		sb.insert(5, str1);
		System.out.println("insert(int offset, String str) : "+sb+"\n");
		
		sb.replace(3, 5, "�ʴϱ� ");
		System.out.println("replace(int strat, int end, String str) : "+sb+"\n");
		//start ���� end �� ���� 
		
		sb.reverse();
		System.out.println("reverse() ����� ���ڿ��� ������ ������ : "+sb+"\n");
		
		sb.delete(0, sb.length());
		sb.append(str);
		System.out.println("substring(int start, int end) ������ �ش��ϴ� ���븸 ���� : "+sb.substring(0, 2)+"\n");
		
		sb.delete(0, sb.length());
		int cc = 'a';
		sb.append(cc);
		System.out.println("toString() character 'a'�� int type�� ������ �� String type���� casting : "+sb.toString()+"\n");
		
		System.out.println("sb = 'a'(97) length() : "+sb.length());
		System.out.println("sb = 'a'(97) capacity() sb�� �뷮 : "+sb.capacity()+"\n");
		
		sb.deleteCharAt(0);
		System.out.println("deleteCharAt(int index) : "+sb+"\n");
		
		sb.setCharAt(0, '1');
		System.out.println("setCharAt(int index, char c) �ش� ��ġ�� ���ڸ� ������ ���ڷ� ���� : "+sb+"\n");
		
		sb.delete(0, sb.length());
		String hi = "Hello!!!!!!!!";
		sb.append(hi);
		System.out.println("sb = "+sb+", sb.length = "+sb.length());
		sb.setLength(20);
		System.out.println("setLength(20) = "+sb+"; ���� ������ �������� ä��");
		sb.setLength(5);
		System.out.println("setLength(5) = "+sb+"; ���� ���ڿ����� ª�� �����ϸ� ������ ���ڴ� ����"+"\n");
		
		System.out.println(sb+" = length() : "+sb.length());
		System.out.println("capacity() : "+sb.capacity());
		sb.trimToSize();
		System.out.println("trimToSize() capacity�� ���� ���̿� ���°� ������ : "+sb.capacity());
		System.out.println(" �� �迭�� ���� ������� �����̹Ƿ� trim()���� ���ڿ� �޺κ��� ������ ��� �����ϴ� �Ͱ� ����");
		

	}

}
