package day5;

import day5.day5.��ʷ��ʦ;
import day5.day5.��ѧϵѧ��;
import day5.day5.������ʦ;

public class MRun {

	public static void main(String[] args) {

		// new ������ʦ();

		��̬();

		// �̳�();
	}

	public static void ��̬() {
		Student student = new ��ѧϵѧ��();
		student.sname = "����";
		student.study();

		/*Student man = new �ܲ��˶�Ա();
		man.sname = "����";
		man.study();*/

		Teacher teacher = new ������ʦ();
		teacher.sname = "����";
		teacher.teach();

		Teacher teacher2 = new ��ʷ��ʦ();
		teacher2.teach();
	}

	/*
	 * public static void �̳�() { ������ student = new ������(); student.sname = "�ŷ�";
	 * student.study(); student.eat("ѩ��"); student.Do("��Զ");
	 * 
	 * Teacher teacher = new Teacher(); teacher.sname = "����ʦ"; teacher.subject =
	 * "��ѧ"; teacher.teach(); teacher.eat("����"); teacher.walk(); }
	 */

}
