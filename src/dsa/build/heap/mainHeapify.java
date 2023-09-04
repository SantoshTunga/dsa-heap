package dsa.build.heap;

public class mainHeapify {

	public static void main(String[] args) {
		int[] arr = { 90, 80, 70, 30, 60, 10, 20 };

		BuildHeap.heapify(arr, arr.length);
		BuildHeap.print(arr);

	}

}
