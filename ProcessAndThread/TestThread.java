package ProcessAndThread;

class TimerThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000); // ms ����
			} catch(InterruptedException e) {
				
			}
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		System.out.format("%s : ���� �����带 �����մϴ�.\n", Thread.currentThread().getName());
		Thread t1 = new TimerThread();
		t1.start();
		
		new TimerThread().start();
		System.out.format("%s : ���� �����尡 �����մϴ�.\n", Thread.currentThread().getName());
		//main thread ���� ���� -> t1 thread-0 / thread-1����
	}

}
