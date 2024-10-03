package com.bptn.course._11_access_modifiers._02_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA; //import

public class ClassB {
	
	public static void main(String[] args) {
		ClassA myObj = new ClassA();
		
		myObj.defaultMethod();
		
	}

}
