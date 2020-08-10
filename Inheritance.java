/*
Inheritance.........instead of re-inventing a class we jus use the other classes using inheritance.
c++ supports multiple inheritances whereas java supports only single inhertance but we can make it multiple (in java) by using kinda long ways
In java polymorphism is automatic but in c++ its not. 
A static method can be overridden by static and so is instance by instance.
*/

//abstract class Animal{		//Animal cant exist i.e, new Animal() not allowed since dog,cat ,lion can be animal but animal no thing! ..on adding abstract
class Animal{
	int age=10;
	static void eat(){ //on making this static this eat method can be overridden by static method only by static methods in the dog or cat or lion 
		System.out.println("lets not be specific about food");
	}
	Animal(){
		System.out.println("u are inside my belly lets keep it that way... caus zero pa... sounds lame");
	}
}

class Sheep extends Animal{
	int age=6;
	static void eat(){
		System.out.println("I eat grass");
	}
	Sheep(){
		System.out.println("Sheep Constructor called");
	}
}
class Cat extends Animal{
	static void eat(){
		System.out.println("Stop threatening my life!.....I eat rats and yeah grass as well");
	}
	Cat(){
		System.out.println("Cat Constructor called");
	}
}

class Dog extends Animal{
	int age=15;
	static void eat(){
		System.out.println("I eat cat");
	}
	Dog(){
		System.out.println("Dog Constructor called");
	}
}

class Lion extends Animal{
	static void eat(){
		System.out.println("I eat sheep");
	}	
	Lion(){
		System.out.println("Lion Constructor called");
	}
}

class Inheritance{
	public static void main(String[] args)
		{
		
			/*Animal a =new Animal();
			a.eat();
			a=new Cat();
			a.eat();  //polymorphism where the reference to one object is lost so that it can point to another object
			a=new Dog();
			a.eat();
			a=new Lion();
			a.eat();*/
			
			/*Animal Zoo[];				//														     |
			Zoo=new Animal[3]; 	//Advantages of polymorphism.. \|/
			Zoo[0]=new Dog();		//can accomodate different classes in an array
			Zoo[1]=new Cat();
			Zoo[2]=new Lion();
			for(Animal a:Zoo){	
				a.eat();	//calls respective memeber of animal's eat method
				System.out.println(a.age); //calls animals age since polymorphism doesnt apply to variables
//as far as methods or behaviour concerned ploymorphism comes into picture but in case of states or variables decision is taken at compile time. 
			}*/
			
			//Dog d=new Dog(); 		//now we get the states of dog
			//System.out.println(d.age);
		
			Animal a=new Animal();
			System.out.println(a.age); //by making all the methods static polymorphism doeesnt work
			a.eat();
		}
}











