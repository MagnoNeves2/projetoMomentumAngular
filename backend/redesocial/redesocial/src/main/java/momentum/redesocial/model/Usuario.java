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
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_id_usuario", nullable = false)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 80)
	@Column(name = "nm_nome", nullable = false, length = 80)
	private String nome;
	
	@NotNull
	@Size(min = 16, max = 120)
	@Column(name = "nm_email", nullable = false, length = 120)
	private String email;
	
	@NotNull
	@Size(min = 6, max = 40)
	@Column(name = "nm_senha", nullable = false, length = 40)
	private String senha;
	
	
	@Size(min = 2, max = 20)
	@Column(name = "cd_telefone", length = 20)
	private Long telefone;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtNascimento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	
}
