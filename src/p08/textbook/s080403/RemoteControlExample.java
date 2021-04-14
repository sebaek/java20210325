package p08.textbook.s080403;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	}
}
