package br.com.thyago.cursomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.thyago.cursomc.domain.Categoria;
import br.com.thyago.cursomc.repository.CategoriaRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	private CategoriaRepository catRepository;
	
	public Categoria find(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = catRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}
