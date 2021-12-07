package angular.mocks;

import java.util.HashMap;
import java.util.Map;

public class MockImport {

	public static Map<String, Controller> createMap() {
		return new HashMap<String, Controller>();
	}
	
	public static Controller $controller(char controllerConstructor, Object locals, Object controllerAs) {
		return new Controller();
	}
	
	public static Controller controller() {
		return new Controller();
	}
	

	public static Controller $controller(char controllerConstructor, Object locals, boolean unknown, Object controllerAs) {
		return new Controller();
	}
}
