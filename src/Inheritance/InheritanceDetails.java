package Inheritance;
//INHERITANCE THAT ALLOW US TO CREATE A NEW CLASS FROM AN EXISTING CLASS
//inhertance is a reltship
//we use inhertance only if there exits an is a reltship two class
//ex
//superAdmin  is  a user
//surgeon  is    a doc
//dog is a animal
//public keyword=>
// Accessible from anywhere in the program.
//This means the class, method, or variable can be accessed from the same class, any other class, and even outside the package.
//private:
//Accessible only within the same class.
//Other classes (even subclasses) cannot access private members. It ensures encapsulation.
//protected:
//
//Accessible within the same package and by subclasses (even if they are in different packages).
//It provides a balance between public and private,
// giving some access to subclasses while still protecting the member from the general public.
// extends Keyword:
//The extends keyword is used to indicate that a class is inheriting (extending)
// another class. This establishes an "is-a" relationship between the parent (superclass) and child (subclass).
// The subclass inherits fields and methods from the superclass, but it can also have additional methods and fields.
// super Keyword:
//The super keyword is used to refer to the superclass (parent class) object or constructor
// from within a subclass. It can be used in two ways:
//
//Accessing superclass methods or fields: If a subclass overrides a method,
// you can use super.method() to call the method from the superclass.
//Calling the superclass constructor: You can use super() to invoke a constructor of the parent class.
//uses of inheritance
//It allows a class to inherit properties and behaviors (fields and methods) from another class.
// Here are the key uses of inheritance:
//Code Reusability: Avoids duplication by reusing existing code.
//Polymorphism: Supports dynamic method overriding.
//Maintainability: Centralized changes in parent class reflect across subclasses.
//Extensibility: Allows easy addition of new features to subclasses.
//Hierarchical Organization: Establishes relationships between classes.
//Controlled Access: Supports encapsulation through access control.
//Supports Abstraction: Enables the use of abstract classes and interfaces for design flexibility.
//types of inhertance
// Single Inheritance
//In single inheritance, a class inherits from one
// and only one superclass. This is the simplest form of inheritance
// where a subclass extends a single parent class.
//. Multilevel Inheritance
//In multilevel inheritance, a class inherits from a
// superclass, and another class can inherit from that subclass, forming a chain of inheritance.
// Hierarchical Inheritance
//In hierarchical inheritance, multiple classes
// inherit from a single parent class. This means more than one class shares a common superclass.
// Multiple Inheritance (Through Interfaces)
//Java does not support multiple inheritance with classes to avoid ambiguity,
// but it allows multiple inheritance using
// interfaces. This means a class can implement multiple interfaces,
// effectively inheriting from multiple sources.
//Hybrid inheritance is a combination of two or more types of inheritance. Java does not support hybrid inheritance
// directly due to the absence of multiple inheritance through classes. However,
// it can be achieved indirectly by using interfaces.
//abstract classes
//abstract class can not have a object ex
//abstract class abc{
// abc obj = new obj(); through an error
// }
//abstrackis useed with classes and method();
//abstract void methodname(){}
//abtract method do not have function body
//abstructionconcepts of oop that alows us to hide unnenscessary detail and slow needed information
public class InheritanceDetails {

}
