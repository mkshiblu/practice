package extract;

import static java.lang.System.out;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main() {
			AtomicInteger PORTS;

			List<Address> createAddresses(int count) {
				List<Address> addresses = new ArrayList<>(count);

				for (int i = 0; i < count; i++) {
					addresses.add(createAddress("127.0.0.1", PORTS.incrementAndGet()));
				}

				return addresses;
			}

			Address createAddress(String host, int port) {
				try {
					return new Address(host, port);
				} catch (UnknownHostException e) {
					out.println(e);
				}

				return null;
			}
		};
	}
}
