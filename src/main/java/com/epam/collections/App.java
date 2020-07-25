package com.epam.collections;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.util.Arrays;
public class App 
{
    public static void main( String[] args )
    {
    	customcollections<Integer> list=new customcollections<Integer>(11);
    	Scanner sc=new Scanner(System.in);
    	    	System.out.println("Adding the elements to the list");
    		list.add(11);
    		list.add(12);
    		list.add(13);
    		list.add(14);
    		list.add(15);
    		list.add(16);
    		list.add(17);
    		list.add(18);
    		list.add(19);
    		list.add(20);
    		System.out.println("Print elements in the list");
    		list.print();
    		
    		System.out.println("Removed element is : "+list.remove(3));
    		
    		int index=sc.nextInt();
    		System.out.println("The element present at given index is ");
    		System.out.println(list.get(index));
    	

    }
}
