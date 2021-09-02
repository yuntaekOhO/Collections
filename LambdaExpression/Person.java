package LambdaExpression;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

	public enum Gender {
		MALE, FEMALE
	}
	String name;
	LocalDate birthday;
	Gender gender;
	String email;
	
	public Person(String name, LocalDate birthday, Gender gender, String email) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public Gender getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		long years = birthday.until(LocalDate.now(), ChronoUnit.YEARS);//만 나이 ; until() = birthday에서 지금까지의 시간 
		return (int)years;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", email=" + email + "]";
	}
	
	public void printPerson() {
		System.out.println(this); // = toString()
	}
}
