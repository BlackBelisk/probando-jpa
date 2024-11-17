package persistenciajpa;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

@MappedSuperclass
@Table(name = "Usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_usuario", 
discriminatorType = DiscriminatorType.INTEGER)
public class Usuario_JPA {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int UsuarioID;
	
	private String nickname;
	private String email;
	private String nombre;
	
	@Enumerated
	private TipoUsuario tipo_usuario;
	
	public Usuario_JPA() {
		
	}
	
	public int getId() {
		return UsuarioID;
	}

	public void setId(int id) {
		this.UsuarioID = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoUsuario getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(TipoUsuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
}
