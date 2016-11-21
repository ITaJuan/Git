import java.util.Scanner;

public class 递归算法 {

	public static void main(String[] args) {

		// System.out.println(name(9));

		// 使用Scanner捕捉用户的控制台输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int x = scanner.nextInt();
		scanner.close();

		if (判断质数(x)) {
			System.out.println(x + "是质数");
		} else {
			System.out.println(x + "不是质数");
		}

		输出质数(1, 100);

	}

	// 输出两个数之间的质数
	public static void 输出质数(int a, int b) {
		if (a > b) {
			return;
		} else {
			int j = 0;
			for (int i = a + 1; i < b; i++) {
				if (判断质数(i)) {
					j++;
				}
			}
			int[] count = new int[j];
			for (int i = a + 1, k = 0; i < b; i++) {
				if (判断质数(i)) {
					count[k] = i;
					k++;
				}
			}

			for (int i = 0; i < count.length; i++) {
				System.out.print(count[i] + ",");
			}
			System.out.println("共有" + j + "个质数");
		}

	}

	// 判断一个数是否为质数
	public static boolean 判断质数(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int name(int day) {
		if (day == 1) {
			return 1;
		} else {
			int a = name(day - 1) * 2;
			System.out.println(a);
			return a;
		}
	}

}
