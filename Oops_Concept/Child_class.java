package Oops_Concept;

import Sanket.Oops_Concept.ParentEx;

public class Child_class extends ParentEx{

	
	public  void details()
	{
		
		System.out.println("This is child class and showing child details.");
	}
	
	public static void main(String[] args) {
		
		ParentEx obj1= new Child_class();
		obj1.details();
		
		
	}

}



