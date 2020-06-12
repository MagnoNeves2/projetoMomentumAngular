package momentum.redesocial.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_publicacao")
public class Postagem {

	@Column(name = "cd_id_publicacao")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nm_texto", nullable = false)
	@NotNull
	@Size(min = 5, max = 967)
	private String texto;
	
	@Column(name = "dt_data", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "cd_id_usuario")
	private long id_usuario;
	
	@Column(name = "ic_analise")
	private Boolean analise;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Boolean getAnalise() {
		return analise;
	}

	public void setAnalise(Boolean analise) {
		this.analise = analise;
	}


	
}
