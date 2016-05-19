package com.neo.select;

public class SelectSortClass {
	public static int[] selectSort(int [] array){
		
		int tmp = 0;
		int flag = 0;
		int n = array.length;
		for(int i = 0; i<n; i++){
			tmp = array[i];
			flag = i;
			for(int j = i+1; j<n; j++){		//找最小的元素
				if(array[j]<tmp){
					tmp = array[j];
					flag = j;
				}
			}
			if(flag != i){		//判断最小元素是不是在当前查找范围的最前面
				array[flag] = array[i];
				array[i] = tmp;
			}
//			if(i<n-2)
//			System.out.print(" "+a[i+1]);
//			System.out.println(" "+i+" ");
		}
		int []local =array;
		return local;
	}
	public static void main(String []args){
		int a[] = {5,4,9,8,7,6,0,1,3,2};
		
		int []b = selectSort(a);
		System.out.println(a.length);
		for(int i = 0; i<a.length; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println("\n");
	}
}
//如何用程序语言来说话
