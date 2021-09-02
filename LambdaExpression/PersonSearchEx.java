package LambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonSearchEx {

	/* ��� ����� �˻��ؼ� ���ǿ� �´� ����� ����ϴ� �޼��� */
	public void printPerson(List<Person> roster, CheckPerson tester) {
		for(Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}
	
	public void go() {
		List<Person> roster = new ArrayList<>();
		//TODO: roster�� ������� �ִ´�.
		Person a = new Person("jacob",LocalDate.now(),Person.Gender.MALE,"jacob1@naver.com");
		Person b = new Person("lisa",LocalDate.now(),Person.Gender.FEMALE,"list1@gmail.com");
		roster.add(a);
		roster.add(b);
		
		//13�� �̻� 20�� �̸��� ����� ���
		//1. functional interface�� ������ ���� Ŭ������ �����.
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
		
		//3. anonymous class�� �޼��� ���ڷ� �ִ´�.
		printPerson(roster, new CheckPerson() {

			@Override
			public boolean test(Person p) {
				return 13 <= p.getAge() && p.getAge()<20;
			}
			
		});
		
		//functional interface�� ������ ������Ʈ�� lambda expression ���� ���� �� �� �ִ�.
		//lambda expression�� �������̽� �̸��� �޼��� �̸��� ������ ���̴�.
		printPerson(roster, (p) -> {
			return 13 <= p.getAge() && p.getAge()<20;
		});
		
		//18�� �̻� ���� ����
		printPerson(roster, (p) -> {
			return p.getGender() == Person.Gender.FEMALE && p.getAge() >= 18;
		});
		
		//�̸����� gmail.com �� ���
		printPerson(roster, (p) -> {
			return p.getEmail().endsWith("@gmail.com");
		});
		
		//�̸��� jacob�� ���
		printPerson(roster, (p) -> {
			return "jacob".equals(p.getName());
		});
	}
	public static void main(String[] args) {
		new PersonSearchEx().go();
	}
 }
