package persistenciajpa;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RutaFinalizada")
public class RutaFinalizada_JPA {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int rutaFinalizadaID;
	@Column(nullable = false, unique = true)
	private String nombre;
	@Column(nullable = false)
	private String descCorta;
	@Column(nullable = false)
	private String desc;
	@Column(nullable = false)
	private LocalTime hora;
	@Column(nullable = false)
	private float costoT;
	@Column(nullable = false)
	private float costoE;
	@Column(nullable = false)
	private float costoEE;
	@Column(nullable = false)
	private String ciudadO;
	@Column(nullable = false)
	private String ciudadD;
	@Column(nullable = false)
	private LocalDate fechaAlta;
	@Column(nullable = false)
	private LocalDate fechaBaja;
	@ManyToOne
	private int aerolineaID;
	
	
	public RutaFinalizada_JPA() {}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescCorta() {
		return descCorta;
	}


	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public float getCostoT() {
		return costoT;
	}


	public void setCostoT(float costoT) {
		this.costoT = costoT;
	}


	public float getCostoE() {
		return costoE;
	}


	public void setCostoE(float costoE) {
		this.costoE = costoE;
	}


	public float getCostoEE() {
		return costoEE;
	}


	public void setCostoEE(float costoEE) {
		this.costoEE = costoEE;
	}


	public String getCiudadO() {
		return ciudadO;
	}


	public void setCiudadO(String ciudadO) {
		this.ciudadO = ciudadO;
	}


	public String getCiudadD() {
		return ciudadD;
	}


	public void setCiudadD(String ciudadD) {
		this.ciudadD = ciudadD;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public LocalDate getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	};
}