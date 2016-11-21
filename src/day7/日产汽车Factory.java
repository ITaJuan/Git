package day7;

//工厂在系统中应该是单例
public class 日产汽车Factory extends IBuildCarFactory {

	// 2.单例 本类创建自己的实例为类变量
	private static 日产汽车Factory 自己 = new 日产汽车Factory();

	// 准备被克隆的原型
	private 本田 crv = null;

	// 1.单例 构造器私有
	private 日产汽车Factory() {
		crv = new 本田();
		crv.setName("CRV城市SUV");
		crv.setSpeed(130);
		crv.wheels = new Wheels();
		crv.wheels.set轮胎("横滨轮胎245");
	}

	// 3.单例 公开的取得实例的方法
	// 同步方法
	public static synchronized 日产汽车Factory getInstance() {
		return 自己;
	}

	// 在工厂中进行生产
	public ICar buyCar(String 车名) {

		ICar car = null;

		if ("天籁".equals(车名)) { // 工厂中封装了生产的细节
			car = new 日产();
			car.setName("天籁");
			car.setSpeed(200);
		} else if ("蓝鸟".equals(车名)) {
			car = new 日产();
			car.setName("蓝鸟");
			car.setSpeed(160);
		} else if ("轩逸".equals(车名)) {
			car = new 日产();
			car.setName("轩逸");
			car.setSpeed(180);
		} else if ("CRV".equals(车名)) {

			try {
				car = crv.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.err.println("客户下错单");
		}

		return car;

	}

}
