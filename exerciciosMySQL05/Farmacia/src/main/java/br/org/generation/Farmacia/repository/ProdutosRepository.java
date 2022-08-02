package br.org.generation.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.org.generation.Farmacia.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	public List<Produtos>findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	//trazer da Lista da Tabela, Pelo Titulo e Ignore SE é maiuscula e minuscula e Liste todos os titulos com os titulos iguais
	

}
