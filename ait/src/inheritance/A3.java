package inheritance;

class A3
{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Dog3 extends A3
{  
void bark()
{
	System.out.println("barking...");
	}  
}  
class Cat extends Animal
{  
void meow()
{
	System.out.println("meowing...");
	}  
}  
class TestInheritance3
{  
public static void main(String args[])
{  
Cat c=new Cat();
Dog3 d=new Dog3();
c.meow();  
c.eat();  
d.bark();//C.T.Error  
}
}  
