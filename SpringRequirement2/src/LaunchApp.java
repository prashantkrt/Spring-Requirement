// this part of the code will be done by Spring
// hehe mast hai :)
// so dependency injection taken care by Spring
// object creation taken care by Spring 
// we don't have to create any object 
// IOC now everything will mange by spring through configuration file with annotation ,xml langauge
public class LaunchApp {

	// we will do code to interface not directly to the class
	public static void main(String[] args) {
		
		// target class
		Amazon a = new Amazon(); 
		/*
		 * dependent objects FirstFlight, BlueDart, FedEx
		 */
		// setter injection
		a.setService(new FedEx()); 
		// a.setService(new BlueDart()); 
		// a.setService(new FirstFlight()); 
		
		boolean status = a.initiateDelivery();
		System.out.println(status);
		if(status)
		{
			System.out.println("Order deleivered !!!");
		}
		else {
			System.out.println("Failed to deleiver !!!");
		}
	}

}
