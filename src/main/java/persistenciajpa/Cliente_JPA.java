package persistenciajpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente_JPA extends Usuario_JPA{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int ClienteID;
	
	@Column(nullable = false)
	private String apellido;
	
	@Column(nullable = false)
	private LocalDate fecha_nacimiento;
	
	@Column(nullable = false)
	private String nacionalidad;
	
	@Enumerated
	@Column(nullable = false)
	private TipoDocumento tipo_documento;
	
	@Column(nullable = false)
	private String num_documento;
	
	public Cliente_JPA() {}

	public int getClienteID() {
		return ClienteID;
	}

	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public TipoDocumento getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(TipoDocumento tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}

	
}
