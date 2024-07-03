import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arr1 = new int[arr.length];

		arr1[0] += arr.length;

		for (int i = 0; i < arr.length - 1; i++) {

			arr1[i + 1] += arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
}
