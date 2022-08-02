package br.org.generation.Farmacia.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.org.generation.Farmacia.model.Produtos;
import br.org.generation.Farmacia.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "", allowedHeaders = "")
public class ProdutosController {

	@Autowired
	private ProdutosRepository produtosRepository;
	
 
	@GetMapping
	public ResponseEntity<List<Produtos>> GetAll(){
		return ResponseEntity.ok(produtosRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> GetById(@PathVariable Long id) {
	// Resposta chamando o Tabela	
		return produtosRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		//Metodo procure na lista de Postagem, e busque por Id, mapeie se existe o Id, se não responda Não encontrado
	}	
	@GetMapping("/produto/{nome}")
	public ResponseEntity<List<Produtos>> getByNome(@PathVariable String nome) {
		
		return ResponseEntity.ok(produtosRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	@PostMapping
	public ResponseEntity<Produtos> post(@Valid @RequestBody Produtos produtos) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(produtosRepository.save(produtos));
		
	}
	@PutMapping
	public ResponseEntity<Produtos> put(@Valid @RequestBody Produtos produtos){
		
		return produtosRepository.findById(produtos.getId()).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.OK).body(produtosRepository.save(produtos))); 
		
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		Optional<Produtos>produtos = produtosRepository.findById(id);
		
		if(produtos.isEmpty()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			
		}
		produtosRepository.deleteById(id);
		
	}
	
	
	
	
}
