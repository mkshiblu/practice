package moveoperation;

import static moveoperation.Window.beforeEach;

import java.util.function.Function;

public class Matchers {
	{
		beforeEach(new Object() {
			public Function<String, Boolean> cssMatcher(String name) {
				return x -> name.equals(x);
			}

			public void addMatchers(JasminMatcher jasminMatcher) {
			}

			{
				this.addMatchers(new JasminMatcher() {

					public Object actual;

					public boolean toEqualData(Object expected) {
						return this.actual == expected;
					}

					public boolean toEqualError(String message) {
						return this.actual.toString().equals("Error") && this.actual.toString().equals(message);
					}
				});
			}

		});
	}
}
