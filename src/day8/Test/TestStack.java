package day8.Test;

import org.junit.Test;

import day8.biz.J1107Stack;
import day8.biz.MyStackFullEx;
import day8.pojo.Student;
import day8.pojo.Wheels;
import day8.pojo.测试泛型;

public class TestStack {

	// 测试栈

	@Test
	public void test1() {

		J1107Stack s1 = new J1107Stack(5);

		try {
			s1.push("AAAAAAAAA");
			s1.push("BBBBBBBBB");
			s1.push("CCCCCCCCCC");
			s1.push("DDDDDDDDDD");
			s1.push("EEEEEEEEEEE");
			// s1.push("FFFFFFFFFFF");

			System.out.println(s1.pop());
			System.out.println(s1.aviSize());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println(s1.useSize());
		} catch (MyStackFullEx e) {
			e.printStackTrace();
		}

	}

	// @Test
	public void test2() {

		J1107Stack s1 = new J1107Stack(5);

		try {
			s1.push("AAAAA");

			Student stu1 = new Student();
			stu1.setStuName("张三");
			s1.push(stu1);

			s1.push("BBBB");

			System.out.println(s1.pop());

			s1.pop();

			Object obj = s1.pop();

			/*
			 * if(obj.getClass().equals(Student.class)){ //静态判定类型 Student
			 * stu1_2= (Student)obj; System.out.println(stu1_2.getStuName());
			 * }else{ System.out.println(obj); }
			 */

			// 动态判定类型:运行期的类鉴定
			if (obj instanceof Student) {

				Student stu1_2 = (Student) obj;
				System.out.println(stu1_2.getStuName());

			} else {
				System.out.println(obj);
			}

		} catch (MyStackFullEx e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test3泛型() {
		// 声明对象时指定泛型的类型
		测试泛型<Double, Student> obj = new 测试泛型<>();

		obj.setSome(3232.33d);
		obj.setName("阿三");
		String name = obj.getName();
		Double d = obj.getSome();
		System.out.println(d + "," + name);
	}

	@Test
	public void test4() {
		// 集合
		J1107Stack<Wheels> stack = new J1107Stack<Wheels>();

		try {
			Wheels w1 = new Wheels();
			w1.set轮胎("米其林322");
			stack.push(w1);

			// stack.push("dsadsadas");

			Wheels w2 = new Wheels();
			w2.set轮胎("普林斯通654");
			stack.push(w2);

			Wheels w3 = new Wheels();
			w3.set轮胎("横滨876");
			stack.push(w3);

			Wheels w4 = new Wheels();
			w4.set轮胎("韩泰097");
			stack.push(w4);

			Wheels tmp = null;

			while ((tmp = stack.pop()) != null) {
				// 类型安全
				System.out.println(tmp.get轮胎());

			}

		} catch (MyStackFullEx e) {
			e.printStackTrace();
		}

	}

}
