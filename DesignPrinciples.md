# Design Principles

* Separate what vary from what stays the same.
* Program to interface, not an implementation.
* Favor composition over inheritance.
* THE POWER OF LOOSE COUPLING: Strive for loosely coupled designs between objects than interact (you know only what
interface implements...).
* OPEN-CLOSED: Classes should be open for extension but closed for modification.
* THE DEPENDENCY INVERSION: Depend upon abstractions. Do not depend upon concrete classes.
* THE PRINCIPLE OF LEAST KNOWLEDGE: talk only to your immediate friends (or reduce interaction between objects to just
a few close "friends"). This principle tell us we should only invoke methods that belong to:
<br>- The object itself
<br>- Objects passed in as a parameter to the method
<br>- Any object the method creates or instantiates
<br>- Any components of the object
* Hollywood principle: don't call us, we'll call you. High level components call low level components.
* A class should have only one reason to change.

# STRATEGY
Define a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary
independently from clients that use it.

# DECORATOR
Attach additional responsabilities to an object dinamically. Provide a flexible alternative to subclassing for extending
functionality.

# FACTORY METHOD
Defines an interface for creating an object but let's subclasses decide which class to instantiate.

# ABSTRACT FACTORY PATTERN
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

# SINGLETON
Ensure a class has only an instance and provides a global point to access it.
But.... Why Singletons are evil? https://blogs.msdn.microsoft.com/scottdensmore/2004/05/25/why-singletons-are-evil/

1) Singletons frequently are used to provide a global access point for some service.
True, they do this, but at what cost? They provide a well-known point of access to some service in your application so
that you don’t have to pass around a reference to that service. How is that different from a global variable? (remember,
globals are bad, right???) What ends up happening is that the dependencies in your design are hidden inside the code,
and not visible by examining the interfaces of your classes and methods. You have to inspect the code to understand
exactly what other objects your class uses. This is less clear than it could be. The urge to create something as a
global to avoid passing it around is a smell in your design; it is not a feature of globals/singletons. If you examine
your design more closely, you can almost always come up with a design that it is better and does not have to pass around
 tramp data to every object and method.

2) Singletons allow you to limit creation of your objects.
This is true, but now you are mixing two different responsibilities into the same class, which is a violation of the
Single Responsibility Principle. A class should not care whether or not it is a singleton. It should be concerned with
its business responsibilities only. If you want to limit the ability to instantiate some class, create a factory or
builder object that encapsulates creation, and in there, limit creation as you wish. Now the responsibilities of
creation are partitioned away from the responsibilities of the business entity.

3) Singletons promote tight coupling between classes
One of the underlying properties that makes code testable is that it is loosely coupled to its surroundings. This
property allows you to substitute alternate implementations for collaborators during testing to achieve specific
testing goals (think mock objects). Singletons tightly couple you to the exact type of the singleton object, removing
the opportunity to use polymorphism to substitute an alternative. A better alternative, as discussed in the first point
above, is to alter your design to allow you to pass references to objects to your classes and methods, which will reduce
 the coupling issues described above.

4) Singletons carry state with them that last as long as the program lasts
Persistent state is the enemy of unit testing. One of the things that makes unit testing effective is that each test has
 to be independent of all the others. If this is not true, then the order in which the tests run affects the outcome of
 the tests. This can lead to cases where tests fail when they shouldn’t, and even worse, it can lead to tests that pass
 just because of the order in which they were run. This can hide bugs and is evil. Avoiding static variables is a good
 way to prevent state from being carried from test to test. Singletons, by their very nature, depend on an instance that
  is held in a static variable. This is an invitation for test-dependence. Avoid this by passing references to objects
  to your classes and methods.

# COMMAND PATTERN
Encapsulates a request as an object, thereby letting you parametrize other objects with different requests, queue or
log requests, and support undoable operations (processing queues by mulitple threads, store requests to support 
recovery after server crash events).

# NULL OBJECT
Useful when you don't have a meaningful object to return and yet you want to remove the responsibility for handling
NULL from the client.

# ADAPTER PATTERN
Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that
couldn't otherwise because of incompatible interfaces.

# FACADE PATTERN
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface that makes
the subsystem easier to use.

# TEMPLATE METHOD
Define the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses
redefine certain steps of an algorithm without changing the algorithm's structure.

# ITERATOR
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

# COMPOSITE
Allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
individual objects and compositions of objects uniformly.

# STATE
Allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.

# PROXY
Provide a surrogate or placeholder for another object to control access to it.
There are different variants of the Proxy Pattern:
- Remote Proxy manages interaction between a client and remote object.
- Virtual Proxy control access to an object that is expensive to instantiate.
- Protection Proxy controls access of an object based on the caller.
- Other variants: caching proxies, firewall proxy, synchronization proxy, etc.

# BUILDER
Used to encapsulate the construction of a product and allow it to be constructed in steps.
