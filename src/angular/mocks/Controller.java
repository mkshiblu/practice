package angular.mocks;

public class Controller {

	public Controller instance;
	public Object bindingInfo;
	
	public Controller() {
	};

	public Controller(Controller instance, Object _bindingInfo) {
		this.instance = instance;
		this.bindingInfo = bindingInfo;
	}
}
