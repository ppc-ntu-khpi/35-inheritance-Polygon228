package test;
import domain.Lynx;


 /**
 * The class Animal test
 */ 
public class AnimalTest {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Lynx lynx = new Lynx();
        System.out. println(lynx);
        lynx.walk();
        lynx.eat();
        lynx.sleep();
    }

}
