package com;

import java.util.Arrays;

public class Insertion_Sort {
	public void insertionSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}		
	}
	
	public static void main(String[] args) {
		int[] a={12,8,7,5,2};
		new Insertion_Sort().insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
