package p12.lecture;

public class A11ThreadPriority {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Thread11());
			if (i == 0) {
				t.setPriority(10);
			} else {
				t.setPriority(1);
			}
			t.start();
		}
	}
}

class Thread11 implements Runnable {
	@Override
	public void run() {
		for (long i = 0; i < 10_0000_0000L; i++) {
			
		}
		System.out.println(Thread.currentThread().getName());
	}
}





