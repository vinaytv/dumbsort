package dumbsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kkumvina
 *
 */
public class DumbSortImpl {
	
	
	/**
	 * This method is used to Dumb Sort the input array
	 * @param arr
	 */
	void dumbSort(String arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 2; j++)

				if (j + 2 < n && (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 2]))) {
					String temp = arr[j];
					arr[j] = arr[j + 2];
					arr[j + 2] = temp;
				}
	}

	/**
	 * This method is used to compare arrays and return index of the mismatch
	 * @param array1
	 * @param array2
	 * @param length
	 * @return
	 */
	int checkForIndex(String array1[], String array2[], int length) {

		for (int i = 0; i < length; i++) {

			if (array1[i] != array2[i]) {

				return i;
			}

		}

		return 0;
	}

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Scanner scanner = new Scanner(System.in);
			int length = Integer.parseInt(br.readLine());
			String[] inpputArray = scanner.nextLine().split(",");
			String[] comapring = Arrays.copyOf(inpputArray, inpputArray.length);
			Arrays.sort(comapring);

			DumbSortImpl sumofValues = new DumbSortImpl();
			sumofValues.dumbSort(inpputArray);

			if (comapring == inpputArray) {
				System.out.println("OK");
			} else {
				System.out.println(sumofValues.checkForIndex(comapring, inpputArray, length));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
