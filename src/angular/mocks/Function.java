package angular.mocks;

public class Function {
	
	public static Prototype prototype;
	
	public class Prototype {
		
		public ToString toString;
	}
	
	public class ToString {
		public StringVar call(Object obj) {
			return null;
		}
	}
	
	public static class StringVar {
	
		public StringVar replace(Object target, Object replacement) {
			return null;
		}

		public StringVar match(String fN_ARGS) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
