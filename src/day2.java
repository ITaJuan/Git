

public final class day2 {

	final double pi = 3.1415d;

	public void text() {
		// pi=3.1;
	}

	public static void main(String[] args) {

		/*
		 * int countEggs = 35555; short countApple = (short) countEggs;
		 * System.out.println("countApple =" + countApple); double temp =
		 * div(23, 3); System.out.println("结果是=" + temp); 关系运算符();
		 */

		/*
		 * int a = 23; int a1 = a++; System.out.println("a=" + a + ",a1=" + a1);
		 * 
		 * int b = 23; int b1 = ++b; System.out.println("b=" + b + ",b1=" + b1);
		 */

		/*
		 * char x='A'; switch选择(x);
		 */

		// int[] array=new int[3];
		/*
		 * char[] name = { 'H', 'e', 'l', 'l', 'o', ',', 'W', 'o', 'r', 'l', 'd'
		 * }; System.out.println(name.length); for (int i = 0; i < name.length;
		 * i++) { System.out.print(name[i]); }
		 */

		// if_();
		//
		// switch_();

		char[] arr = "abcdefghijklmn".toCharArray();
		break_continue(arr, 3, 11);
		/*
		 * int a = 'b'; String b = Integer.toString(a); System.out.println(b);
		 */

	}

	public static void break_continue(char[] arr, int start, int end) {

		int x = 0;
		for (int i = start; i < arr.length; i++) {
			if (i == end) {
				x = i;
				break;
			}
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		if (x == 11) {
			System.out.println("return");
			return;
		}
	}

	public static void switch_() {
		Integer w = 4;
		switch (w) {
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("winter");
			break;

		default:
			System.out.println("false");
			break;
		}
	}

	public static void if_() {
		Integer w = 21;
		if (w < 1 || w > 12) {
			System.out.println("false");
		} else if (w >= 3 && w <= 5) {
			System.out.println("spring");
		} else if (w >= 6 && w <= 8) {
			System.out.println("summer");
		} else if (w >= 9 && w <= 11) {
			System.out.println("fall");
		} else {
			System.out.println("winter");
		}
	}

	public static void switch选择(char type) {

		switch (type) {
		case 'A':
			System.out.println('A');
			break;
		case 'B':
			System.out.println('B');
			break;
		default:
			break;
		}
	}

	public static double div(double num1, double num2) {

		double temp = num1 / num2;
		System.out.println("temp=" + temp);
		long x = (long) (temp * 100);
		System.out.println("x=" + x);

		return (temp - x / 100) > 0.005 ? (x + 1) / 100d : x / 100d;

		/*
		 * 保存多少位小数 int x=(int) (temp*100); return x/100f;
		 */

		/*
		 * 四舍五入 return (temp - x / 100) > 0.005 ? (x + 1) / 100d : x / 100d;
		 */

	}

	public static void 关系运算符() {
		int a = 1;
		System.out.println(a == 1);
		System.out.println(a > 1);
		int b = 3;
		System.out.println(a > b && a == b);
		System.out.println(a == 1 && a < b);
		System.out.println(!(a > b));

	}

}
