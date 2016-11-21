package day4;


//业务逻辑类
public class MRun {

	public static void main(String[] args) {
		 收银员_顾客();
		
		收银员.idCode="1234567890";

		//访问修饰符
		收银员 syy=new  收银员();
		syy.姓名="Kate";	//在别的对象中访问public属性
		syy.年龄=19;	//同一个包下面有好的
		// syy.set体重(21);
		// System.out.println("体重是："+syy.get体重());
	}

	public static void 收银员_顾客() {
		顾客 cstm1 = new 顾客();
		cstm1.set姓名("tony");
		顾客 cstm2 = new 顾客("Mark", true, "1234567890");

		收银员 ita = new 收银员();
		ita.set姓名("jeeny");

		ita.收款(cstm1, 200);
		ita.收款(cstm2, 200);
	}

}

