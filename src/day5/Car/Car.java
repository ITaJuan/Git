package day5.Car;

//当一个类型是纯抽象的：所有方法都没有实现，只有规定
interface ICar {

	// 接口中的属性都是public static final的
	String car = "车";

	// 接口中的方法全是public abstract的
	void 行驶();

	void 停止();

	void 倒车();
}
