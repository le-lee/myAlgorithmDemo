package com.neo.compare;

import com.neo.bubble.BubbleSortClass;
import com.neo.select.SelectSortClass;
import com.neo.utils.ProductRandom;

public class Compare {
	public static void main(String[] args) {
		int []array = ProductRandom.productRandomArray();
		System.out.println(array.length);
		for(int i = 0; i<20; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Ñ¡ÔñÅÅÐò");
		long beforeSelect = System.currentTimeMillis();
		int []selectedArray = SelectSortClass.selectSort(array);
		long afterSelect = System.currentTimeMillis();
		System.out.println("Ñ¡ÔñÅÅÐòºÄÊ±£º"+ (afterSelect - beforeSelect) +"ºÁÃë");
		for(int i = 0; i<20; i++){
			System.out.print(selectedArray[i]+" ");
		}
		System.out.println();
		System.out.println("Ã°ÅÝÅÅÐò");
		long beforeBubble = System.currentTimeMillis();
		int []bubbleArray = BubbleSortClass.bubbleSort(array);
		long afterBubble = System.currentTimeMillis();
		System.out.println("Ã°ÅÝÅÅÐòºÄÊ±£º"+ (afterBubble - beforeBubble) +"ºÁÃë");
		for(int i = 0; i<20; i++){
			System.out.print(bubbleArray[i]+" ");
		}
	}
}
