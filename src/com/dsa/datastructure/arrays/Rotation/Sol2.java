package com.dsa.datastructure.arrays.Rotation;

public class Sol2 {
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		int rotateBy = 2;
		int temp;
		temp = arr[0];
		for(int i=0; i<rotateBy; i++){
			temp = arr[0];
			for(int j = 0; j<arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}

		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
