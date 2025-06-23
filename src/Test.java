// Pass by reference Example.
// We can change the value of obj value using other obj
// see code below
class Vehicle  {
    String name;
    int cost;
    String color;
}
public class Test {
    public static void main(String[] args) {
        Vehicle  car1 = new Vehicle ();
        car1.name = "BMW";
        car1.color = "RED";
        car1.cost = 45000;

        System.out.println(car1.name);
        System.out.println(car1.color);
        System.out.println(car1.cost);

       Vehicle car2 = car1; // here i have assign the ref of car1 to car2

       car2.cost = 35000;   // i made changes in the car2 but its can refelct in the car1 as well
       car2.name = "Civic";
       car2.color = "Pink";

       System.out.println(car1.name); // if i print car1 obj then its holding the value of car2
       System.out.println(car1.color); // because we are using reference of car1 for car2
       System.out.println(car1.cost);

    }
}
