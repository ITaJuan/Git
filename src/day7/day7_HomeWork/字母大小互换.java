package day7.day7_HomeWork;

import java.util.Scanner;

public class 字母大小互换 {

	public static void main(String[] args) {

		// String s = "skdjkeojw[dgABFjafaer]dfaserw";
		System.out.println("请输入一串字符串，其中要包括‘[’和‘]’");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		int begin = 0;
		int end = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '[') {
				begin = i;
			} else if (c[i] == ']') {
				end = i;
			}
		}
		String cs = s.substring(begin + 1, end);
		char[] c2 = cs.toCharArray();

		for (int i = 0; i < c2.length; i++) {
			if (c2[i] >= 97) {
				//c2[i]-=32;
				sb.append((c2[i] + "").toUpperCase());
			} else {//c2[i]+=32;
				sb.append((c2[i] + "").toLowerCase());
			}
		}
		sc.close();
		System.out.println(sb);
	}

	/*public static void t() {
		// System.out.println("请输入一串字符串，其中要包括‘[’和‘]’");
		// Scanner scanner = new Scanner(System.in);
		// String chars = scanner.next();

		String s = "skdjkeojw[dgajafaer]dfaserw";
		Stack<Character> sc = new Stack<Character>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '[') {
				sc.push(c[i]);
			} else if (c[i] == ']') {
				if (sc.peek() == '[') {
					sc.pop();
				}
			}
		}
		if (sc.empty()) {
			System.out.println("成对");
		} else {
			System.out.println("不成对");
		}
	}*/
}
