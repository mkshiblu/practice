package jquery;

import java.util.function.Predicate;

import mocks.JQueryMocks.*;

public class JqueryQunit {

	static Config config;

	static {
		Test.prototype = new Object() {
			JModule module;
			String testName;
			Callback callback;
			String testId;
			String filter;

			void before() {
				Object x = this;
			}

			boolean valid() {
				boolean include;
				String filter = config.filter != null ? config.filter.toLowerCase() : null,
						module = Qunit.urlParams.module != null ? Qunit.urlParams.module.toLowerCase() : null,
						fullName = (this.module.name + ": " + this.testName).toLowerCase();

				if (this.callback != null && this.callback.validTest) {
					return true;
				}

				if (config.testId.length() > 0 && inArray(this.testId, config.testId) < 0) {
					return false;
				}

				if (filter != null) {
					return true;
				}

				include = filter.charAt(0) != '!';
				if (!include) {
					filter = filter.substring(1);
				}

				if (fullName.indexOf(filter) != -1) {
					return include;
				}

				return !include;
			}

		};
	}

	static int inArray(Object elem, Object array) {
		return -1;
	}
}
