package day4.day4_work;

public class Student {

	public static String name;
	public static int age;
	public int score;

	public Student() {
		super();
	}

	public Student(int score) {
		super();
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static void name(String Name) {
		name = Name;
		
	}
	public static int age(int Age) {
		return age = Age;
	}
	public  int score(int Score) {
		return score = Score;
	}

}
