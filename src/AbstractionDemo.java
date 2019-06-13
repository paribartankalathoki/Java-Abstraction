/**
 * @author Paribartan
 *
 */
public class AbstractionDemo {

	public static void main(String[] args) {
		
		Abstraction  abstraction = new ConcreteClass();
		abstraction.printDetails();
		abstraction.getDetails();
		
		ConcreteClass concrete = new ConcreteClass();
		concrete.printDetails();
		concrete.getDetails();
		
		
//		following method  is called abstract class casting
		
		Abstraction abstractionClass = (Abstraction)concrete;
		abstractionClass.printDetails();

	}

}
