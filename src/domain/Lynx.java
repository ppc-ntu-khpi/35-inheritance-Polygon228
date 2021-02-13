package domain;


 /**
 * The class Lynx extends predator
 */ 
public class Lynx extends Predator{


/** 
 *
 * Lynx
 *
 * 
 */
    public Lynx() { 

        this("Lynx", 60, 20);
    }
     


/** 
 *
 * Lynx
 *
 * @param name  the name
 * @param weight  the weight
 * @param height  the height

 */
    public Lynx(String name, int weight, int height) { 

        this.height = height;
        this.name = name;
        this.weight = weight;
    }


/** 
 *
 * Lynx
 *
 * @param name  the name
 * @return public
 */
     public Lynx(String name ) { 

        this(name, 55, 15);
    }
     
    @Override

/** 
 *
 * To string
 *
 
 */
    public String toString() { 

        return super.toString()+"\n I`m Lynx";
    }

    @Override

/** 
 *
 * Walk
 *
 */
    public void walk() { 

       System.out.println("Lynx is walking around..");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

       System.out.println("Lynx is eating now, make some noises woudn`t be the best idea");
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Lynx is sleeping now..");
        
    }
    
}
