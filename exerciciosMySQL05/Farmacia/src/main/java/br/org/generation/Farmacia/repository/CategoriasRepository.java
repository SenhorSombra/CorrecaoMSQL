package br.org.generation.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.org.generation.Farmacia.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	
	public List<Categorias>findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
