package LambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonSearchEx {

	/* 사람 목록을 검색해서 조건에 맞는 사람을 출력하는 메서드 */
	public void printPerson(List<Person> roster, CheckPerson tester) {
		for(Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}
	
	public void go() {
		List<Person> roster = new ArrayList<>();
		//TODO: roster에 사람들을 넣는다.
		Person a = new Person("jacob",LocalDate.now(),Person.Gender.MALE,"jacob1@naver.com");
		Person b = new Person("lisa",LocalDate.now(),Person.Gender.FEMALE,"list1@gmail.com");
		roster.add(a);
		roster.add(b);
		
		//13세 이상 20세 미만인 사람을 출력
		//1. functional interface를 구현한 로컬 클래스를 만든다.
		class TeenAger implements CheckPerson {

			@Override
			public boolean test(Person p) {
				return 13 <= p.getAge() && p.getAge()<20;
			}
		}
		printPerson(roster, new TeenAger());
		
		//2. anonymous class
		CheckPerson teenAger = new CheckPerson() {

			@Override
			public boolean test(Person p) {
				return 13 <= p.getAge() && p.getAge()<20;
			}
		};
		printPerson(roster, teenAger);
		
		//3. anonymous class를 메서드 인자로 넣는다.
		printPerson(roster, new CheckPerson() {

			@Override
			public boolean test(Person p) {
				return 13 <= p.getAge() && p.getAge()<20;
			}
			
		});
		
		//functional interface를 구현한 오브젝트는 lambda expression 으로 변경 할 수 있다.
		//lambda expression은 인터페이스 이름과 메서드 이름을 생략한 것이다.
		printPerson(roster, (p) -> {
			return 13 <= p.getAge() && p.getAge()<20;
		});
		
		//18세 이상 성인 남자
		printPerson(roster, (p) -> {
			return p.getGender() == Person.Gender.FEMALE && p.getAge() >= 18;
		});
		
		//이메일이 gmail.com 인 사람
		printPerson(roster, (p) -> {
			return p.getEmail().endsWith("@gmail.com");
		});
		
		//이름이 jacob인 사람
		printPerson(roster, (p) -> {
			return "jacob".equals(p.getName());
		});
	}
	public static void main(String[] args) {
		new PersonSearchEx().go();
	}
 }
