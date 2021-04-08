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
					setOptionSelectedStatus(this.unknownOption, true);
				}
			}
		};
	}
	
	void setOptionSelectedStatus(OptionElement optionEl, boolean value) {
		optionEl.prop("selected", value);
		optionEl.attr("selected", value);
	}
}
