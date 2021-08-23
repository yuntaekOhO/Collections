public class StringBuilders {
	/* 
	 * 				 [String 클래스와 동일한 메소드] 		{
	 * charAt() : 특정 인덱스 위치의 문자 반환
	 * indexOf(String str) : 지정한 str 검색해서 해당 문자 위치 반환
	 * lastIndexOf(String str) : 지정한 str의 마지막 위치 반환
	 * length() : 문자열의 길이 반환
	 * toString() : 저장된 문자열의 내용을 담은 String 인스턴스의 생성 및 반환
	 * substring(int start, int end) : start위치 부터 end위치 전까지의 내용만 저장
	 * }
	 * 
	 * append(boolean, char, double, float, int, Object, String)
	 * delete(int start, int end) : start 위치부터 end 위치 전까지 삭제
	 * insert(int offset, String str) : 기존 sb에 offset위치에 새로운 str 삽입
	 * replace(int start, int end, String str) : start위치 부터 end위치 전까지 새로운 str로 대체
	 * 			   ㄴ String의 replace()와 매개변수 type이 다름  String은 (String, String)
	 * reverse() : sb 에 저장된 문자열 뒤집음
	 * capacity() : StringBuilder의 용량 String 클래스와 다르게 char[] 배열 사이즈를 여유있게 잡아둠 
	 * 			   ㄴ append()등 문자열 조정할 때 배열 사이즈 자동 변경됨 byte 단위
	 * deleteCharAt(int index) : 지정한 index 위치의 문자만 삭제 ; delete()에서 범위를 한글자만 잡는것과 동일한 효과
	 * setCharAt(int index, char c) : 특정 index 위치의 문자를 c로 변경 (한글자만)
	 * 			   ㄴ insert()가 원본 문자열 중간에 삽입이라면 setCharAt()은 해당 위치의 문자를 '변경' 해줌
	 * trimToSize() : 문자열이 저장된 char[]배열 사이즈를 현재 문자열 길이와 동일하게 조정
	 * 			   ㄴ String 클래스의 trim()의 앞 뒤 공백을 제거하는 것과 같이 공백 사이즈를 제거
	 * 			   ㄴ 배열의 남는 사이즈는 공백이므로 문자열 뒷부분의 공백을 모두 제거하는 것과 같음
	 * */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		boolean bool = true;
		sb.append(bool);
		System.out.println("append(boolean b) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		
		char c = 'c';
		sb.append(c);
		System.out.println("append(char c) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		
		double d = 1.231514;
		sb.append(d);
		System.out.println("append(double d) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		
		float f = 999999999;
		sb.append(f);
		System.out.println("append(float f) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		
		int i = 5515;
		sb.append(i);
		System.out.println("append(int i) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int start, int end) : StringBuilder 내용 삭제"+sb);
		
		Object obj = new Object();
		sb.append(obj.toString());
		System.out.println("append(object) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		
		String str = "안녕하세요";
		sb.append(str);
		System.out.println("append(String str) : "+sb);
		sb.delete(0,sb.length());
		System.out.println("delete(int strat, int end) : StringBuilder 내용 삭제"+sb);
		System.out.println();
		
		String str1 = "반가워요";
		sb.append(str);
		sb.insert(5, str1);
		System.out.println("insert(int offset, String str) : "+sb+"\n");
		
		sb.replace(3, 5, "십니까 ");
		System.out.println("replace(int strat, int end, String str) : "+sb+"\n");
		//start 부터 end 전 까지 
		
		sb.reverse();
		System.out.println("reverse() 저장된 문자열의 내용을 뒤집음 : "+sb+"\n");
		
		sb.delete(0, sb.length());
		sb.append(str);
		System.out.println("substring(int start, int end) 범위의 해당하는 내용만 저장 : "+sb.substring(0, 2)+"\n");
		
		sb.delete(0, sb.length());
		int cc = 'a';
		sb.append(cc);
		System.out.println("toString() character 'a'를 int type에 저장한 걸 String type으로 casting : "+sb.toString()+"\n");
		
		System.out.println("sb = 'a'(97) length() : "+sb.length());
		System.out.println("sb = 'a'(97) capacity() sb의 용량 : "+sb.capacity()+"\n");
		
		sb.deleteCharAt(0);
		System.out.println("deleteCharAt(int index) : "+sb+"\n");
		
		sb.setCharAt(0, '1');
		System.out.println("setCharAt(int index, char c) 해당 위치의 문자를 지정한 문자로 변경 : "+sb+"\n");
		
		sb.delete(0, sb.length());
		String hi = "Hello!!!!!!!!";
		sb.append(hi);
		System.out.println("sb = "+sb+", sb.length = "+sb.length());
		sb.setLength(20);
		System.out.println("setLength(20) = "+sb+"; 남는 공간은 공백으로 채움");
		sb.setLength(5);
		System.out.println("setLength(5) = "+sb+"; 현재 문자열보다 짧게 조정하면 나머지 문자는 삭제"+"\n");
		
		System.out.println(sb+" = length() : "+sb.length());
		System.out.println("capacity() : "+sb.capacity());
		sb.trimToSize();
		System.out.println("trimToSize() capacity를 현재 길이에 딱맞게 맞춰줌 : "+sb.capacity());
		System.out.println(" ㄴ 배열의 남는 사이즈는 공백이므로 trim()으로 문자열 뒷부분의 공백을 모두 제거하는 것과 같음");
		

	}

}
