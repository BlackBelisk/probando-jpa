package persistenciajpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserva")
public class Reserva_JPA{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int ReservaID;
	@ManyToOne
	private Cliente_JPA ClienteID;
	@ManyToOne
	private Vuelo_JPA VueloID;
	@Enumerated @Column(nullable = false)
	private TipoAsiento tipoAsiento;
	@Column(nullable = false)
	private int cantPasajes;
	@Column(nullable = false)
	private int cantEE;
	@Column(nullable = false)
	private float costo;
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate fechaAlta;
	private String pasajeros;
	
	public Reserva_JPA(){}

	public int getCantPasajes() {
		return cantPasajes;
	}

	public void setCantPasajes(int cantPasajes) {
		this.cantPasajes = cantPasajes;
	}

	public int getCantEE() {
		return cantEE;
	}

	public void setCantEE(int cantEE) {
		this.cantEE = cantEE;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(String pasajeros) {
		this.pasajeros = pasajeros;
	}
}