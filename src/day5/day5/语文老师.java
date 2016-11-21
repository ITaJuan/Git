package day5.day5;

import day5.Teacher;

//final class :最终类型，阻止继承，其他类无法继承该类
public final class 语文老师 extends Teacher {

	public 语文老师() {
		super();
		System.out.println("语文老师()");
	}

	public void teach() {
		System.out.println(super.sname + "教学生吟诗作对");
	}

}
