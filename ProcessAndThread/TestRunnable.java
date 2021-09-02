package ProcessAndThread;

class TimerRunnable implements Runnable {
//Runnable interface는 Functional interface : 갖고 있는 메서드가 run() 뿐임
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			}
		}
	}
	
}
public class TestRunnable {

	public static void main(String[] args) { //main Thread
		System.out.println("main 스레드 시작");
		Runnable r1 = new TimerRunnable();
		Thread t1 = new Thread(r1);
		t1.start(); //Thread-0
		
		new Thread(new TimerRunnable()).start(); //Thread-1
		
		//anonymous 
		new Thread(new Runnable() { // Thread-2

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
					}
				}
			}
			
		}).start();
		
		//Lambda expression
		new Thread(() -> { // Thread-3
			for(int i=0;i<5;i++) {
				System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
				}
			}
		}).start();
		
		System.out.println("main 스레드 끝");
	}

}
