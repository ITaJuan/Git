package day7;

import org.junit.Test;

public class TestFactory {

	public void noFactory() {
		日产 tn = new 日产();
		tn.setName("天籁");
		tn.setSpeed(200);
		tn.run();
	}

	@Test
	public void useFactory() {

		IBuildCarFactory cf = 日产汽车Factory.getInstance();

		ICar car = cf.buyCar("轩逸");
		// car.run();

		ICar car2 = cf.buyCar("CRV");
		ICar car3 = cf.buyCar("CRV");
		car2.run();
		System.out.println("car2.equals(car3)=" + car2.equals(car3));
		// 向下转型 访问到wheel属性
		本田 car2本田 = (本田) car2;
		本田 car3本田 = (本田) car3;

		car2本田.wheels.set轮胎("普林斯通");

		System.out.println("car2本田.wheels.get轮胎()=" + car2本田.wheels.get轮胎());
		System.out.println("car3本田.wheels.get轮胎()=" + car3本田.wheels.get轮胎());

		System.out.println("car2本田.wheels.equals(car3本田.wheels)="
				+ car2本田.wheels.equals(car3本田.wheels));

		cf = new 雪铁龙工厂();
		ICar carx = cf.buyCar("世嘉");
		carx.run();
	}

}
