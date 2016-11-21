package day7;

import org.junit.Test;

public class 基本数据类型的包装类 {
	@Test
	public void syso() {

		int a=5;
		Integer a2=a;
		System.out.println(a2.max(34, 21));
		
		int a3=a2;//java自动拆分
		int a4=Integer.parseInt("234");
		System.out.println(a3);
	}

}
