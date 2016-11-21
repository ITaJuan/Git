package day7.day7_HomeWork;

import java.util.Scanner;

import org.junit.Test;

public class 邮箱地址合法性 {

	public static void main(String[] args) {

		System.out.println("请输入邮箱地址");
		Scanner input = new Scanner(System.in);
		String str1 = input.next();

		int m = str1.indexOf('@');
		int m2 = str1.lastIndexOf('@');
		int n = str1.indexOf('.');
		int n2 = str1.lastIndexOf('.');
		String str2 = str1.substring(str1.indexOf('@') + 1, str1.indexOf('.'));
		String str3 = str1.substring(str1.indexOf('.') + 1);
		if (m == 0 || n == 0) {
			System.out.println("邮箱地址格式错误");
		} else if (m > n) {
			System.out.println("邮箱地址格式错误");
		} else if (str2.length() == 0) {
			System.out.println("邮箱地址格式错误");
		} else if (str3.length() == 0) {
			System.out.println("邮箱地址格式错误");
		} else if (m2 > m) {
			System.out.println("邮箱地址格式错误");
		} else if (m == m2 && n2 >= n) {
			System.out.println("邮箱地址格式正确");
		}
		// System.out.println(m + "," + n + "," + str2.length());
		input.close();
	}

	@Test
	public void test() {
		char ch = '8';
		int r = 10;
		switch (ch + 1) {
		case '7':
			r = r + 3;
			System.out.println(r);
		case '8':
			r = r + 5;
			System.out.println(r);
		case '9':
			r = r + 6;
			System.out.println(r);
			break;
		default:
			r = r + 8;
			System.out.println(r);
		}

	}
}