public  class Cat {
    private  static int catCount =0;
     private int age;
     private  String name;
     private  int cl;
    public void setinfo(int age, String name, int cl) {
        this.age = age;
        this.name = name;
        this.cl = cl;
    }

    public Cat () {

        catCount ++;


    }
    public static int getCatCount(){
        return catCount;

    }

    public void showinfo(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(cl);
    }
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());
        Cat cat1 = new Cat();

        cat1.setinfo(4,"lexa", 5);
        cat1.showinfo();
        Cat cat2 = new Cat();

        System.out.println(Cat.getCatCount());


    }




}