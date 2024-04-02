package com.javademo;
//Interfaces, another way of implementing abstraction in java

// all the interface in java are abstract by default

// by default all the methods in a interfaces are abstract

//All the methods in the interface are pure abstract method till java 8.1 version
//After 1.8 you can add concrete method in the interface but they must be be static or default
//by default the fileds in the interfaces are public.
// Cannot create a object of Interface
//we cannot create iib and sib in interface
interface InterfaceSample
{
	int i=0;
	 void display();
	 void show();
	 
}
interface Sample{
	void xyz();
}
class Abc implements InterfaceSample , Sample
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(i++);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSample i=new InterfaceSample();		

	}

}
