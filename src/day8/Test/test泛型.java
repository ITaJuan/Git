package day8.Test;

import org.junit.Test;

import day8.biz.J1107Stack;
import day8.biz.MyStackFullEx;
import day8.pojo.Student;
import day8.pojo.����;

public class test���� {

	@Test
	public void test����() {
		����<String, Integer> obj = new ����<>();
		obj.setSome("����1");
		obj.setSome2(12);

		System.out.println(obj.getSome());
		System.out.println(obj.getSome2());
		
		J1107Stack<Student> stack=new J1107Stack<>();
		try {
			Student s1=new Student();
			s1.setStuName("����");
			stack.push(s1);
			Student s2=new Student();
			s2.setStuName("����");
			stack.push(s2);
			Student s3=new Student();
			s3.setStuName("�ŷ�");
			stack.push(s3);
			Student s4=new Student();
			s4.setStuName("����");
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
//			w1.set��̥("������");
//			stack.push(w1);
//			Wheels w2 = new Wheels();
//			w2.set��̥("����˹ͨ");
//			stack.push(w2);
//			Wheels w3 = new Wheels();
//			w3.set��̥("���");
//			stack.push(w3);
//			Wheels w4 = new Wheels();
//			w4.set��̥("��̩");
//			stack.push(w4);
//
//			Wheels temp = null;
//			while ((temp = stack.pop()) != null) {
//				System.out.println(temp.get��̥());
//
//			}
//		} catch (MyStackFullEx e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
