public class day3 {

	public static void main(String[] args) {

		// java没有多维数组，“数组的数组”--->在一个数组里面放入其他的数组，长度可以不一样

		// 二位数组();
		// 三位数组();
		// 逆向打印数组();

		// 打印三角形(5);
		// 打印乘法表(12);

		int[] arr = { 2, 1, 5, 6, 7, 9, 8, 3, 4 };
		// 冒泡排序(arr);
		打印输出(arr);

		int index = 3;
		int[] array = new int[arr.length - 1];
		System.arraycopy(arr, 0, array, 0, index);// 第一个是要复制的数组，第二个是从要复制的数组的第几个开始，第三个是复制到那，四个是复制到的数组第几个开始，最后一个是复制长度
		System.arraycopy(arr, index + 1, array, index, array.length - index);
		打印输出(array);

		// System.out.println(" ------------------- ");
		// 选择排序(arr);
		// 打印输出(arr);

		// 打印等边三角形(5);

		// int where = 折半查找(arr, 3);
		// System.out.println(where == -1 ? "找不到" : "位置在：" + where);
		// int where = 查找(arr, 6);
		// System.out.println("要查找的值的位置在：第" + where + "位");
		// 查值(arr, 7);
		// 改值(arr, 3, 0);
		// 打印输出(arr);
	}

	// 修改指定位置的值
	public static void 改值(int[] arr, int key, int num) {
		if (key > arr.length) {
			System.out.println("要查找的位置不在数组内");
		} else {
			arr[key] = num;
		}
	}

	// 查找指定位置的值
	public static void 查值(int arr[], int key) {
		if (key > arr.length) {
			System.out.println("要查找的位置不在数组内");
		} else {
			System.out.println("第" + key + "位的值为" + arr[key - 1]);
		}
	}

	// 查找指定值的位置在哪里
	public static int 查位置(int[] arr, int key) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				x = i;
			}
		}
		return x;
	}

	public static void 打印等边三角形(int bian) {
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

	public static void 选择排序(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					交换(arr, i, j);
				}
			}
		}
		/*
		 * for (int i = 0; i < select.length; i++) { System.out.print(select[i]
		 * + " "); }
		 */
	}

	public static void 打印输出(int[] select) {
		System.out.print("[");
		for (int i = 0; i < select.length; i++) {
			if (i != select.length - 1) {
				System.out.print(select[i] + ",");
			} else {
				System.out.println(select[i] + "]");
			}
		}
	}

	public static void 交换(int[] select, int i, int j) {
		int temp = select[i];
		select[i] = select[j];
		select[j] = temp;
	}

	public static void 冒泡排序(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					/*
					 * int temp = maopao[j]; maopao[j] = maopao[j + 1];
					 * maopao[j+ 1] = temp;
					 */
					交换(arr, j, j + 1);
				}
			}
			// System.out.print(maopao[i] + " ");
		}
	}

	public static void 打印乘法表(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public static void 打印三角形(int hight) {
		for (int i = 1; i <= hight; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void 逆向打印数组() {
		int[][] arrays = new int[3][2];
		for (int i = arrays.length - 1; i >= 0; i--) {
			int[] js = arrays[i];
			for (int j = js.length - 1; j >= 0; j--) {
				int i1 = js[j];
				System.out.println(i1 + ",");
			}
		}
	}

	public static void 三位数组() {
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

	public static void 二位数组() {
		int[][] arrays = new int[2][3];

		arrays[0][0] = 1;
		arrays[0][1] = 2;
		arrays[0][2] = 3;

		arrays[1][0] = 4;
		arrays[1][1] = 5;
		arrays[1][2] = 6;

		System.out.println(arrays[1][1]);

		for (int i = 0; i < arrays.length; i++) {// 外层循环
			for (int j = 0; j < arrays[i].length; j++) {// 内层循环
				System.out.print(arrays[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static int 折半查找(int[] array, int target) {

		// 左边界
		int left = 0;
		// 右边界
		int right = array.length;
		// 中间位置
		int middle = -1;

		int count = 1;

		while (left <= right) {// 左边界没有移到右边界：不断折半
			// 计算中间位置
			middle = (left + right) / 2;

			// 比较
			if (array[middle] > target) {
				// 把右边界移到中点-1
				right = middle - 1;
			} else if (array[middle] < target) {
				// 把左边界移到中点+1
				left = middle + 1;
			} else {
				return middle;
			}
			System.out.println("第" + (count++) + "次查找");

		}

		return -1;// 找不到返回-1
	}
}
