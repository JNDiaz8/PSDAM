import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionReader {
	
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://www.google.com/");
		URLConnection conexion = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)System.out.println(inputLine);
		in.close();
	}
}
