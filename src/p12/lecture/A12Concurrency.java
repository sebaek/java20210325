package p12.lecture;

public class A12Concurrency {

	static long shareValue = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					shareValue++;
				}
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(shareValue);
		
	}
}






