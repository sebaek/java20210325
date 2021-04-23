package p12.lecture;

public class A14SynchronizedMethod {
	
}

class Thread14 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		box.update(100);
	}
}

class Thread15 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		box.update(50);
	}
}


class Box {
	public int i;
	
	public void update(int i) {
		this.i = i;
	}
}











