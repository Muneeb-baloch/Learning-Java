// Enum Example
// we can create multiple instance/ object in enums
// enum can't be extended
// we can set/get the value of enum using setter getter
public enum Laptopenum {

    Macbook(2500), Hp(1800), Dell(1800), Asus(2200); // objects and prices

    private int price;
    private Laptopenum (int price){ // constructor to set the price this is
        // mandatory step if you want to set the price or value
        this.price = price;
    }

    public  int getPrice(){
        return price;
    }

    public  int SetPrice(int price){
        this.price = price;
        return price;
    }
    public static void main(String[] args) {
//        Laptopenum lap = Laptopenum.Hp;
//        System.out.println(lap);
//        System.out.println(lap.price);
//        lap.SetPrice(00);
//        Laptopenum lap1 = Laptopenum.Macbook;
//        System.out.println(lap1);
//        System.out.println(lap1.price);
        Laptopenum [] val = Laptopenum.values(); // here we printing all the object and values/ price
        for (Laptopenum lap2 : val){
            System.out.println(lap2 + "" +  lap2.getPrice());
        }
    }
}
