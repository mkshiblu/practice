package moverename;

import moverename.Util.OptionElement;
import moverename.Util.Controller;

public class V {

	void main() {
		int x = 1;
		Object[] object = new Object[] {
			"element",
			"scope",
			new Controller() {
				OptionElement unknownOption;

				void call() {
					setOptionAsSelected(this.unknownOption);
				}

				void setOptionAsSelected(OptionElement optionEl) {
					optionEl.prop("selected", true);
					optionEl.attr("selected", true);
				}
			}
		};
	}
}
