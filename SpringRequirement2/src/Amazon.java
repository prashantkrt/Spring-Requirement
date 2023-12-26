
// application is tightly coupled
// we should be doing code to the interface not directly code to the class
public class Amazon {

	DeliveryService deliveryServicee;

	/*
	 * Tightly coupled
	 */
//	public boolean initiateDelivery() {
//		FedEx f = new FedEx();
//		return f.courierService(1200.0);
//	}

	/*
	 * Loosely coupled
	 */

	public void setService(DeliveryService deliveryService) {
		this.deliveryServicee = deliveryService;
	}

	public boolean initiateDelivery() {		
		return deliveryServicee.courierService(1200.0);
	}

}
