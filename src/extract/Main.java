package extract;

import static java.lang.System.out;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main() {
			AtomicInteger PORTS;

			Address[] createAddresses(int count) {
				Address[] addresses = new Address[count];

				for (int i = 0; i < count; i++) {
					try {
						addresses[i] = new Address("127.0.0.1", PORTS.incrementAndGet());
					} catch (UnknownHostException e) {
						// e.printStackTrace();
						out.println(e);
					}
				}

				return addresses;
			}
		};
	}
}
