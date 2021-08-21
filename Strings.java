
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
		String str = "안녕하세요";

		System.out.println("str : "+str);
		
		System.out.println("str.startsWith('하') 지정한 문자열로 시작하는지 판단 : "+str.startsWith("하"));
		System.out.println("str.startsWith('안') 지정한 문자열로 시작하는지 판단 : "+str.startsWith("안")+"\n");
		
		System.out.println("str.endsWith('세') 지정한 문자열로 끝나는지 판단 : "+str.endsWith("세"));
		System.out.println("str.endsWith('요') 지정한 문자열로 끝나는지 판단 : "+str.endsWith("요")+"\n");
		
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str.equals(str1) 두개의 문자열에 값만 비교해서 같은지 판단 : "+str.equals(str1));
		System.out.println("str.equals(str2) 두개의 문자열에 값만 비교해서 같은지 판단 : "+str.equals(str2)+"\n");
		
		System.out.println("str.indexOf('하') 지정된 문자가 문자열에 몇번째에 있는지 반환 : "+str.indexOf("하"));
		System.out.println("str.indexOf(2) 지정된 문자가 없으면 -1 반환 : "+str.indexOf(2)+"\n");
		
		String str3 = "123123123";
		System.out.println("str3 : "+str3);
		System.out.println("str3.lastIndexOf('1') 문자열에 지정한 문자가 마지막에 있는 위치를 반환 : "+str3.lastIndexOf("1"));
		
		System.out.println("str3.length() 문자열의 길이를 반환 : "+str3.length()+"\n");
		
		String str4 = "A*B*C*D";
		System.out.println("str4 : "+str4);
		System.out.println("str4.replace('*','-') 문자열에 지정한 문자가 있으면 새로 지정한 문자로 바꿔서 출력  : "+str4.replace("*","-")+"\n");
		
		String str5 = " AB CD ";
		System.out.println("str5 : "+str5);
		String replaceAll = str5.replaceAll(" ", "*");
		System.out.println("str5.replaceAll(정규식 or 기존문자, 대체문자) 공백을 *로 변환 : "+replaceAll);
		/* < 정규식 > 
		 * 	"[0-9]" : 모든 숫자
		 *  "." : 모든 문자
		 *  "[]"로 특수문자 인식 하는 법 : "[*]", "[+]", "[$]", "[|]"
		 *  ( ) { } [ ] ^ : 앞에 \\ 붙여서 사용
		 *  	ex) "\\(", "\\)", "\\{", "\\}", "\\[", "\\]", "\\^"
		 *  */
		
		System.out.println("trim() 문자열의 앞,뒤 공백을 지움 : "+str5.trim()+"\n");
		
		String str6 = "사과. 사과. 포도.";
		System.out.println("str6 : "+str6);
		String replaceFisrt = str6.replaceFirst("사과","수박");
		System.out.println("str6.replaceFirst('사과','수박') 문자열에서 처음으로 찾은 문자 하나만 변경 처리 : "+replaceFisrt+"\n");
		
		String str7 = "A:B:C:D:abcd";
		System.out.println("str7 : "+str7);
		String[] split = str7.split(":");
		System.out.println("str7.split(':') 지정한 문자로 문자열을 나눌수 있다 (배열로 반환) : "+ split[1]);
		
		String substring = str7.substring(0,5);
		System.out.println("str7.substring(0,5) 지정한 범위에 속하는 문자열 반환 시작 값은 포함 끝 값은 미포함 : "+substring);
		
		String toLowerCase = str7.toLowerCase();
		System.out.println("str7.toLowerCase() 대문자를 소문자로 변환 : "+toLowerCase);
		
		String toUpperCase = str7.toUpperCase();
		System.out.println("str7.toUpperCase() 소문자를 대문자로 변환 : "+toUpperCase+"\n");
		
		String str8 = "1234";
		System.out.println("str8 : "+str8);
		String toString = str8.toString();
		System.out.println("str8.toString() 문자열을 그대로 반환 : "+toString+"\n");
		
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("[ int i = "+i+" ], "+"[ long l = "+l+" ], "+"[ char c = "+c+" ]");
		System.out.println("valueOf() : 지정한 개체의 원시 값을 반환");
		System.out.println("valueOf(i) : " + String.valueOf(i));
		System.out.println("valueOf(l) : " + String.valueOf(l));
		System.out.println("valueOf(c) : " + String.valueOf(c)+"\n");
		
		String a = "A";
		String b = "B";
		System.out.println(a+" "+b+" ");
		int compareTo = a.compareTo(b);
		System.out.println("a.compareTo(b) : 두개의 문자열을 사전순으로 비교");
		System.out.println("두 문자열이 같으면 0 반환, 현재 문자열이 먼저 나오면 음수 반환, 현재 문자열이 나중에 나오면 양수 반환");
		if(compareTo > 0) {
			System.out.println(a+" > "+b);
		} else if(compareTo == 0) {
			System.out.println(a+" = "+b);
		} else {
			System.out.println(a+" < "+b);
		}
	}

}
