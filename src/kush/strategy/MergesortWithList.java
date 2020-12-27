package kush.strategy;

import java.util.ArrayList;
import java.util.List;

public class MergesortWithList {
/*[3,23,4,34,567,76,21]
 mergeSort [3, 23, 4] - [34, 567, 76, 21]
 mergeSort [3] - [23, 4]
 mergeSort [23] - [4]
 Inside merge [23] - [4] merged list - [4, 23]
 Inside merge [3] - [4, 23] merged list - [3, 4, 23]
 mergeSort [34, 567] - [76, 21]
 mergeSort [34] - [567]
 Inside merge [34] - [567] merged list - [34, 567]
 mergeSort [76] - [21]
 Inside merge [76] - [21] merged list - [21, 76]
 Inside merge [34, 567] - [21, 76] merged list - [21, 34, 76, 567]
 Inside merge [3, 4, 23] - [21, 34, 76, 567] merged list - [3, 4, 21, 23, 34, 76, 567]
 */
	
	public List<Integer> mergeSort(List<Integer> list){
		if(list.size() < 2)
			return list;
		
		List<Integer> leftHalf=list.subList(0, list.size()/2);
		List<Integer> rightHalf=list.subList(list.size()/2, list.size());
	 System.out.println(" mergeSort "+leftHalf+" - "+rightHalf);
		return merge(mergeSort(leftHalf),mergeSort(rightHalf));
	}

	private List<Integer> merge(List<Integer> l, List<Integer> r) {
	  List<Integer> merged=new ArrayList<>(l.size()+r.size());
	  int i=0,j=0;
	  System.out.print(" Inside merge "+l+" - "+r);
	  while(i < l.size() && j<r.size()) {
		  if(l.get(i) < r.get(j)) {
			  merged.add(l.get(i));
			  i++;
		  }else {
			  merged.add(r.get(j));
			  j++;
		  }
	  }
	  
	  while(i < l.size()) {
		  merged.add(l.get(i));
		  i++;
	  }
	  
	  while(j < r.size()) {
		  merged.add(r.get(j));
		  j++;
	  }
	  System.out.println(" merged list - "+merged);
		return merged;
		
	}
}
