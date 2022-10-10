package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new
		// DatabaseLogger(), new EmailLogger() };
		// for(BaseLogger logger:loggers) {
		// logger.Log("Log mesajı");
		// }

	}

      CustomerManager customerManager = new CustomerManager(new FileLogger());
      CustomerManager.add();
}
