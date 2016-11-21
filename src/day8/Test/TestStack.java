package day8.Test;

import org.junit.Test;

import day8.biz.J1107Stack;
import day8.biz.MyStackFullEx;
import day8.pojo.Student;
import day8.pojo.Wheels;
import day8.pojo.���Է���;

public class TestStack {

	// ����ջ

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
			stu1.setStuName("����");
			s1.push(stu1);

			s1.push("BBBB");

			System.out.println(s1.pop());

			s1.pop();

			Object obj = s1.pop();

			/*
			 * if(obj.getClass().equals(Student.class)){ //��̬�ж����� Student
			 * stu1_2= (Student)obj; System.out.println(stu1_2.getStuName());
			 * }else{ System.out.println(obj); }
			 */

			// ��̬�ж�����:�����ڵ������
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
	public void test3����() {
		// ��������ʱָ�����͵�����
		���Է���<Double, Student> obj = new ���Է���<>();

		obj.setSome(3232.33d);
		obj.setName("����");
		String name = obj.getName();
		Double d = obj.getSome();
		System.out.println(d + "," + name);
	}

	@Test
	public void test4() {
		// ����
		J1107Stack<Wheels> stack = new J1107Stack<Wheels>();

		try {
			Wheels w1 = new Wheels();
			w1.set��̥("������322");
			stack.push(w1);

			// stack.push("dsadsadas");

			Wheels w2 = new Wheels();
			w2.set��̥("����˹ͨ654");
			stack.push(w2);

			Wheels w3 = new Wheels();
			w3.set��̥("���876");
			stack.push(w3);

			Wheels w4 = new Wheels();
			w4.set��̥("��̩097");
			stack.push(w4);

			Wheels tmp = null;

			while ((tmp = stack.pop()) != null) {
				// ���Ͱ�ȫ
				System.out.println(tmp.get��̥());

			}

		} catch (MyStackFullEx e) {
			e.printStackTrace();
		}

	}

}
