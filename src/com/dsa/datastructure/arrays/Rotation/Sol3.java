package com.dsa.datastructure.arrays.Rotation;

public class Sol3 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int rotateBy = 2;
		reverse(arr,0,rotateBy-1);
		reverse(arr, rotateBy, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	private static void reverse(int[] arr, int start, int end){
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
