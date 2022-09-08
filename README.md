# Desing Patterns
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.

## Creational Design Patterns 
Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

* Singleton: *restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.*
* Factory: *is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.*
* Abstract Factory: *we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class that will return the sub-class based on the input factory class.*
* Builder: *builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.*
* Prototype: *is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.*

## Structural Design Patterns
Structural patterns provide different ways to create a class structure, for example using inheritance and composition to create a large object from small objects.

* Adapter: *is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter.*