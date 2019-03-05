package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientServerDict {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Introduce palabra a traducir");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next();
		final String HOST = "dict.org";
		final int 	 PORT = 2628;
		Socket socket = new Socket(HOST, PORT);
		PrintWriter out = new PrintWriter(
				new OutputStreamWriter(
						socket.getOutputStream())); 
		out.write("define fd-spa-eng " + palabra + "\n");
		out.flush();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		String linea;
		while ((linea = in.readLine()) != null) {
			System.out.println(linea);
		}
		socket.close();
	
	}

}
