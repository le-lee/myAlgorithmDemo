package com.neo.bubble;
/**
 * ð�����򣬼����Ǵ�С������������ĵ�λ����λ����ô������ˮ�ݣ�Խ�ߵĵط���Խ����ˮ���ˮ��Խ������Խ��
 * �㷨˼�룺ÿһ�α����Ժ󣬲��������n����¼�е�����¼����λ�ڵ�nλ
 * ��ã�˳��	O(n)
 * �������	O(n^2)
 * �ռ临�Ӷȣ�	O(1)
 * ƽ���㷨���Ӷȣ�
 * �ȶ��ԣ��ȶ�������Ƚϴ�ǰ�������㷨��if(array[i+1] < array[i])��֤����ͬ�ĺ���Ԫ�ز����ŵ�ǰ��
 * @author le
 *
 */
public class BubbleSortClass {
	public static int[] bubbleSort(int array[]){
		int []local = array;
		int n = array.length;
		int tmp = 0;
		//��1�δӿ�ͷ��ʼ���ͻ�Ƚ�n��,�����һ����������2�δ�ͷ��ʼ���Ƚ�n-1�Σ��������ڶ�������
		for(int j = n; j>0; j--){//���ƱȽϵĴ�����forִ����n+1�Σ�����ѭ����ִֻ��n��		n+1
			for(int i = 0; i<j-1; i++){									//n(n+1)
				if(array[i+1] < array[i]){
					tmp = array[i];
					array[i] = array[i+1];
					//������ʾ��Ҫ����������ʼֵ,��������쳣��������Ԫ��ָ��δ��ֵ��Ԫ��
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
