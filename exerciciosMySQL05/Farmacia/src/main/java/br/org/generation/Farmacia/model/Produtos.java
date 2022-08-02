package br.org.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_produto")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min=5, max= 500)
	private String nome;
	@NotBlank
	private Integer preco;
	@NotBlank
	@Size(min=5, max= 100)
	private String Tarja;
	@NotBlank
	@Size(min=5, max= 100)
	private String prescricaoMedica;
	@NotBlank
	@Size(min=5, max= 100)
	private String formaDeAdmistracao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPreco() {
		return preco;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	public String getTarja() {
		return Tarja;
	}
	public void setTarja(String tarja) {
		Tarja = tarja;
	}
	public String getPrescricaoMedica() {
		return prescricaoMedica;
	}
	public void setPrescricaoMedica(String prescricaoMedica) {
		this.prescricaoMedica = prescricaoMedica;
	}
	public String getFormaDeAdmistracao() {
		return formaDeAdmistracao;
	}
	public void setFormaDeAdmistracao(String formaDeAdmistracao) {
		this.formaDeAdmistracao = formaDeAdmistracao;
	}
	
	
	
	
	
}
