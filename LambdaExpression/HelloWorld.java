package LambdaExpression;

public class HelloWorld {

	public void go() {
		//���� �λ縦 �ϱ� ���ؼ� Greeting�� ������ �����λ� ���� Ŭ������ �����.
		class EnglishGreeting implements Greeting{

			@Override
			public void greet() {
				System.out.println("Hello.");
			}
		}
		Greeting englishGreeting = new EnglishGreeting();
		sayHello(englishGreeting); // Hello.
		
		//�������� �λ�� Anonymous class ���!
		Greeting frenchGreeting = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Bonjour.");
			}
		};
		sayHello(frenchGreeting); //Bonjour.
		
		//�����ξ� �λ�� anonymous class�� �޼��� ���ڿ� ���� ����
		sayHello(new Greeting() {

			@Override
			public void greet() {
				System.out.println("Hola.");
			}
		}); //Hola
		
		//�ѱ��� �λ�� Lambda expression, anonymous class ���
		//Functional interface ����ϱ� ������ �޼��� �̸�(Greeting .. = new Greet) ���� �����ϴ�.
		//why? -> Functional interface�� �޼��尡 �ϳ�!
		//Lambda expression�� anonymous class�� ��� ��� �����ϴ�.
		sayHello(/*Lambda start*/() -> {
			System.out.println("�ȳ��ϼ���."); //�ȳ��ϼ���.
		}/*Lambda end */);
	}
	
	public void sayHello(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		new HelloWorld().go();
	}

}
