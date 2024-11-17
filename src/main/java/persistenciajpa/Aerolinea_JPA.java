package persistenciajpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aerolineas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Aerolinea_JPA extends Usuario_JPA{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int AerolineaID;
	
	@Column(nullable = false)
	private String descripcion;
	
	@Column(nullable = true)
	private String sitio_web;
	
	public Aerolinea_JPA() {
		
	}
	public int getAerolineaID() {
		return AerolineaID;
	}
	public void setAerolineaID(int aerolineaID) {
		AerolineaID = aerolineaID;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSitio_web() {
		return sitio_web;
	}
	public void setSitio_web(String sitio_web) {
		this.sitio_web = sitio_web;
	}
	
}
