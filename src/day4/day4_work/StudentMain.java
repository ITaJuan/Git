package day4.day4_work;

/*
 * ����һ��Java��: Student.java,Ȼ���ڴ����к���2��ȫ�ֵľ�̬����:name,age. 
 * ���⻹��1��ȫ�ֵķǾ�̬����:score. Ҫ����main�����ж��弰��������������ͬ�ķ���:(����������)
 * 
 * ����1) ��̬,�޷���ֵ,������ (Ҫ��: �ú��η����Ĳ������и�ֵ)
 * 
 * ����2) ��̬,�з���ֵ,������
 * 
 * ����3) �Ǿ�̬,�з���ֵ,������ (Ҫ��: �ú��η����Ĳ������и�ֵ)
 * 
 * �������һ������������,Ҫ��ÿ�������ֱ��һ�����Խ��и�ֵ����ӡ�����.
 * */

public class StudentMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Student student = new Student();
		student.name("Tom");
		System.out.println("ѧ���������ǣ�" + Student.name);
		System.out.println(student.name+"�������ǣ�" +student.age(18));
		System.out.println(student.name+"�ĳɼ��ǣ�"+student.score(80));
	}
}
