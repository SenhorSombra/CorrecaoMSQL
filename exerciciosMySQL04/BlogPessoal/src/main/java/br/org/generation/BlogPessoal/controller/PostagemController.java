package br.org.generation.BlogPessoal.controller;

import java.util.List;//Biblioteca Correta 

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.BlogPessoal.model.Postagem;
import br.org.generation.BlogPessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "", allowedHeaders = "")
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable Long id) {
	// Resposta chamando o Tabela	
		return postagemRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		//Metodo procure na lista de Postagem, e busque por Id, mapeie se existe o Id, se não responda Não encontrado
	}	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo) {
		
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@PostMapping
	public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
		
	}
	@PutMapping
	public ResponseEntity<Postagem> put(@Valid @RequestBody Postagem postagem){
		
		return postagemRepository.findById(postagem.getId()).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem))); 
		
	}

	
	
	
	
	
}
