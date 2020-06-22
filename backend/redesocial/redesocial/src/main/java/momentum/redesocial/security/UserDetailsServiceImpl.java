package momentum.redesocial.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import momentum.redesocial.model.Usuario;
import momentum.redesocial.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(username);
		
		if(usuario.isPresent() == false) {
			throw new UsernameNotFoundException("Usuário inválido!");
		}
			
		UserDetailsImpl userDetailsImpl = new UserDetailsImpl(usuario.get());
		return userDetailsImpl;
		
	}
	
}
