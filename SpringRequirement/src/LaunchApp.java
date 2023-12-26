
public class LaunchApp {

	public static void main(String[] args) {
		GreetingsGenerator greet = new GreetingsGenerator();
		System.out.println("Target object before injecting dependent object or before setter injection =>" + greet);

		// this two lines are the part of inversion of control
		// as  we don't want to creae the object for dependent object 
		// depenedent object are those which target class expecting us to create and pass to it.
		
		java.util.Date date = new java.util.Date();
		System.out.println("The depenedent object=>" + date);

		// this line is called dependency injection
		greet.setDate(date); // setter injection
		
		/*
		 * now we will ask spring to create the depenednecy object and 
		 * inject to target class
		 */

		/*
		 * Spring should also create the object of target class i.e greetingGenerator class
		 */
		
		/*
		 * now spring is creating the obejects 
		 * now spring is injecting the dependencies
		 * 
		 * for that we have to order the spring how to 
		 * create and inject using configuration file using xml , using annotations
		 * using pure core java 
		 * 
		 * 
		 */

		System.out.println("Target object after injecting dependent object or before setter injection =>" + greet);

		System.out.println(greet.GenerateGreetings("Rahul"));
	}
}