package day7.day7_HomeWork;

import java.util.Scanner;

import org.junit.Test;

public class �����ַ�Ϸ��� {

	public static void main(String[] args) {

		System.out.println("�����������ַ");
		Scanner input = new Scanner(System.in);
		String str1 = input.next();

		int m = str1.indexOf('@');
		int m2 = str1.lastIndexOf('@');
		int n = str1.indexOf('.');
		int n2 = str1.lastIndexOf('.');
		String str2 = str1.substring(str1.indexOf('@') + 1, str1.indexOf('.'));
		String str3 = str1.substring(str1.indexOf('.') + 1);
		if (m == 0 || n == 0) {
			System.out.println("�����ַ��ʽ����");
		} else if (m > n) {
			System.out.println("�����ַ��ʽ����");
		} else if (str2.length() == 0) {
			System.out.println("�����ַ��ʽ����");
		} else if (str3.length() == 0) {
			System.out.println("�����ַ��ʽ����");
		} else if (m2 > m) {
			System.out.println("�����ַ��ʽ����");
		} else if (m == m2 && n2 >= n) {
			System.out.println("�����ַ��ʽ��ȷ");
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