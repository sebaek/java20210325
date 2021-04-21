package p11.lecture.object;

public class A07ToString {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		String s1 = o1.toString();
		System.out.println(s1);
		
		String s2 = o2.toString();
		System.out.println(s2);
		
		Student st1 = new Student(3, "donald");
		String str1 = st1.toString();
		System.out.println(str1);
		
		Student st2 = new Student(99, "trump");
		String str2 = st2.toString();
		System.out.println(st2);
		
		System.out.println(st1);
		System.out.println(st2);
	}
}

class Student {
	private int id;
	private String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String desc = "id : " + id + ", " + "name: " + name;
		
		return desc;
	}
}






