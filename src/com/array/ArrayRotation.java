package com.array;

public class ArrayRotation {
	// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d
	// elements.
	
	/*METHOD 1 (Using temp array)
	 Time complexity : O(n)
	Auxiliary Space : O(d)

	Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
	1) Store d elements in a temp array
	   temp[] = [1, 2]
	2) Shift rest of the arr[]
	   arr[] = [3, 4, 5, 6, 7, 6, 7]
	3) Store back the d elements
	   arr[] = [3, 4, 5, 6, 7, 1, 2]
	*/
	

	//METHOD 2 (Rotate one by one) 
//	Time complexity : O(n * d)
//	Auxiliary Space : O(1)
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		ArrayRotation rotate = new ArrayRotation();
		
		//method 2
		//rotate.leftRotate(arr, arr.length, d);
		
		//method 3
		rotate.leftRotate3(arr, arr.length, d);
		
		
		rotate.printArray(arr, arr.length);
	}

	void leftRotate(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) {
			leftRotateOne(arr, n);
		}
	}

	private void leftRotateOne(int[] arr, int n) {
		int i;
		int temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	
	/*METHOD 3 (A Juggling Algorithm)
	Time complexity : O(n)
	Auxiliary Space : O(1)*/
	
	void leftRotate3(int arr[], int n, int d) 
    { 
        int i, j, k, temp; 
        int g_c_d = gcd(d, n); 
        for (i = 0; i < g_c_d; i++) { 
            /* move i-th values of blocks */
            temp = arr[i]; 
            j = i; 
            while (true) { 
                k = j + d; 
                if (k >= n) 
                    k = k - n; 
                if (k == i) 
                    break; 
                arr[j] = arr[k]; 
                j = k; 
            } 
            arr[j] = temp; 
        } 
    } 
	
	int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        else
            return gcd(b, a % b); 
    } 
  

}
