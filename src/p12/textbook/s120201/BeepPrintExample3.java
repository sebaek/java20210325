package p12.textbook.s120201;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			// 작성....
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
