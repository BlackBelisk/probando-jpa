package persistenciajpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vuelo")
public class Vuelo_JPA {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int VueloID;
	@Column(nullable = false, unique = true)
	private String nombre;
	@Column(nullable = false)
	private LocalDate fecha;
	@Column(nullable = false)
	private int duracion;
	@Column(nullable = false)
	private int maxTurista;
	@Column(nullable = false)
	private int maxEjecutivo;
	@Column(nullable = false)
	private LocalDate fechaAlta;
	@ManyToOne
	private int rutaFinalizadaID;
	
	public Vuelo_JPA() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getMaxTurista() {
		return maxTurista;
	}

	public void setMaxTurista(int maxTurista) {
		this.maxTurista = maxTurista;
	}

	public int getMaxEjecutivo() {
		return maxEjecutivo;
	}

	public void setMaxEjecutivo(int maxEjecutivo) {
		this.maxEjecutivo = maxEjecutivo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	};
}