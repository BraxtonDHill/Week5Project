
public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.log("Hello");
		logger1.error("Hello");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Hello");
		logger2.error("Hello");
	}
}
