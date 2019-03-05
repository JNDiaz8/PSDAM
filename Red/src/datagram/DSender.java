	package datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DSender {

	public static void main(String[] args) {
		final int PORT = 8888;
		try (DatagramSocket ds = new DatagramSocket();){
			String str = "Welcome to Guadalajara!";
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			byte[] stremBytes = str.getBytes();
			DatagramPacket dp = new DatagramPacket(
					stremBytes, stremBytes.length, ip, PORT);
			
			System.out.println("Enviando datagrama ...");
			ds.send(dp);
			ds.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
