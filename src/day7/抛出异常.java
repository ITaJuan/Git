package day7;

import org.junit.Test;

import day6.Student;

public class �׳��쳣 {

	public void toInt() {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i : a) {
			System.out.println(i);
		}
		/*
		 * int a; try { a=Integer.parseInt(intStr);
		 * 
		 * } catch (NumberFormatException e) {
		 * 
		 * }
		 * 
		 * System.out.println("��ʽ���ɹ���a=");
		 */
	}

	@Test
	public void ��ָ���쳣() {

		Student stu = null;
		
		try {
			stu = new Student();
			stu.setStuAge(10);
			System.out.println("�쳣����߼�");
			int a = 123 / 0;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally{
			System.out.println("finally");
		}
		System.out.println("ok");
	}
}
