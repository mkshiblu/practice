package moveoperation;

import java.util.function.Function;

import static moveoperation.Window.*;

public class TestabilityPatch {
	{
		beforeEach(new Object() {

			public void m1() {
				int x = 1;
			}

		});
	}
}
