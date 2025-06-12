public class Car {

   private String model;
   private String color;
   private int price;


   Car(String model, String color, int price){

       this.model=model;
       this.color=color;
       this.price=price;
   }
     String getModel(){
        return this.model;
    }
    String Setcolor (String color){
        return   this.color=color;
    }

    String Setmodel (String model){
     return   this.model=model;
    }

    void printinfo(){
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Car car = new Car("Mark x", "Black", 30000);
        car.Setcolor("Pink");
        car.Setmodel("Mehran the boss");


        car.printinfo();



    }
}
