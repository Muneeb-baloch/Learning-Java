// Here you can learn concept of abstract and interface

class Laptop implements   Computer {
    public void code(){
        System.out.println("Code, Compile & Run");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("Code, Compile & Run, Faster");

    }
}

interface Computer {
     void code();
}

class Developer {

    public void devApp(Computer lap){
        lap.code();

    }
}

public class Demo{
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer muneeb = new Developer();
        muneeb.devApp(desk);

    }
}