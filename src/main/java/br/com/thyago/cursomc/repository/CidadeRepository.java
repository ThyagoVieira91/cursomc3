package br.com.thyago.cursomc.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.thyago.cursomc.domain.Cidade;

public interface CidadeRepository extends CrudRepository<Cidade, Integer> {

}
