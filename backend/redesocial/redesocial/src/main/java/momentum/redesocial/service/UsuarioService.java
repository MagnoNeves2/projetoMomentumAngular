package momentum.redesocial.service;

import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import momentum.redesocial.model.Usuario;
import momentum.redesocial.model.UsuarioLogado;
import momentum.redesocial.model.UsuarioLogin;
import momentum.redesocial.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		//aqui poderia estar a verificação se o usuário já existe
		return usuarioRepository.save(usuario);
	}
	
	public Optional<UsuarioLogado> Logar(UsuarioLogin usuarioLogin) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Usuario> usuario = usuarioRepository.findByEmail(usuarioLogin.getEmail());
		
		if(usuario.isPresent() == false) {
			return Optional.empty();
		}
		if (encoder.matches(usuarioLogin.getSenha(), usuario.get().getSenha()) == false) {
			return Optional.empty();
		}
		
		//criando o Token
		String auth = usuarioLogin.getEmail() + ":" + usuarioLogin.getSenha();
		String enconding = Base64.getEncoder().encodeToString(auth.getBytes());
		String authHeader = "Basic " + enconding;
		
		//criando uma instância do objeto UsuarioLogado
		UsuarioLogado usuarioLogado = new UsuarioLogado();
		usuarioLogado.setCodigo(usuario.get().getId());
		usuarioLogado.setNome(usuario.get().getNome());
		usuarioLogado.setEmail(usuario.get().getEmail());
		usuarioLogado.setToken(authHeader);
		
		return Optional.ofNullable(usuarioLogado);
		
	}
	

}
