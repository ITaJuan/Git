package day4;


public class 顾客 {

	private String 姓名;
	private boolean 性别;
	private String 身份证;

	// 构造器，构造方法
	public 顾客() {// 构造器必须跟类型同名，没有返回值不用写void
		// 如果构造器没有输入参数，称为默认构造器,如果没有其他带参数的构造器，可以省略不写
		super();
		// 姓名="匿名";
	}

	public 顾客(String 姓名, boolean 性别, String 身份证) {
		// 在方法中，访问显示访问全局变量使用this关键字
		super();
		this.姓名 = 姓名;
		this.性别 = 性别;
		this.身份证 = 身份证;
	}

	public void 入住() {

	}

	public void 结账() {

	}

	public String get姓名() {
		return 姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	public boolean is性别() {
		return 性别;
	}

	public void set性别(boolean 性别) {
		this.性别 = 性别;
	}

	public String get身份证() {
		return 身份证;
	}

	public void set身份证(String 身份证) {
		this.身份证 = 身份证;
	}
}
