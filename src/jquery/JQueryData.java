package jquery;

import jquery.JQueryMocks.DataUser;
import jquery.JQueryMocks.Element;
import jquery.JQueryMocks.JSON;
import jquery.JQueryMocks.Rbrace;

public class JQueryData {

	private String rmultiDash = "---";
	Rbrace rbrace;
	public int x;
	public int y;
	public DataUser dataUser;

	public int calc() {
		return x * y;
	}

	void dataAttr(Element elem, String key, Object data) {
		String name;
		
		if (data == null && elem.nodeType == 1) {
			name = "data." + key.replace(rmultiDash, "-$&").toLowerCase();
			data = elem.getAttribute(name);
			
			if (data.getClass().getName() == "String") {
				try {
					
					data = getData(data);
				}catch(Exception ex) {
					
				}
			}else {
				dataUser.set(elem, key, data);
			}
		}else {
			data = null;
		}
	}
	
	Object getData(Object data) {
		if ( data == "true" ) {
			return true;
		}

		if ( data == "false" ) {
			return false;
		}

		if ( data == "null" ) {
			return null;
		}

		// Only convert to a number if it doesn't change the string
		if ( data == data + "" ) {
			return data;
		}

		if ( rbrace.test( data ) ) {
			return JSON.parse( data );
		}

		return data;
	}
}
