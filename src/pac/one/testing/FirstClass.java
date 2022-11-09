
						/* 
  						*Requirements*
  						
 * Create a project to give any name, create a package, and inside the package, create a class, then write a program to print "Hello World."
 * Update the name of the package and class name.
 * Write a program to print the value of a variable that contains a text.
 * Write a program to declare all primitive data types of variables and print the values.
 
 
 * Declare three types of variables and print the values of all those variables.
 * Write a program to print the value of a variable from Class A into Class B (Class name is for an example here. Give the separate names of your classes)
 * Declare a variable outside the primary method and print the value inside the main method without creating any object.

						 		*/

package pac.one.testing;
public class FirstClass {
	
	public static void main(String[] args) {

	//• Create a class, then write a program to print "Hello World."
		
		System.out.println("Hello everyone,");
		
		

	//•	Write a program to print the value of a variable that contains a text.
		String myName = "Ashraful ";
		System.out.println("");
		//System.out.println(myName);
		
		

	//•	Write a program to declare all primitive data types of variables and print the values.
		
		String lastname = "khan";
		int age = 15;
		float ageinmonth = 180.2f;
		double ageinweeks = 100.80;
		boolean myboolean = true;
		char firstcharacter= 'A';
	
	//•	Printing Values.
		System.out.println(myName  + lastname + " is " + age + " years old." + " Which is " + ageinmonth + " in months. ");
		System.out.println("Also "+ ageinweeks + " in weeks. " + "This is " + firstcharacter + " "  + myboolean + " statement." + '\n');
	
	//Creating objects to pull info from other class.	
		Info_for_pulling_to_other_classes hasbul = new Info_for_pulling_to_other_classes();
		System.out.println("Furthermore, " + hasbul.subName + " is "+ hasbul.subAge+ " years old, but only " + hasbul.subHeight + " feet tall.");
	
		
	//Calling variable without creating object using the static method.	
		
		System.out.println('\n'+Info_for_pulling_to_other_classes.lastLine);
		
	}

}

