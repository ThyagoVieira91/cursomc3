package br.com.thyago.cursomc.services;

import org.springframework.stereotype.Service;

import java.util.Optional;

import br.com.thyago.cursomc.domain.Categoria;
import br.com.thyago.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository catRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = catRepository.findById(id);
		return obj.orElse(null);
		}
}
