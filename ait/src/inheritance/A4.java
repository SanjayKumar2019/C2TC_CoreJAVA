package inheritance;

class A4 {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
	class Dogg extends A4 {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dogg labrador = new Dogg();

	    // access field of superclass
	    labrador.name = "Rohu";
	    labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();

	  }
	}