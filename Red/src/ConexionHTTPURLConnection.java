import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConexionHTTPURLConnection {

	public static void main(String[] args) throws IOException{
		URL url = new URL("https://www.marca.com/");
		HttpURLConnection conexion =
				(HttpURLConnection) url.openConnection();
		System.out.println(conexion.getRequestMethod());
		System.out.println(conexion.getResponseCode());
		System.out.println(conexion.getResponseMessage());
		

	}

}
