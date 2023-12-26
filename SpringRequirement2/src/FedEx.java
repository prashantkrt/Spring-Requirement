
public class FedEx implements DeliveryService{

	@Override
	public boolean courierService(Double amount) {
		System.out.println("Courier deliered through FedEx and amont paid is "+amount);
		return true;
	}

}
