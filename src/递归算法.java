import java.util.Scanner;

public class �ݹ��㷨 {

	public static void main(String[] args) {

		// System.out.println(name(9));

		// ʹ��Scanner��׽�û��Ŀ���̨����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = scanner.nextInt();
		scanner.close();

		if (�ж�����(x)) {
			System.out.println(x + "������");
		} else {
			System.out.println(x + "��������");
		}

		�������(1, 100);

	}

	// ���������֮�������
	public static void �������(int a, int b) {
		if (a > b) {
			return;
		} else {
			int j = 0;
			for (int i = a + 1; i < b; i++) {
				if (�ж�����(i)) {
					j++;
				}
			}
			int[] count = new int[j];
			for (int i = a + 1, k = 0; i < b; i++) {
				if (�ж�����(i)) {
					count[k] = i;
					k++;
				}
			}

			for (int i = 0; i < count.length; i++) {
				System.out.print(count[i] + ",");
			}
			System.out.println("����" + j + "������");
		}

	}

	// �ж�һ�����Ƿ�Ϊ����
	public static boolean �ж�����(int x) {
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
