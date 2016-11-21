package day5;

public abstract class Teacher extends Human {

	public abstract void teach();

	// 子类中跟父类同名同类型的变量或者方法，将发生覆盖
	// protected String sname;

	public Teacher() {
		super();
		System.out.println("Teacher()");
	}

	String subject;

	/*
	 * public void teach() { //super父类的，this自己的
	 * System.out.println(this.sname+"讲授"+subject); //
	 * System.out.println(super.sname); }
	 */

	void eat(String food) {
		if ("苹果".equals(food)) {
			System.out.println(sname + "吃" + food);
		} else {
			super.eat(food);
		}
	}

}
