package com.demo.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author liuchao
 *
 */
public class LinkedListTest {
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromHeaderTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            list.addFirst(i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合头部位置新增元素花费的时间"+(timeEnd-timeStart));
    }
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromMidTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
        	int temp = list.size();
            list.add(temp/2, i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合中间位置新增元素花费的时间"+(timeEnd-timeStart));
    }
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void addFromTailTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合尾部位置新增元素花费的时间"+(timeEnd-timeStart));
    }
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromHeaderTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
       
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }
        long timeStart=System.currentTimeMillis();
        
        i=0;
        while(i<DataNum)
        {
            list.removeFirst();
            i++;
        }
        
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合头部位置删除元素花费的时间"+(timeEnd-timeStart));
    }
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromMidTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        
        int i=0;
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }
        
        long timeStart=System.currentTimeMillis();
        
        i=0;
        while(i<DataNum)
        {
        	int temp = list.size();
            list.remove(temp/2);
            i++;
        }
        
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合中间位置删除元素花费的时间"+(timeEnd-timeStart));
    }
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void deleteFromTailTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }
        
        long timeStart=System.currentTimeMillis();
        
        i=0;
        while(i<DataNum)
        {
            list.removeLast();
            i++;
        }
        
        
        long timeEnd=System.currentTimeMillis();
    
        System.out.println("LinkedList从集合尾部位置删除元素花费的时间"+(timeEnd-timeStart));
    }
	
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void getByForTest(int DataNum) {
		LinkedList<String> list = new LinkedList<String>();
		int i = 0;
		
		while (i < DataNum) {
			list.add(i + "aaavvv");
			i++;
		}
		long timeStart = System.currentTimeMillis();
		
		for (int j=0; j < DataNum ; j++) {
			list.get(j);
		}
		
		long timeEnd = System.currentTimeMillis();

		System.out.println("LinkedList for(;;)循环花费的时间" + (timeEnd - timeStart));
	}
	
	/**
	 * 
	 * @param DataNum
	 */
	public static void getByIteratorTest(int DataNum) {
		LinkedList<String> list = new LinkedList<String>();
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

		System.out.println("LinkedList 迭代器迭代循环花费的时间" + (timeEnd - timeStart));
	}
}
