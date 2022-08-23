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
				String filter = config.filter != null ? config.filter.toLowerCase() : null,
						regexFilter = "^(!?)([\\w\\W]\\*)(i?\\$)".concat(filter),
						module = config.module != null ? config.module.toLowerCase() : null,
						fullName = (this.module.name + ": " + this.testName).toLowerCase();

				var a = new Object() {
					boolean moduleChainIdMatch(JModule testModule) {
						return inArray(testModule.moduleId, config.moduleId) > -1
								|| testModule.parentModule != null && moduleChainIdMatch(testModule.parentModule);
					};
				};

				if (this.callback != null && this.callback.validTest) {
					return true;
				}

				if (config.moduleId != null && config.moduleId.length() > 0 && !a.moduleChainIdMatch(this.module)) {
					return false;
				}

				if (config.testId != null && config.testId.length() > 0 && inArray(this.testId, config.testId) < 0) {
					return false;
				}

				if (filter != null) {
					return true;
				}
				return regexFilter != null ? this.regexFilter(regexFilter.substring(1), regexFilter.substring(2),
						regexFilter.substring(3), fullName) : this.stringFilter(filter, fullName);
			};

			boolean regexFilter(Object exclude, String pattern, Object flags, String fullName) {
				return true;
			}

			boolean stringFilter(String filter, String fullName) {
				filter = filter.toLowerCase();
				fullName = fullName.toLowerCase();

				var include = filter.charAt(0) != '!';
				if (!include) {
					filter = filter.substring(1);
				}

				if (fullName.indexOf(filter) != -1) {
					return include;
				}

				// Otherwise, do the opposite
				return !include;
			}

		};
	}

	static int inArray(Object elem, Object array) {
		return -1;
	}
}
