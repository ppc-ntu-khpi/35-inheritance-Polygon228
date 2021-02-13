package domain;


 /**
 * The class Animal
 */ 
public class Animal  {

    protected String name;
  

    protected int height;

    protected int weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        this.name = "An initialized animal";
        this.height = 50;
        this.weight = 20;
    }
    


/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Animal is sleeping");
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal is eating");
    }


/** 
 *
 * Walk
 *
 */
    public void walk() { 

        System.out.println("Animal is walking");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "\nAnimal : " +  "\nName=\t" + name + " \nHeight=\t" + height + "\nWeight=\t" + weight;
    }
    
}
