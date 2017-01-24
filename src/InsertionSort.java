public class InsertionSort {

	public static Integer[] sort(Integer[] sequence) {
		int n = sequence.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int k = i;
			while (j >= 0 && sequence[j] > sequence[k]) {
				sequence[j] = sequence[j] + sequence[k];
				sequence[k] = sequence[j] - sequence[k];
				sequence[j] = sequence[j] - sequence[k];
				// swap(sequence[j], sequence[i]);
				j--;
				k--;
			}
		}
		return sequence;
	}

	public static void swap(Integer a, Integer b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	

	public static void main(String[] argv) {
		Integer[] sec = { 3, 6, 1, 7, 8, 5, 44, -3 };
		InsertionSort.sort(sec);
		for (int i = 0; i < sec.length; i++)
			System.out.print(sec[i] + " ");

	}
}
