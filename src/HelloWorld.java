import java.util.Date;

public class HelloWorld  {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		String s="ABC";
		sb.append(s);
		System.out.println(sb.reverse());
		/*int[] arr = { 2, 1, 5, 7, 9 };
		—°‘Ò≈≈–Ú(arr);
		bubleSort(arr);
		printArray(arr);*/
	}

	public static void —°‘Ò≈≈–Ú(int[] array) throws Exception{
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void bubleSort(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length - x - 1; y++) {
				if (arr[y] < arr[y + 1]) {

					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;

					// swap(arr, y, y + 1);
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ",");
			else
				System.out.println(arr[x] + "]");
		}
	}
}
