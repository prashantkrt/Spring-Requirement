
public class FirstFlight implements DeliveryService{

	@Override
	public boolean courierService(Double amount) {		
		System.out.println("Courier deliered through FirstFlight and amont paid is "+amount);
		return true;
	}

}
