package com.test;

public class Stringbuffere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create new StringBuffer object
        StringBuffer sbuffer = new StringBuffer(
                "Popular frameworks in Java are:");
 
        // 1. append 1st line-break
        sbuffer.append(System.getProperty("line.separator"));
 
        // 2. add 1st framework-name and then 2nd line-separator
        sbuffer.append("Spring");
        sbuffer.append(System.getProperty("line.separator"));
 
        // 3. add 2nd framework-name and then 3rd line-separator
        sbuffer.append("Hibernate");
        sbuffer.append(System.getProperty("line.separator"));
 
        // add 3rd framework-name
        sbuffer.append("Struts");
 
        // pretty print output to console
        System.out.println(sbuffer.toString());
	}

}
