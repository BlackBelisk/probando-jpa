package principal;

public class Main {

	public static void main(String[] args) {
		System.out.println("Usuarios: \n -> Ninguno o un cliente, Ninguna o una aerolinea;");
		System.out.println("Aerolineas: \n -> Un usuario, Una o muchas rutas finalizadas;");
		System.out.println("Clientes: \n -> Un usuario, Una o muchas reservas");
		System.out.println("Reservas: \n -> Un cliente, Un vuelo");
		System.out.println("Vuelos: \n -> Ninguna o muchas reservas, Una ruta finalizada");
		System.out.println("Rutas Finalizadas: \n -> Ninguno o muchos vuelos, Una aerolinea");
		
	}

}
