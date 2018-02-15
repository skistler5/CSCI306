// Authors: Stephen Kistler, Sarah McCabe

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	//toString - figure 1 format
	@Override
	public String toString() {
		return name + score;
	}

	//compare students by scores
	@Override
	public int compareTo(Student compareStudent) {
		return (score - compareStudent.score);
	}

}
