package day6;

import org.junit.Test;

public class testString {

	@Test
	public void test() {
		String str1="�ַ���1";
		String str2=new String("�ַ���2");
		
		
		char[] chars={'H','e','l','l','o'};
		String str3=new String(chars);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
