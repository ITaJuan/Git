package day4.day4_work;

import java.util.Random;
import java.util.Scanner;

/*1)����������������������������:
 Random radm = new Random();
 int answr =radm.nextInt(10);//������ķ�Χ:0~9
 ����int answr = new java.util.Random().nextInt(10);

 �ڿ���̨����һ�����֣��ж��Ƿ���У���������ʾ"��ϲ��,����н���!" �²�������ʾ"�´���,�����²�һ��..."

 2)�Ż�����ĳ���,ʹ��������ж��������ֵ���������������ƫ����ƫС,ƫС����ʾ"�е�ƫСŶ,��´�һ��",���ƫ������ʾ"�е�ƫ��Ŷ,���Сһ��".
 �¶����Ժ��ӡ����50~100�ľ���ֵ

 �û�����exit���˳�����ӡ�ɼ�.*/

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
			System.out.println("������0~10֮�������");
			String userInput = scanner.next();
			if ("exit".equals(userInput)) {
				// System.exit(1);
				break;
			}
			count++;
			int input = Integer.parseInt(userInput);// ǿ��ת������
			if (input < 0 || input > 10) {
				System.out.println("�������");
				continue;
			} else {
				if (input < answr) {
					System.out.println("�е�ƫСŶ,��´�һ��");
				} else if (input > answr) {
					System.out.println("�е�ƫ��Ŷ,���Сһ��");
				} else {
					System.out.println("��ϲ��,����н���");
					int score = random.nextInt(50) + 50;
					System.out.println("��þ��飺" + score);
					a = (1 / count) * 100;
					chai = false;
				}
			}
		}
		if (count == 0 && a == 0) {
			System.out.println("��þ��飺0");
			System.out.println("һ�����ˣ�" + count + "��,���еĸ����ǣ�0%");
		} else {
			System.out.println("һ�����ˣ�" + count + "��,���еĸ����ǣ�" + a + "%");
		}
		scanner.close();

	}

	public static void day4_HomeWork_1() {
		float num = 3;
		int num2 = (int) (num > 100 ? 1.00f : 0);
		System.out.println(num2);

		String word = "3";
		String st = word == (3 + "") ? "����" : "����";
		System.out.println(st);

		double point = 100d;
		int a = point == 100 ? 777 : 5;
		System.out.println(a);
	}

}
