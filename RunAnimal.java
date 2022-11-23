package Abstraction;
 
import java.util.*; 
public class RunAnimal { 
	public static void main(String[] args) { 

Scanner Rus = new Scanner(System.in); 

Bird b = new Bird(); 
Cat c = new Cat(); 
Dog d = new Dog(); 

System.out.print("Choose an Animal. Press 'B' for Bird, 'C' for Cat, 'D' for Dog: "); 

String Ssell = Rus.nextLine(); 

if(Ssell.equalsIgnoreCase("B")){ b.eat();b.sleep();b.makeSound(); 
} 
if(Ssell.equalsIgnoreCase("C")){ c.eat();c.sleep();c.makeSound(); 
} 
if(Ssell.equalsIgnoreCase("D")){ d.eat();d.sleep();d.makeSound(); 
}

 	}

 } 