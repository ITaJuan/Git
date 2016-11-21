package day4;

public class 收银员 {

	public String 姓名;
	private String 职衔;
	int 年龄;		//不带修饰符，默认为友好的(friendly)
	public static String idCode;
	private float 体重;

	public void 打印账单() {

	}

	public void 收款(顾客  cstm, double cash) {
		System.out.println(姓名 + "对" + cstm.get姓名() + "收了" + cash + "元");
	}

	public String get姓名() {
		return 姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	public String get职衔() {
		return 职衔;
	}

	public void set职衔(String 职衔) {
		this.职衔 = 职衔;
	}

	public int get年龄() {
		return 年龄;
	}

	public void set年龄(int 年龄) {
		this.年龄 = 年龄;
	}

	public float get体重() {
		return 体重;
	}

	public void set体重(float 体重) {
		this.体重 = 体重;
	}
}
