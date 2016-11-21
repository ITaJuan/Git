package day5;

public class Human {

	public Human() {
		super();
		System.out.println("Human()");
	}

	private int foot = 2;

	protected String sname = "人";
	protected String sage;
	public boolean sex;

	void eat(String food) {
		System.out.println(sname + "吃" + food);
	}

	public void walk() {
		System.out.println(sname + "用" + foot + "条腿走路");
	}
}
