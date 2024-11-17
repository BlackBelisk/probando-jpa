package principal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import persistenciajpa.TipoUsuario;
import persistenciajpa.Usuario_JPA;

public class Main {

	public static void main(String[] args) {
		System.out.println("Usuarios: \n -> Ninguno o un cliente, Ninguna o una aerolinea");
		System.out.println("Aerolineas: \n -> Un usuario, Una o muchas rutas finalizadas");
		System.out.println("Clientes: \n -> Un usuario, Una o muchas reservas");
		System.out.println("Reservas: \n -> Un cliente, Un vuelo");
		System.out.println("Vuelos: \n -> Ninguna o muchas reservas, Una ruta finalizada");
		System.out.println("Rutas Finalizadas: \n -> Ninguno o muchos vuelos, Una aerolinea");
		EntityManagerFactory factory = null;
		EntityManager man = null;

		factory = Persistence.createEntityManagerFactory("volandoUyJPA");
		man = factory.createEntityManager();

		Usuario_JPA usuario = new Usuario_JPA();
		usuario.setId(3);
		usuario.setEmail("hola@gmail.com");
		usuario.setNickname("moncho");
		usuario.setNombre("XD");
		usuario.setTipo_usuario(TipoUsuario.CLIENTE);

		EntityTransaction tx = man.getTransaction();
		tx.begin();
		man.persist(usuario);
		tx.commit();
		System.out.println("Que rica");
		man.close();
		factory.close();
	}

}
