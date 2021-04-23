package p12.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class A12Concurrency {

	static long shareValue = 0;
	static AtomicInteger sv = new AtomicInteger();
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					shareValue++;
					sv.incrementAndGet();
				}
			}
		});
		t.start();
		
		for (int i = 0 ; i < 100_0000; i++) {
			shareValue++;
			sv.incrementAndGet();
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(shareValue);
		System.out.println(sv.get());
		
	}
}






