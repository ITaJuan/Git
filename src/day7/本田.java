package day7;

//可以作为原型的类需要实现   空接口Cloneable（标记）
public class 本田 extends 东风汽车 implements Cloneable {

	// 引用类型不能直接被克隆，需要深度克隆解决
	public Wheels wheels;

	// 2.覆盖Object的clone
	@Override
	public 本田 clone() throws CloneNotSupportedException {
		// 克隆的代码
		本田 newCar = (本田) super.clone();
		// 深度克隆
		newCar.wheels = wheels.clone();

		return newCar;
	}

	@Override
	public void run() {
		System.out.println("本田汽车:" + getName() + "run as " + this.getSpeed()
				+ " mph");
	}

	@Override
	public void stop() {
		System.out.println("本田汽车:" + getName() + "stop");

	}

}
