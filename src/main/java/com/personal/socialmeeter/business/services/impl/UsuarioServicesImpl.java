package com.personal.socialmeeter.business.services.impl;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import com.personal.socialmeeter.business.model.Usuario;
import com.personal.socialmeeter.business.services.UsuarioServices;
import com.personal.socialmeeter.integration.model.UsuarioPL;
import com.personal.socialmeeter.integration.repositories.UsuarioPLRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

	private UsuarioPLRepository usuarioPLRepository;
	private DozerBeanMapper mapper;
	
	public UsuarioServicesImpl(UsuarioPLRepository usuarioPLRepository, DozerBeanMapper mapper) {
		this.usuarioPLRepository = usuarioPLRepository;
		this.mapper = mapper;
	}
	
	
	@Override
	@Transactional
	public Long create(Usuario usuario) {
		
		if(usuario.getId() != null) {
			throw new IllegalStateException("Para crear un usuario, el id tiene que ser null");
		}
		
		UsuarioPL usuarioPL = mapper.map(usuario, UsuarioPL.class);
		
		return usuarioPLRepository.save(usuarioPL).getId();
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
