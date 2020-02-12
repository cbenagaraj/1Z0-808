package com.free_braindumps;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nagarajan Chandramohan
 *
 */
public class Question12_ListIndexOf {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		int f = ps.indexOf(p2);
		
		if(f>0) {
			System.out.println("Mike Found");
		}
		System.out.println("f is : "+ f);
	}
	
	

}

/**
 * 
 * @author Nagarajan Chandramohan
 *
 */
class Patient{
	String name;
	
	/**
	 * 
	 * @param name
	 */
	public Patient(String name) {
		this.name = name;
	}
	
}
