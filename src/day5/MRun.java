package day5;

import day5.day5.历史老师;
import day5.day5.数学系学生;
import day5.day5.语文老师;

public class MRun {

	public static void main(String[] args) {

		// new 语文老师();

		多态();

		// 继承();
	}

	public static void 多态() {
		Student student = new 数学系学生();
		student.sname = "关羽";
		student.study();

		/*Student man = new 跑步运动员();
		man.sname = "刘备";
		man.study();*/

		Teacher teacher = new 语文老师();
		teacher.sname = "孔明";
		teacher.teach();

		Teacher teacher2 = new 历史老师();
		teacher2.teach();
	}

	/*
	 * public static void 继承() { 体育生 student = new 体育生(); student.sname = "张飞";
	 * student.study(); student.eat("雪梨"); student.Do("跳远");
	 * 
	 * Teacher teacher = new Teacher(); teacher.sname = "周老师"; teacher.subject =
	 * "文学"; teacher.teach(); teacher.eat("桃子"); teacher.walk(); }
	 */

}
