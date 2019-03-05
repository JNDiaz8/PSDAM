package datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {

	public static void main(String[] args) {
		final int PORT = 8888;
		MulticastSocket socket = null;
		DatagramPacket inPacket = null;
		byte[] inBuf = new byte[256];
		try {
			socket = new MulticastSocket(PORT);
			InetAddress address = InetAddress.getByName("224.2.2.3");
			socket.joinGroup(address);
			
			while (true) {
				inPacket = new DatagramPacket(inBuf, inBuf.length);
				socket.receive(inPacket);
				String message = new String(inBuf, 0, inPacket.getLength());
				System.out.println("Recibido de : " + inPacket.getAddress() + " Mensaje: " + message);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
