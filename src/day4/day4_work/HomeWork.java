package day4.day4_work;

import java.util.Random;
import java.util.Scanner;

/*1)程序中用下面代码生成随机数据数:
 Random radm = new Random();
 int answr =radm.nextInt(10);//随机数的范围:0~9
 或者int answr = new java.util.Random().nextInt(10);

 在控制台输入一个数字，判断是否猜中，猜中则提示"恭喜你,你抽中奖了!" 猜不中则提示"猜错了,请重新猜一次..."

 2)优化上面的程序,使程序可以判断输入的数值跟随机数比起来是偏大还是偏小,偏小则提示"有点偏小哦,请猜大一点",如果偏大则提示"有点偏大哦,请猜小一点".
 猜对了以后打印奖励50~100的经验值

 用户输入exit，退出，打印成绩.*/

public class HomeWork {

	public static void main(String[] args) {
		// day4_HomeWork_1();

		Random random = new Random();
		int answr = random.nextInt(10);
		Scanner scanner = new Scanner(System.in);

		boolean chai = true;

		float count = 0;
		float a = 0;
		while (chai) {
			System.out.println("请输入0~10之间的整数");
			String userInput = scanner.next();
			if ("exit".equals(userInput)) {
				// System.exit(1);
				break;
			}
			count++;
			int input = Integer.parseInt(userInput);// 强制转换类型
			if (input < 0 || input > 10) {
				System.out.println("输入错误");
				continue;
			} else {
				if (input < answr) {
					System.out.println("有点偏小哦,请猜大一点");
				} else if (input > answr) {
					System.out.println("有点偏大哦,请猜小一点");
				} else {
					System.out.println("恭喜你,你抽中奖了");
					int score = random.nextInt(50) + 50;
					System.out.println("获得经验：" + score);
					a = (1 / count) * 100;
					chai = false;
				}
			}
		}
		if (count == 0 && a == 0) {
			System.out.println("获得经验：0");
			System.out.println("一共猜了：" + count + "次,猜中的概率是：0%");
		} else {
			System.out.println("一共猜了：" + count + "次,猜中的概率是：" + a + "%");
		}
		scanner.close();

	}

	public static void day4_HomeWork_1() {
		float num = 3;
		int num2 = (int) (num > 100 ? 1.00f : 0);
		System.out.println(num2);

		String word = "3";
		String st = word == (3 + "") ? "饿了" : "困了";
		System.out.println(st);

		double point = 100d;
		int a = point == 100 ? 777 : 5;
		System.out.println(a);
	}

}
