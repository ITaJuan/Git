package day5;

public abstract class Teacher extends Human {

	public abstract void teach();

	// �����и�����ͬ��ͬ���͵ı������߷���������������
	// protected String sname;

	public Teacher() {
		super();
		System.out.println("Teacher()");
	}

	String subject;

	/*
	 * public void teach() { //super����ģ�this�Լ���
	 * System.out.println(this.sname+"����"+subject); //
	 * System.out.println(super.sname); }
	 */

	void eat(String food) {
		if ("ƻ��".equals(food)) {
			System.out.println(sname + "��" + food);
		} else {
			super.eat(food);
		}
	}

}
