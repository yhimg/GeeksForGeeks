package com.dsa.datastructure.arrays.Rotation;

public class Sol1 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int rotateBy = 2;
		int[] temp = new int[rotateBy];
		for(int i=0; i<rotateBy; i++){
			temp[i] = arr[i];
		}
		for(int i=0; i<arr.length; i++){
			if(i < arr.length-rotateBy){
				arr[i] = arr[i+rotateBy];
			}
		}
		for(int i = 0; i< temp.length; i++){
			arr[arr.length-rotateBy+i] = temp[i];
		}

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
