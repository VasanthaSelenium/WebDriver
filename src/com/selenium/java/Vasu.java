package com.selenium.java;

public class Vasu 
{
//variables
	int i=40;
	
	//method
	public void add()
	{
		int a=30;
		int b=90;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		//object
		Vasu v=new Vasu();
		v.add();//method
		System.out.println(v.i);//variable
	}
}
