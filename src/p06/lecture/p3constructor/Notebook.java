package p06.lecture.p3constructor;

public class Notebook {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Notebook() {
		this.model = "hp";
		this.memory = 8;
		this.cpu = "amd";
		this.ssd = 128;
	}
	
	Notebook(String model, int memory) {
		/*
		this.model = model;
		this.memory = memory;
		this.cpu = "amd";
		this.ssd = 128;
		*/
		this(model, memory, "amd", 128);
	}
	
	Notebook(String model, int memory, String cpu) {
		/*
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
		*/
		this(model, memory, cpu, 128);
		
	}
	
	Notebook(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
}










