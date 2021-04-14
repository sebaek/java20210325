package p08.textbook.s080401;

import p08.textbook.s080205.RemoteControl;
import p08.textbook.s080301.Audio;
import p08.textbook.s080301.Television;
import p08.textbook.s080303.Searchable;
import p08.textbook.s080303.SmartTelevision;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable s1 = new SmartTelevision();
		s1.search("daum");
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof SmartTelevision);
		System.out.println(rc instanceof Searchable);
	}
}















