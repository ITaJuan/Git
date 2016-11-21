package day8.Test;

import org.junit.Test;

import day8.biz.J1107Stack;
import day8.biz.MyStackFullEx;
import day8.pojo.Student;
import day8.pojo.泛型;

public class test泛型 {

	@Test
	public void test泛型() {
		泛型<String, Integer> obj = new 泛型<>();
		obj.setSome("泛型1");
		obj.setSome2(12);

		System.out.println(obj.getSome());
		System.out.println(obj.getSome2());
		
		J1107Stack<Student> stack=new J1107Stack<>();
		try {
			Student s1=new Student();
			s1.setStuName("刘备");
			stack.push(s1);
			Student s2=new Student();
			s2.setStuName("关羽");
			stack.push(s2);
			Student s3=new Student();
			s3.setStuName("张飞");
			stack.push(s3);
			Student s4=new Student();
			s4.setStuName("赵云");
			stack.push(s4);
			
			Student temp=null;
			while ((temp=stack.pop())!=null) {
				System.out.println(temp.getStuName());
			}
		} catch (MyStackFullEx e) {
			e.printStackTrace();
		}

//		J1107Stack<Wheels> stack = new J1107Stack<>(4);
//		try {
//			Wheels w1 = new Wheels();
//			w1.set轮胎("米其林");
//			stack.push(w1);
//			Wheels w2 = new Wheels();
//			w2.set轮胎("普林斯通");
//			stack.push(w2);
//			Wheels w3 = new Wheels();
//			w3.set轮胎("横滨");
//			stack.push(w3);
//			Wheels w4 = new Wheels();
//			w4.set轮胎("韩泰");
//			stack.push(w4);
//
//			Wheels temp = null;
//			while ((temp = stack.pop()) != null) {
//				System.out.println(temp.get轮胎());
//
//			}
//		} catch (MyStackFullEx e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
