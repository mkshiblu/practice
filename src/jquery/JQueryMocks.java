package jquery;

public class JQueryMocks {
	
	public static class Rbrace{
		
		public boolean test(Object data) {
			return false;
		}
	}
	
	public static class JSON{
		
		public static String parse(Object data) {	
			return null;
			
		}
	}
	
	public static class DataUser{

		public void set(Element elem, String key, Object data) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class Element {

		public int nodeType;
		public void data(Object str, Object instance) {
			
			
		}
		public Element getAttribute(String name) {
			// TODO Auto-generated method stub
			return null;
		}
	}

}

