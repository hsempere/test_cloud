package asi.cloud;

import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
		// Debemos comprobar si hay una variable de entorno PORT
		// Railway exporta esta variable para decirnos en qué puerto debemos escuchar
		String port = System.getenv("PORT");
		
		// Si la variable no existe estamos ejecutando en local, le damos un valor por defecto
		if (port == null || port.isEmpty()) {
			port = "8080";
		}

		// Configuramos el servidor para que escuche en el puerto indicado
		port(Integer.parseInt(port));

		// Creamos un servicio en el endpoint / que devuelve una cadena de texto
		get("/", (req, res) -> "Hello world!");
	}

}
