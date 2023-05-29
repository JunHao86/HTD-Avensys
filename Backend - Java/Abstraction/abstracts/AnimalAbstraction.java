package abstracts;

/* Week 3 - Day 5
 * Completed on 2023/05/12
 */

//==================================================================

//Pure Abstract Class
//1. Abstract Parent Class can have Abstract Child Classes (e.g. TTiger, HHuman)
//5. Pure Abstract Class only if it contains abstract methods
//6. Otherwise, it is an impure abstract class (concrete methods)
abstract class AAnimals
{
    abstract void eat();
    abstract void roam();
}

//==================================================================

//2. Abstract Classes can have Parent Classes (e.g. AAnimals)
//3. Abstract Classes can have Concrete Child Classes (e.g. WhiteTiger, AsianHuman extends TTiger, HHuman)
abstract class TTiger extends AAnimals
{
    public void roam()
    {
        System.out.println("Tiger running around");
    }
}
abstract class HHuman extends AAnimals
{
    public void roam()
    {
        System.out.println("Human slowly moving around");
    }

}

//==================================================================

//Concrete Classes
//4. Concrete Classes can have Abstract Parent Classes (e.g. WhiteTiger, AsianHuman extends TTiger, HHuman)
class WhiteTiger extends TTiger
{
	public void eat()
	{
		System.out.println("White Tiger eat White Rabbit");
	}
}

class AsianHuman extends HHuman
{
	public void eat()
	{
		System.out.println("Asian Human Makan mookata");
	}
}

//==================================================================

//Other Abstraction Rules
//7. Cannot be instantiated
//8. Should not be declared final (hence inheritance is impossible)
//9. If class is not to be instantiated in code base, declare abstract to prevent instantiated

//==================================================================

class Singaporee
{
    public void acceptAnimal(AAnimals ref)
    {
        ref.eat();
        ref.roam();
    }
}

//==================================================================

public class AnimalAbstraction extends Object {

    public static void main(String[] args) {
    	WhiteTiger tt = new WhiteTiger(); 
    	AsianHuman hh = new AsianHuman();
    	Singaporee s = new Singaporee();
        s.acceptAnimal(tt);
        s.acceptAnimal(hh);
    } 
	}