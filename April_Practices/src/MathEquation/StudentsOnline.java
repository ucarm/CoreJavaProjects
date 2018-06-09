package MathEquation;

public class StudentsOnline {
	private String name;
	private int webinarId;
	
	
	public StudentsOnline(String name, int webinarId) {
		this.name = name;
		this.webinarId = webinarId;
	}

	public String toString() {
		return name+webinarId;
	}
	
}
