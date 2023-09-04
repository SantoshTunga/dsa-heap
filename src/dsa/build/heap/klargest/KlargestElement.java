package dsa.build.heap.klargest;

import dsa.build.heap.BuildHeap;

public class KlargestElement {

	public static void main(String[] args) {

		/**
		 * The approach is to find the “K” Largest element without worrying about its
		 * order . The approach to first build the heap by calling the Min Heapify
		 * method only for the kth element . Then for the remaining N-K element compare
		 * the root of the Min heap , if the root is smaller then swap it with same
		 * element and call the Min heap for root 0 to Kth element . Time Complexity –
		 * O(K + (K-N)LogK)
		 **/

		int[] arr = { 90, 80, 70, 30, 60, 10, 20, 100 };
		int k = 3;
		BuildHeap.heapify(arr, k); // O(N)
		getklargestElement(arr, k); // O(n-k* logK)

	}

	public static void getklargestElement(int[] arr, int k) {
		int n = arr.length;
		// loop for N-K elements
		for (int i = k; i < n; i++) {
			// swap the element and call the minHeap
			if (arr[0] < arr[i]) {

				int t = arr[0];
				arr[0] = arr[i];
				arr[i] = t;

				BuildHeap.minHeapify(arr, 0, k);

			}

		}
		// print the heap O(k)
		BuildHeap.print(arr, k);
	}

}
