package day5;

public class Human {

	public Human() {
		super();
		System.out.println("Human()");
	}

	private int foot = 2;

	protected String sname = "��";
	protected String sage;
	public boolean sex;

	void eat(String food) {
		System.out.println(sname + "��" + food);
	}

	public void walk() {
		System.out.println(sname + "��" + foot + "������·");
	}
}
