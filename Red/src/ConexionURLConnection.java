import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConexionURLConnection {
public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://www.as.com/");
		URLConnection conexion = url.openConnection();
		Map<String,List<String>> mapCabeceras =
				conexion.getHeaderFields();
		Set<String> conjuntoCabecera = mapCabeceras.keySet();
		for (String claves : conjuntoCabecera) {
			System.out.println(claves + ":"
					+ mapCabeceras.get(claves));
			
		}
		

	}
}