package datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DReceiver {

	public static void main(String[] args) {
		final int PORT = 8888;
		final int LENGTH = 1024;
		try (DatagramSocket ds = new DatagramSocket(PORT);){
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(
					buf, 0, LENGTH);
			ds.receive(dp);
			String str = new String(dp.getData(), 0, dp.getLength());
			System.out.println(str);
			ds.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
