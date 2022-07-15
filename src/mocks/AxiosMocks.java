package mocks;

import java.util.function.Consumer;

public class AxiosMocks {

	public static abstract class AxModule{
		public Consumer<Resolve> exports;
	}
	
	public static interface  Streamer {
		
		public abstract void  streamOn(int x, int  y);
	}
	
public static interface  AxBuffer {
		
		public abstract void  streamOn(int x, int  y);

		public static MockString concat(String responseBuffer) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	

	public static class Stream{
		public void on(String p, Streamer streamer) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static class Result{

		public int statusCode;
		public String responseType;
		
	}
	public static class Resolve{

		public int statusCode;
		public int invoke(Response r) {return 0;}
	}
	
	public static class Response{

		
	}
	
	public static abstract class MockString{
		
		public abstract MockString toString(String format);
	}

}
