package axios;

import mocks.AxiosMocks.AxBuffer;
import mocks.AxiosMocks.AxModule;
import mocks.AxiosMocks.Resolve;
import mocks.AxiosMocks.Result;
import mocks.AxiosMocks.Stream;
import mocks.AxiosMocks.Response;

public class AxiosAdapters {

	int x;

	void calc() {
		x = 1;
	}

	AxModule module;
	Stream stream;
	Result res;
	Response response;
	Resolve reject;

	void exports() {

		module.exports = (resolve) -> {
			var data = resolve;
			String responseBuffer = "";

			stream.on("end", (a1, a2) -> {
				var responseData = AxBuffer.concat(responseBuffer);
				// Resolve or reject the Promise based on the status
				var x = settle(resolve, reject, response);
			});

		};
	}
	
	// Resolve or reject the Promise based on the status
	int settle(Resolve resolve, Resolve reject, Response response) {
		return res.statusCode >= 200 && res.statusCode < 300 ? resolve.invoke(response)
				: reject.invoke(response);
	}
}
