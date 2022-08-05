package br.org.generation.GamesMarket.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.org.generation.GamesMarket.model.Games;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {
	
	
public List<Games>findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	
}
