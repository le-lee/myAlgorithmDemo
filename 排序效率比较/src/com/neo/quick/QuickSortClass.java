package com.neo.quick;
/**
 * 插入排序：
 * 算法思想：
 * 最坏：
 * 最好：
 * 空间复杂度：
 * 时间复杂度：
 * 稳定性：
 * @author le
 *
 */
public class QuickSortClass {
	/**
	 * 一趟快速排序，对array[low]到array[high]部分进行一趟排序，
	 * 并得到基准的位置，湿的排序后的结果满足其之后（前）的记录的关键字均不小于（不大于）基准记录
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public static int sort(int []array, int low, int high){
		int x = array[low];		//选择基准记录
		while(low < high){
			while(low < high && array[high] >= x)	//high从右往左找小于x的记录
				high--;
			if(low < high){		//找到小于x的记录，则送入空单元
				array[low] = array[high]; 
				low++;
			}
			while(low < high && array[low] < x)		//low从左往右找大于x的记录
				low++;	
			if(low < high){		//找大于x的记录，则宋玉空单元
				array[high] = array[low];	
				high--;
			}
		}
		array[low] = x;			//将基准记录保存到low = high的位置
		return low;				//返回基准记录的位置
	}
	/**
	 *对记录数组array用快速排序算法进行排序
	 * @param array
	 */
	public static void quickSort(int []array){
		int low = 0;
		int high = array.length - 1;
		if(low < high){
			int pos = sort(array, low, high);	//调用一次快速排序，以枢轴元素为界划分两个字表
			sort(array, low, pos-1);			//对左部分字表进行快速排序
			sort(array, pos+1, high);			//对右部分字表进行快速排序
		}
	}
	public static void main(String[] args) {
		int a[] = {5,4,9,8,7,6,0,1,3,2};
		quickSort(a);
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}
}
