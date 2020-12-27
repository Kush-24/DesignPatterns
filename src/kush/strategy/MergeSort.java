package kush.strategy;
/*
 * step 1 : If it is only one element in the list it already sorted, return
 * step 2 : Divide the list recursively into two halves until it can no more divided.
 * step 3 : Merge the smaller list into new list in sorted order.
 */

public class MergeSort implements MyStrategy{

	@Override
	public int[] sortArray(int[] arr) {
		sort(arr,0,arr.length-1);
		return arr;
	}

	private void sort(int[] arr,int l,int r) {
		if(l < r) {
			int mid=l+(r-l)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
			
		}
	}

	// leftarr[ l....mid] rightarray[mid+1 ....r]
	private void merge(int[] arr, int l, int mid, int r) {
		int n1=mid-l+1;
		int n2=r-mid;
		
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++) 
			left[i]=arr[l+i];
		for(int j=0;j<n2;j++) 
			right[j]=arr[mid+1+j];
		
		int fill=l,i=0,j=0; // initial index of left & right
		
		while(i < n1 && j <n2) {
			if(left[i] < right[j]) {
				arr[fill]=left[i];
				i++;
			}else {
				arr[fill]=right[j];
				j++;
			}
			fill++;	
		}
		
		while(i < n1) {
			arr[fill]=left[i];
			i++;
			fill++;
		}
		
		while(j<n2) {
			arr[fill]=right[j];
			j++;
			fill++;
		}
		
	}
}
