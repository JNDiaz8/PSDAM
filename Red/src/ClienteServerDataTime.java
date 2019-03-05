import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteServerDataTime {

	public static void main(String[] args) {
		final String HOST = "time.nist.gov";
		final int PORT = 13;
		try {Socket socket = new Socket(HOST, PORT);
		BufferedReader input = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
			Pattern pattern = Pattern.compile("^\\d+\\s(\\d{2}-\\d{2}-\\d{2}).+");
			Matcher matcher;
			String linea;
			while((linea = input.readLine()) != null) {
			matcher = pattern.matcher(linea);
			 while (matcher.find()) {
				String[] fecha = matcher.group(1).split("-");
				System.out.printf("Fecha: %s/%/s%/s%n", fecha[2], fecha[1], fecha[0]);
			 }
				//System.out.println(linea);
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
