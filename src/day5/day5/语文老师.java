package day5.day5;

import day5.Teacher;

//final class :�������ͣ���ֹ�̳У��������޷��̳и���
public final class ������ʦ extends Teacher {

	public ������ʦ() {
		super();
		System.out.println("������ʦ()");
	}

	public void teach() {
		System.out.println(super.sname + "��ѧ����ʫ����");
	}

}
