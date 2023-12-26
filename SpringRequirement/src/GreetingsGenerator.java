import java.util.Date;


//target class as there is a requirement of Date class object
public class GreetingsGenerator {

	private Date date;

	public GreetingsGenerator() {
		System.out.println("GreetingsGenerator is instantiated");
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String GenerateGreetings(String name) {
		@SuppressWarnings("deprecation")	
		int hours = date.getHours();// get the hour in 24hr format

		if (hours < 12) {
			return "Good Morning " + name;
		} else if (hours < 16) {
			return "Good Afternoon " + name;
		} else if (hours < 20) {
			return "Good evening " + name;
		} else {
			return "Good night " + name;
		}
	}

	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}

}
