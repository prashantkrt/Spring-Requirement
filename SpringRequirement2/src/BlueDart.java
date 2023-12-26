
public class BlueDart implements DeliveryService {

	@Override
	public boolean courierService(Double amount) {
		System.out.println("Courier deliered through BlueDart and amont paid is "+amount);
		return true;
	}

}
