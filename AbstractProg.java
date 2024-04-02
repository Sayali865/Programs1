package com.javademo;
// no concrete class will have abstract method
//It is not compulsory that abstract class must have 
//abstract methods. It may or may not have abstract methods
//.But the class which has at least one abstract method must
//be declared as abstract.

//Abstract Class can be a combination of concrete and 
//abstract methods.

/*Any class extending an abstract class must implement
 *  all abstract methods. If it does not implement, 
 *  it must be declared as abstract.*/

// abstract method cannot be static

// Constructor and field(variables and data members) cannot be decleared abstract
abstract class Animal  
{
	 int i;
	 
	 public Animal() 
	{
		
	}
	abstract void soundOfAnimal();//Abstract method // by default public cannot be private
	
		void display()// Concrete method
		{
			
		}
		void show()
		{
			
		}
		//abstract void abc();
	}

	class Cat extends Animal
	{

		@Override
		void soundOfAnimal() {
			// TODO Auto-generated method stub
			System.out.println("Meow");
		}

		@Override
		void abc() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class Cow extends Animal
	{

		@Override
		void soundOfAnimal() {
			// TODO Auto-generated method stub
			System.out.println("Hamm");
		}

		@Override
		void abc() {
			// TODO Auto-generated method stub
			
		}
		
	}

public class AbstractProg {

	public static void main(String[] args) {
		// you cannot create object of a class
		//Animal a1= new Animal();
		
		Cat c1= new Cat();// concrete class cat means it dont have  abstract keyword
		Animal a1 = c1;// animal abstract class
		
		//Concrete class object is auto upcasted to the abstract class
		
		//Cow c2= new Cow();
        
	}

}
