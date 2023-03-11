package com.test;

public class SortElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,5,8,9,2,3,88,12,33,15};
		int length=arr.length;
		
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(i+" ");
		}
			
	}

}
