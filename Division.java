package com.codegnan.javaapp0302.mathematics;
public class Division{
	public int divide(int num1,int num2);
	
	System.out.println("divide started");

	System.out.println("1st value " +num1);
	System.out.println("2nd value " +num2);
	
	int result=0;
	
	try{
		result=num1/num2;
	  }catch(ArthematicException arthematicException){
		
		  
	  }
	  
	  System.out.println("1st value/2nd value is " +result);
	  
	  System.out.println("divide ended");
	  
	  return result;
	}
	
}