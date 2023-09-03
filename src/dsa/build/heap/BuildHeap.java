package dsa.build.heap;

public class BuildHeap {

	/** in this problem we need to construct a heap from the given array **/
	public void heapify(int[] arr) {
		/**
		 * the given array is a non heap , so we need to construct the heap from the
		 * left side right most element to get the left side right most element from the
		 * parent node is (n/2)-1 where n is length of the array
		 ***/
		int len = arr.length;

		for (int i = len / 2 - 1; i >= 0; i--) {
			// call for Min or Max heap based on the requirement
			minHeapify(arr, i, len);
		}

	}

	public void minHeapify(int[] arr, int parent, int len) {
		/**
		 * minHeapify method construct the element from the root by comparing parent
		 * with its left or right child so the root always smaller compared to its
		 * children left child is "2i+1" , right child "2i+2" where i is the parent
		 **/

		while (parent < len) {
			int left = 2 * parent + 1;
			int right = 2 * parent + 2;
			int smallest = parent;

			// compare with left
			if (left < len && arr[parent] > arr[left]) {
				smallest = left;
			}
			// compare with right
			if (right < len && arr[smallest] > arr[right]) {
				smallest = right;
			}

			if (parent != smallest) {
				// swap the element
				int temp = arr[smallest];
				arr[smallest] = arr[parent];
				arr[parent] = temp;
				// assign the parent to the smallest element for further iteration
				parent = smallest;
			} else {
				break;
			}
		}
	}

	public void print(int[] arr) {
		System.out.println(" all the elements of the Heap");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
