package momentum.redesocial.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javassist.SerialVersionUID;
import momentum.redesocial.model.Usuario;

public class UserDetailsImpl implements UserDetails {
	
	private static final long SerialVersionUID=1L;
	private long codigo;
	private String nome;
	private String email;
	private String senha;
	private boolean isAccountNonExpired;
	private boolean isCredentialsNonExpired;
	private boolean isAccountNotLocked;
	private boolean isEnabled;
	
	//construtor
	public UserDetailsImpl(Usuario usuario) {
		this.codigo = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		
		this.isAccountNonExpired = true;
		this.isCredentialsNonExpired = true;
		this.isAccountNotLocked = true;
		this.isEnabled = true;
	}

	public long getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return senha;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return isAccountNotLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isEnabled;
	}

	
	
	
}
