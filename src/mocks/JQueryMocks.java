package mocks;

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
	
	public static class Test{
		
		public static Object prototype;
	}
	
	public static class Config{

		public String filter;
		public String moduleId;
		public String testId;
		public String module;
	}
	
	public static class JModule{

		public String name;
		public String moduleId;
		public JModule parentModule;
	}
	
	public static class Qunit{

		public static UrlParams urlParams;
	}
	
	public static class Callback{
		public boolean validTest;
	}
	
	public static class UrlParams{
		public String module;
	}
}

