package Synchronization;

public class SynchronizedRestroomEx {

	public static void main(String[] args) {
		//�Ѱ��� ȭ����� �����.
		SynchronizedRestroom restroom = new SynchronizedRestroom();
		
		//��� ������ 3���� 1���� ȭ����� �����Ѵ�.
		new Thread(new Person(restroom)).start();//Thread-0
		new Thread(new Person(restroom)).start();//Thread-1
		new Thread(new Person(restroom)).start();//Thread-2
	}

}

class SynchronizedRestroom {
	//����ȭ�� �޼���
	public void use() {
		System.out.format("%s : ȭ��ǿ� ����\n", Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
		}
		System.out.format("%s : ȭ��ǿ��� ���Դ�.\n", Thread.currentThread().getName());
	}
}

class Person implements Runnable {
	private SynchronizedRestroom restroom;
	
	public Person(SynchronizedRestroom restroom) {
		this.restroom = restroom;
	}

	@Override
	public void run() {
		restroom.use();
	}
}