package day7;

import org.junit.Test;

public class TestFactory {

	public void noFactory() {
		�ղ� tn = new �ղ�();
		tn.setName("����");
		tn.setSpeed(200);
		tn.run();
	}

	@Test
	public void useFactory() {

		IBuildCarFactory cf = �ղ�����Factory.getInstance();

		ICar car = cf.buyCar("����");
		// car.run();

		ICar car2 = cf.buyCar("CRV");
		ICar car3 = cf.buyCar("CRV");
		car2.run();
		System.out.println("car2.equals(car3)=" + car2.equals(car3));
		// ����ת�� ���ʵ�wheel����
		���� car2���� = (����) car2;
		���� car3���� = (����) car3;

		car2����.wheels.set��̥("����˹ͨ");

		System.out.println("car2����.wheels.get��̥()=" + car2����.wheels.get��̥());
		System.out.println("car3����.wheels.get��̥()=" + car3����.wheels.get��̥());

		System.out.println("car2����.wheels.equals(car3����.wheels)="
				+ car2����.wheels.equals(car3����.wheels));

		cf = new ѩ��������();
		ICar carx = cf.buyCar("����");
		carx.run();
	}

}
