package polymorph;

/* Week 3 - Day 5
 * Completed on 2023/05/12
 */

//parent class
class Animals
{
    public void eat()
    {
        System.out.println("Animal now eating");
    }
    public void roam()
    {
        System.out.println("Animal is moving around");
    }
}

//child class #1
//==================================================================

class Tiger extends Animals
{
    public void eat()
    {
        System.out.println("Tiger eating meat");
    }
    public void roam()
    {
        System.out.println("Tiger running around");
    }
}

//child class #2
//==================================================================

class Lion extends Animals
{
    public void eat()
    {
        System.out.println("Lion eating giraffe");
    }
    public void roam()
    {
        System.out.println("Lion slowly moving around");
    }

}

//child class #3
//==================================================================


class Dog extends Animals
{
    public void eat()
    {
        System.out.println("Dog eating treat");
    }
    public void roam()
    {
        System.out.println("Dog running in circles");
    }

}

//==================================================================

// Provides code compactness, flexibility
class Forest
{
    public void acceptAnimal(Animals ref)
    {
    	ref.eat();
        ref.roam();
    }
}

//==================================================================

public class CompactPolymorphism {

    public static void main(String[] args) {
    	Tiger tt = new Tiger(); 
    	Lion ll = new Lion();
    	Dog dd = new Dog(); 
    	Forest f = new Forest();
        f.acceptAnimal(tt);
        f.acceptAnimal(ll);
        f.acceptAnimal(dd);
        
        //Non-compact version 1
//        tt.eat();
//        tt.roam();
//        ll.eat();
//        ll.roam();
//        dd.eat();
//        dd.roam();
        
        //Non-compact version 2
        // Parent class reference = only inherited and overridden methods
        // Cannot access specialized method
//        Animals a = new Animals();
//        ((Tiger)a).tigerRoar(); 
    } 

}
