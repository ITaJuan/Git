package day4.day4_work;

/*
 * 创建一个Java类: Student.java,然后在此类中含有2个全局的静态属性:name,age. 
 * 另外还有1个全局的非静态属性:score. 要求在main方法中定义及调用以下三个不同的方法:(方法名任意)
 * 
 * 方法1) 静态,无返回值,含参数 (要求: 用含参方法的参数进行赋值)
 * 
 * 方法2) 静态,有返回值,不含参
 * 
 * 方法3) 非静态,有返回值,含参数 (要求: 用含参方法的参数进行赋值)
 * 
 * 这个类中一共有三个属性,要求每个方法分别对一个属性进行赋值并打印出结果.
 * */

public class StudentMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Student student = new Student();
		student.name("Tom");
		System.out.println("学生的姓名是：" + Student.name);
		System.out.println(student.name+"的年龄是：" +student.age(18));
		System.out.println(student.name+"的成绩是："+student.score(80));
	}
}
