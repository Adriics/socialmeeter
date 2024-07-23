package com.personal.socialmeeter.business.services;

import java.util.Optional;

import com.personal.socialmeeter.business.model.Usuario;

public interface UsuarioServices {
	
	Long create(Usuario usuario);
	
	Optional<Usuario> read(Long id);
	
	void update(Usuario usuario);
	
	void delete(Long codigo);

}
