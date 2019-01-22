# HeadFirstAdapterPattern

## Adapter Pattern
The intent of the adapter pattern is to convert an interface into another.

The adapter pattern uses adapters to convert adaptees so that clients can use the target interface(interface class that the adaptee is going to be converted into) with the adaptees behaviours. There are two types of adapters: **class adapter** and **object adapters**. 


The class adapter uses inheritance, whereas the object adapter uses composition relationship and ties the adaptee to the adapter within the constructor.

Composition example (Object Adapter): Duck turkeyAdapter = **new TurkeyAdapter(turkey);** 
	- Ties the adaptee (turkey) to the TurkeyAdapter by specifying it as a parameter in its constructor.

The class adapter is impossible in Java as Java cannot inherit from more than one superclass at the same time. The object adapter method will be implemented in this project. The *target* interface represents what you *wish* to transform the adaptee into.


### Functionality of Object Adapters in Java
Create an adapter that takes the methods of the target interface (the one you wish to convert the adaptee into), but use the adaptee method calls within these functions in the concrete implementation.

### Project Generation

- Maven
	- Maven Script: mvn archetype:generate -DgroupId=com.headfirst -DartifactId=AdapterProject	  	
