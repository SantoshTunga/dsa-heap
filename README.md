# dsa-heap
all heap &amp; priority queue related algorithm
# Heapify
### It is based on the approach to start picking up the left side right most tree node and call Max or Min Hapify to construct the Heap.
### Min/Max heapify is based on the algorithm to pick up the element from the root and start comparing its left & right child until the root is finds its appropriate new position.
## Complexity Analysis 
### Each call to Min or Max Heapify call is **O(logn)** , we are making n calls build the Heap so overall complexity is **O(n * lg(n))** . 
### **Tighter bound time complexity = O(n)** .


