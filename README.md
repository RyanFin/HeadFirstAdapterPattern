# HeadFirstAdapterPattern

## Adapter Pattern
The adapter pattern uses adapters to convert adaptees so that clients can use the target interface(interface class thatt the adaptee is going to be converted into) with the adaptees behaviours. There are two types of adapters: **class adapter** and **object adapters**. The class adapter is impossible in Java as Java cannot inherit from more than one superclass at the same time. The object adapter method will be implemented in this project. The *target* interface represents what you *wish* to transform the adaptee into.

### Functionality of Object Adapters in Java
Create an adapter that takes the methods of the target interface (the one you wish to convert the adaptee into), but use the adaptee method calls within these functions in the concrete implementation.

### Project Generation

- Maven
	- Maven Script: mvn archetype:generate -DgroupId=com.headfirst -DartifactId=AdapterProject	  	
