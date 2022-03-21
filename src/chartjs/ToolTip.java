package chartjs;

public class ToolTip {
	CTX ctx;

	void drawCaret(int[] vm, int size) {
		int x = 1;
		var ctx = this.ctx;
		var caretPosition = getCaretPosition(vm, size);
		
		ctx.moveTo(caretPosition.x1, caretPosition.y1);
		ctx.lineTo(caretPosition.x2, caretPosition.y2);
		ctx.lineTo(caretPosition.x3, caretPosition.y3);
		ctx.stroke();

	}

	public CaretPosition getCaretPosition(int[] vm, int size) {
		int x1, x2, x3;
		int y1, y2, y3;
		var caretSize = vm.length;
		var cornerRadius = size;

		if (cornerRadius > 5) {
			x1 = 5;
			x2 = x1 - size;
			x3 = x1;
		} else {
			x1 = 5 + size;
			x2 = x1 - size;
			x3 = x1;
		}

		y1 = x1;
		y2 = x2;
		y3 = x3;

		return new CaretPosition(x1, x2, x3, y1, y2, y3);
	}

	void drawTitle() {
		String title = "dsa";
	}
}
