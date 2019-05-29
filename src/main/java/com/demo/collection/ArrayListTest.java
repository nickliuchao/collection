package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromHeaderTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>(DataNum);
		int i = 0;
		
		long timeStart = System.currentTimeMillis();
		
		while (i < DataNum) {
			list.add(0,i+"aaavvv");
			i++;
		}
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合头部位置新增元素花费的时间" + (timeEnd - timeStart));
	}
	

	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromMidTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>(DataNum);
		int i = 0;
		
		long timeStart = System.currentTimeMillis();
		while (i < DataNum) {
			int temp = list.size();
			list.add(temp/2+"aaavvv");
			i++;
		}
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合中间位置新增元素花费的时间" + (timeEnd - timeStart));
	}
	

	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromTailTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>(DataNum);
		int i = 0;
		
		long timeStart = System.currentTimeMillis();
		
		while (i < DataNum) {
			list.add(i+"aaavvv");
			i++;
		}
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合尾部位置新增元素花费的时间" + (timeEnd - timeStart));
	}


	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromHeaderTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		
		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}
		long timeStart = System.currentTimeMillis();
		i=0;
		
		while (i < DataNum) {
			list.remove(0);
			i++;
		}
		
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合头部位置删除元素花费的时间" + (timeEnd - timeStart));
	}
	

	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromMidTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}
		long timeStart = System.currentTimeMillis();
		i=0;
		
		while (i < DataNum) {
			int temp = list.size();
			list.remove(temp/2);
			i++;
		}
		
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合中间位置删除元素花费的时间" + (timeEnd - timeStart));
	}
	

	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromTailTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}

		long timeStart = System.currentTimeMillis();
		
	    i=0;
		
		while (i < DataNum) {
			int temp = list.size();
			list.remove(temp-1);
			i++;
		
		}
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList从集合尾部位置删除元素花费的时间" + (timeEnd - timeStart));
	}


	/**
	 * 
	 * @param DataNum
	 */
	public static void getByForTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;

		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}
		long timeStart = System.currentTimeMillis();

		for (int j = 0; j < DataNum; j++) {
			list.get(j);
		}

		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList for(;;)循环花费的时间" + (timeEnd - timeStart));
	}
	

	/**
	 * 
	 * @param DataNum
	 */
	public static void getByIteratorTest(int DataNum) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		
		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}
		long timeStart = System.currentTimeMillis();
		
		for (Iterator<String> it=list.iterator(); it.hasNext();) {
			it.next();
		}
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("ArrayList 迭代器迭代循环花费的时间" + (timeEnd - timeStart));
	}

}
