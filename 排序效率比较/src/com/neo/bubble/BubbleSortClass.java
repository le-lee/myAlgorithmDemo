package com.neo.bubble;
/**
 * 冒泡排序，假设是从小到大排序，数组的低位到高位，那么就像是水泡，越高的地方，越靠近水面的水泡越大，数就越大
 * 算法思想：每一次遍历以后，参与排序的n个记录中的最大记录将会位于第n位
 * 最好：顺序	O(n)
 * 最坏：倒序	O(n^2)
 * 空间复杂度：	O(1)
 * 平均算法复杂度：
 * 稳定性：稳定，排序比较从前向后进行算法中if(array[i+1] < array[i])保证了相同的后面元素不会排到前面
 * @author le
 *
 */
public class BubbleSortClass {
	public static int[] bubbleSort(int array[]){
		int []local = array;
		int n = array.length;
		int tmp = 0;
		//第1次从开头开始，就会比较n次,到最后一个结束；第2次从头开始，比较n-1次，到倒数第二个结束
		for(int j = n; j>0; j--){//控制比较的次数，for执行了n+1次，但是循环体只执行n次		n+1
			for(int i = 0; i<j-1; i++){									//n(n+1)
				if(array[i+1] < array[i]){
					tmp = array[i];
					array[i] = array[i+1];
					//这里提示我要给变量赋初始值,避免出现异常，将数组元素指向未赋值的元素
					array[i+1] = tmp;
				}
			}
		}
		return local;
	}
	public static void main(String []args){
		int a[] = {5,4,9,8,7,6,0,1,3,2};
		long beforeTime = System.currentTimeMillis();
		bubbleSort(a);
		long afterTime = System.currentTimeMillis();
		System.out.println("It takes "+(afterTime - beforeTime) +" milliseconds");
		System.out.println(a.length);
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}
}
