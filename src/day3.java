public class day3 {

	public static void main(String[] args) {

		// javaû�ж�ά���飬����������顱--->��һ����������������������飬���ȿ��Բ�һ��

		// ��λ����();
		// ��λ����();
		// �����ӡ����();

		// ��ӡ������(5);
		// ��ӡ�˷���(12);

		int[] arr = { 2, 1, 5, 6, 7, 9, 8, 3, 4 };
		// ð������(arr);
		��ӡ���(arr);

		int index = 3;
		int[] array = new int[arr.length - 1];
		System.arraycopy(arr, 0, array, 0, index);// ��һ����Ҫ���Ƶ����飬�ڶ����Ǵ�Ҫ���Ƶ�����ĵڼ�����ʼ���������Ǹ��Ƶ��ǣ��ĸ��Ǹ��Ƶ�������ڼ�����ʼ�����һ���Ǹ��Ƴ���
		System.arraycopy(arr, index + 1, array, index, array.length - index);
		��ӡ���(array);

		// System.out.println(" ------------------- ");
		// ѡ������(arr);
		// ��ӡ���(arr);

		// ��ӡ�ȱ�������(5);

		// int where = �۰����(arr, 3);
		// System.out.println(where == -1 ? "�Ҳ���" : "λ���ڣ�" + where);
		// int where = ����(arr, 6);
		// System.out.println("Ҫ���ҵ�ֵ��λ���ڣ���" + where + "λ");
		// ��ֵ(arr, 7);
		// ��ֵ(arr, 3, 0);
		// ��ӡ���(arr);
	}

	// �޸�ָ��λ�õ�ֵ
	public static void ��ֵ(int[] arr, int key, int num) {
		if (key > arr.length) {
			System.out.println("Ҫ���ҵ�λ�ò���������");
		} else {
			arr[key] = num;
		}
	}

	// ����ָ��λ�õ�ֵ
	public static void ��ֵ(int arr[], int key) {
		if (key > arr.length) {
			System.out.println("Ҫ���ҵ�λ�ò���������");
		} else {
			System.out.println("��" + key + "λ��ֵΪ" + arr[key - 1]);
		}
	}

	// ����ָ��ֵ��λ��������
	public static int ��λ��(int[] arr, int key) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				x = i;
			}
		}
		return x;
	}

	public static void ��ӡ�ȱ�������(int bian) {
		for (int i = 0; i < bian; i++) {
			for (int j = bian; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void ѡ������(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					����(arr, i, j);
				}
			}
		}
		/*
		 * for (int i = 0; i < select.length; i++) { System.out.print(select[i]
		 * + " "); }
		 */
	}

	public static void ��ӡ���(int[] select) {
		System.out.print("[");
		for (int i = 0; i < select.length; i++) {
			if (i != select.length - 1) {
				System.out.print(select[i] + ",");
			} else {
				System.out.println(select[i] + "]");
			}
		}
	}

	public static void ����(int[] select, int i, int j) {
		int temp = select[i];
		select[i] = select[j];
		select[j] = temp;
	}

	public static void ð������(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					/*
					 * int temp = maopao[j]; maopao[j] = maopao[j + 1];
					 * maopao[j+ 1] = temp;
					 */
					����(arr, j, j + 1);
				}
			}
			// System.out.print(maopao[i] + " ");
		}
	}

	public static void ��ӡ�˷���(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public static void ��ӡ������(int hight) {
		for (int i = 1; i <= hight; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void �����ӡ����() {
		int[][] arrays = new int[3][2];
		for (int i = arrays.length - 1; i >= 0; i--) {
			int[] js = arrays[i];
			for (int j = js.length - 1; j >= 0; j--) {
				int i1 = js[j];
				System.out.println(i1 + ",");
			}
		}
	}

	public static void ��λ����() {
		int[][][] arrayT = new int[2][2][3];
		arrayT[0][0][0] = 1;
		arrayT[0][0][1] = 2;
		arrayT[0][0][2] = 3;

		arrayT[0][1][0] = 4;
		arrayT[0][1][1] = 5;
		arrayT[0][1][2] = 6;

		arrayT[1][0][0] = 7;
		arrayT[1][0][1] = 8;
		arrayT[1][0][2] = 9;

		arrayT[1][1][0] = 10;
		arrayT[1][1][1] = 11;
		arrayT[1][1][2] = 12;

		for (int i = 0; i < arrayT.length; i++) {
			int[][] js = arrayT[i];
			for (int j = 0; j < js.length; j++) {
				int[] is = js[j];
				for (int k = 0; k < is.length; k++) {
					int j1 = is[k];
					System.out.println(j1);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void ��λ����() {
		int[][] arrays = new int[2][3];

		arrays[0][0] = 1;
		arrays[0][1] = 2;
		arrays[0][2] = 3;

		arrays[1][0] = 4;
		arrays[1][1] = 5;
		arrays[1][2] = 6;

		System.out.println(arrays[1][1]);

		for (int i = 0; i < arrays.length; i++) {// ���ѭ��
			for (int j = 0; j < arrays[i].length; j++) {// �ڲ�ѭ��
				System.out.print(arrays[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static int �۰����(int[] array, int target) {

		// ��߽�
		int left = 0;
		// �ұ߽�
		int right = array.length;
		// �м�λ��
		int middle = -1;

		int count = 1;

		while (left <= right) {// ��߽�û���Ƶ��ұ߽磺�����۰�
			// �����м�λ��
			middle = (left + right) / 2;

			// �Ƚ�
			if (array[middle] > target) {
				// ���ұ߽��Ƶ��е�-1
				right = middle - 1;
			} else if (array[middle] < target) {
				// ����߽��Ƶ��е�+1
				left = middle + 1;
			} else {
				return middle;
			}
			System.out.println("��" + (count++) + "�β���");

		}

		return -1;// �Ҳ�������-1
	}
}
