package com.neo.quick;
/**
 * ��������
 * �㷨˼�룺
 * ���
 * ��ã�
 * �ռ临�Ӷȣ�
 * ʱ�临�Ӷȣ�
 * �ȶ��ԣ�
 * @author le
 *
 */
public class QuickSortClass {
	/**
	 * һ�˿������򣬶�array[low]��array[high]���ֽ���һ������
	 * ���õ���׼��λ�ã�ʪ�������Ľ��������֮��ǰ���ļ�¼�Ĺؼ��־���С�ڣ������ڣ���׼��¼
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public static int sort(int []array, int low, int high){
		int x = array[low];		//ѡ���׼��¼
		while(low < high){
			while(low < high && array[high] >= x)	//high����������С��x�ļ�¼
				high--;
			if(low < high){		//�ҵ�С��x�ļ�¼��������յ�Ԫ
				array[low] = array[high]; 
				low++;
			}
			while(low < high && array[low] < x)		//low���������Ҵ���x�ļ�¼
				low++;	
			if(low < high){		//�Ҵ���x�ļ�¼��������յ�Ԫ
				array[high] = array[low];	
				high--;
			}
		}
		array[low] = x;			//����׼��¼���浽low = high��λ��
		return low;				//���ػ�׼��¼��λ��
	}
	/**
	 *�Լ�¼����array�ÿ��������㷨��������
	 * @param array
	 */
	public static void quickSort(int []array){
		int low = 0;
		int high = array.length - 1;
		if(low < high){
			int pos = sort(array, low, high);	//����һ�ο�������������Ԫ��Ϊ�绮�������ֱ�
			sort(array, low, pos-1);			//���󲿷��ֱ���п�������
			sort(array, pos+1, high);			//���Ҳ����ֱ���п�������
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
