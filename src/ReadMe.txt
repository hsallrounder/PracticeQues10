Practice Questions

1) Create a package called com.automobile. Define an abstract class called Vehicle.
Vehicle class has the following abstract methods:
public String getModelName()
public String getRegistrationNumber()
public String getOwnerName()

Create TwoWheeler subpackage under Automobile package
Hero  class extends  Automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void radio()
– provides facility to control the radio device
Honda class extends com.automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer()
– provides facility to control the cd player device which is available in the car.
Create a test class to test the methods available in all these child class.

2) A HighSchool application has two classes: the Person superclass and the Student subclass.
Using inheritance, you will create two new classes, Teacher and CollegeStudent.
A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns)
and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”).
The CollegeStudent class will extend the Student class by adding a year (current level in college)
and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

3) Create a base class Fruit which has name, taste and size as its attributes.
A method called eat() is created which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

4) Write a program to create a class named shape.
It should contain 2 methods- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
For this class we have three sub classes- Circle, Triangle and Square
and each class override the parent class functions- draw () and erase ().
The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
Create objects of Circle, Triangle and Square in the following way
and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();