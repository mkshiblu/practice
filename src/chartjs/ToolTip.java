package chartjs;

public class ToolTip {
	CTX ctx;

	void drawCaret(int[] vm, int size, int opacity) {
		int x = 1;
		var ctx = this.ctx;
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

		ctx.moveTo(x1, y1);
		ctx.lineTo(x2, y2);
		ctx.lineTo(x3, y3);
		ctx.stroke();

	}

	void drawTitle() {
		String title = "dsa";
	}
}
