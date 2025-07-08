//  Abstract class we can't create the object of absract class
// Abstract class can hold abstract method and normal methods
// if child class don't want to implement abstract method child class need to be abstract as well
//


 abstract class ncar {

    public void Music(){
        System.out.println("play music");
    }
    public  abstract void Drive ();
    public abstract void Drift ();
        }

  class Markx extends ncar{
    public void Drive (){
        System.out.println("Driving");
    }
    public void Drift (){
        System.out.println("Drifting MF");
    }
    public void Music (){
        System.out.println("Tum nazar men rhao");
    }
  }
public class DemoAbstract {
    public static void main(String[] args) {
        Markx markx = new Markx();
        markx.Drive();
        markx.Music();
        markx.Drift();
    }
}
