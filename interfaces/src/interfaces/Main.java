package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers= {new SmsLogger(), new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		
		CustomerManager customerManager= new CustomerManager(loggers);
		
		Customer Akif= new Customer(1, "Akif", "Inan");
		
		customerManager.add(Akif);
	}

}
