package kush.strategy;

import java.util.Arrays;

public class Runner {
public static void main(String[] args) {
	int arr[]= {3,23,4,34,567,76,21};
	//List<Integer> list=Arrays.asList(3,23,4,34,567,76,21);

	MyStrategy strategy=new MergeSort();
	UseStrategy us=new UseStrategy(strategy);
	int ans[]=us.performStrategy(arr);
	System.out.print(Arrays.toString(ans));
	
/*	
	MergesortWithList obj=new MergesortWithList();
	List<Integer> a=obj.mergeSort(list);
	a.forEach(val-> System.out.println(a+" "));
	*/
}
}
