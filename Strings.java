
public class Strings {
	/* 
	 * boolean startsWith()		boolean endsWith()		boolean equals()
	 * int indexOf()			int lastindexOf()		int length()
	 * String replace()			String replaceAll()		String trim()
	 * String split()			String substring()		StringLowerCase()
	 * String toUpperCase()		String toString()		String valueOf()
	 * int compareTo()			
	 * */
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";

		System.out.println("str : "+str);
		
		System.out.println("str.startsWith('��') ������ ���ڿ��� �����ϴ��� �Ǵ� : "+str.startsWith("��"));
		System.out.println("str.startsWith('��') ������ ���ڿ��� �����ϴ��� �Ǵ� : "+str.startsWith("��")+"\n");
		
		System.out.println("str.endsWith('��') ������ ���ڿ��� �������� �Ǵ� : "+str.endsWith("��"));
		System.out.println("str.endsWith('��') ������ ���ڿ��� �������� �Ǵ� : "+str.endsWith("��")+"\n");
		
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str.equals(str1) �ΰ��� ���ڿ��� ���� ���ؼ� ������ �Ǵ� : "+str.equals(str1));
		System.out.println("str.equals(str2) �ΰ��� ���ڿ��� ���� ���ؼ� ������ �Ǵ� : "+str.equals(str2)+"\n");
		
		System.out.println("str.indexOf('��') ������ ���ڰ� ���ڿ��� ���°�� �ִ��� ��ȯ : "+str.indexOf("��"));
		System.out.println("str.indexOf(2) ������ ���ڰ� ������ -1 ��ȯ : "+str.indexOf(2)+"\n");
		
		String str3 = "123123123";
		System.out.println("str3 : "+str3);
		System.out.println("str3.lastIndexOf('1') ���ڿ��� ������ ���ڰ� �������� �ִ� ��ġ�� ��ȯ : "+str3.lastIndexOf("1"));
		
		System.out.println("str3.length() ���ڿ��� ���̸� ��ȯ : "+str3.length()+"\n");
		
		String str4 = "A*B*C*D";
		System.out.println("str4 : "+str4);
		System.out.println("str4.replace('*','-') ���ڿ��� ������ ���ڰ� ������ ���� ������ ���ڷ� �ٲ㼭 ���  : "+str4.replace("*","-")+"\n");
		
		String str5 = " AB CD ";
		System.out.println("str5 : "+str5);
		String replaceAll = str5.replaceAll(" ", "*");
		System.out.println("str5.replaceAll(���Խ� or ��������, ��ü����) ������ *�� ��ȯ : "+replaceAll);
		/* < ���Խ� > 
		 * 	"[0-9]" : ��� ����
		 *  "." : ��� ����
		 *  "[]"�� Ư������ �ν� �ϴ� �� : "[*]", "[+]", "[$]", "[|]"
		 *  ( ) { } [ ] ^ : �տ� \\ �ٿ��� ���
		 *  	ex) "\\(", "\\)", "\\{", "\\}", "\\[", "\\]", "\\^"
		 *  */
		
		System.out.println("trim() ���ڿ��� ��,�� ������ ���� : "+str5.trim()+"\n");
		
		String str6 = "���. ���. ����.";
		System.out.println("str6 : "+str6);
		String replaceFisrt = str6.replaceFirst("���","����");
		System.out.println("str6.replaceFirst('���','����') ���ڿ����� ó������ ã�� ���� �ϳ��� ���� ó�� : "+replaceFisrt+"\n");
		
		String str7 = "A:B:C:D:abcd";
		System.out.println("str7 : "+str7);
		String[] split = str7.split(":");
		System.out.println("str7.split(':') ������ ���ڷ� ���ڿ��� ������ �ִ� (�迭�� ��ȯ) : "+ split[1]);
		
		String substring = str7.substring(0,5);
		System.out.println("str7.substring(0,5) ������ ������ ���ϴ� ���ڿ� ��ȯ ���� ���� ���� �� ���� ������ : "+substring);
		
		String toLowerCase = str7.toLowerCase();
		System.out.println("str7.toLowerCase() �빮�ڸ� �ҹ��ڷ� ��ȯ : "+toLowerCase);
		
		String toUpperCase = str7.toUpperCase();
		System.out.println("str7.toUpperCase() �ҹ��ڸ� �빮�ڷ� ��ȯ : "+toUpperCase+"\n");
		
		String str8 = "1234";
		System.out.println("str8 : "+str8);
		String toString = str8.toString();
		System.out.println("str8.toString() ���ڿ��� �״�� ��ȯ : "+toString+"\n");
		
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("[ int i = "+i+" ], "+"[ long l = "+l+" ], "+"[ char c = "+c+" ]");
		System.out.println("valueOf() : ������ ��ü�� ���� ���� ��ȯ");
		System.out.println("valueOf(i) : " + String.valueOf(i));
		System.out.println("valueOf(l) : " + String.valueOf(l));
		System.out.println("valueOf(c) : " + String.valueOf(c)+"\n");
		
		String a = "A";
		String b = "B";
		System.out.println(a+" "+b+" ");
		int compareTo = a.compareTo(b);
		System.out.println("a.compareTo(b) : �ΰ��� ���ڿ��� ���������� ��");
		System.out.println("�� ���ڿ��� ������ 0 ��ȯ, ���� ���ڿ��� ���� ������ ���� ��ȯ, ���� ���ڿ��� ���߿� ������ ��� ��ȯ");
		if(compareTo > 0) {
			System.out.println(a+" > "+b);
		} else if(compareTo == 0) {
			System.out.println(a+" = "+b);
		} else {
			System.out.println(a+" < "+b);
		}
	}

}
