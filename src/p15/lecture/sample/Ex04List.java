package p15.lecture.sample;

import java.util.ArrayList;
import java.util.List;

public class Ex04List {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("java", 100));
		list.add(new Student("spring", 200));
		list.add(new Student("servlet", 150));
		list.add(new Student("jsp", 70));
		list.add(new Student("html", 90));
		list.add(new Student("css", 170));
		
		Student max = maxScore(list);
		System.out.println(max.getName() + ":" + max.getScore());
	}
}

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}





