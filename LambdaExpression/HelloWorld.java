package LambdaExpression;

public class HelloWorld {

	public void go() {
		//영어 인사를 하기 위해서 Greeting을 구현한 영어인사 로컬 클래스를 만든다.
		class EnglishGreeting implements Greeting{

			@Override
			public void greet() {
				System.out.println("Hello.");
			}
		}
		Greeting englishGreeting = new EnglishGreeting();
		sayHello(englishGreeting); // Hello.
		
		//프랑스어 인사는 Anonymous class 사용!
		Greeting frenchGreeting = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Bonjour.");
			}
		};
		sayHello(frenchGreeting); //Bonjour.
		
		//스페인어 인사는 anonymous class를 메서드 인자에 직접 삽입
		sayHello(new Greeting() {

			@Override
			public void greet() {
				System.out.println("Hola.");
			}
		}); //Hola
		
		//한국어 인사는 Lambda expression, anonymous class 사용
		//Functional interface 사용하기 때문에 메서드 이름(Greeting .. = new Greet) 생략 가능하다.
		//why? -> Functional interface는 메서드가 하나!
		//Lambda expression은 anonymous class일 경우 사용 가능하다.
		sayHello(/*Lambda start*/() -> {
			System.out.println("안녕하세요."); //안녕하세요.
		}/*Lambda end */);
	}
	
	public void sayHello(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		new HelloWorld().go();
	}

}
