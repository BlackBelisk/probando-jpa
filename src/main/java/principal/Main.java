package principal;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import persistenciajpa.RutaFinalizada_JPA;
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
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("volandoUyJPA");
			em = emf.createEntityManager();
			
			RutaFinalizada_JPA RF = new RutaFinalizada_JPA();
			RF.setNombre("Ruta Finalizada");
			RF.setDescCorta("Desc Corta");
			RF.setDesc("Desc");
			RF.setHora(LocalTime.now());
			RF.setCostoT(2f);
			RF.setCostoE(3f);
			RF.setCostoEE(1f);
			RF.setCiudadO("Ciudad Origen");
			RF.setCiudadD("Ciudad Destino");
			RF.setFechaAlta(LocalDate.MIN);
			RF.setFechaBaja(LocalDate.now());
			
			EntityTransaction ET = em.getTransaction();
			ET.begin();
			em.persist(RF);
			ET.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
