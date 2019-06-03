# ObserverPattern
Java implementation of the Observer Design Pattern<br/>
We use the Observer Pattern when we want a class to listen to another, without any dependencies,
For example in a GUI program, if a user clicks on a Button, it should raise an event on the class that implements the button
the event triggers a method, and that method calls for some method of  the listening class.
That means that we can separate the class of the button from whatever class that actually implements the funcionality of that button.
All the class that is being listened cares,t is that the listener implements some method of what to do when the button is pressed, that way, no class should intefer with another, or have any dependencies.
Common in Gui and event driven programs.
