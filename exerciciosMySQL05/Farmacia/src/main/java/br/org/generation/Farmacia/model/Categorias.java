package br.org.generation.Farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="tb_categorias")
public class Categorias {
	
	
	@OneToMany(mappedBy= "categorias", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categorias")
	private List<Produtos> produtos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min=5, max= 500)
	private String descricao;
	@NotBlank
	@Size(min=5, max= 500)
	private String medicamentos;
	@NotBlank
	@Size(min=5, max= 500)
	private String higieneP;
	@NotBlank
	@Size(min=5, max= 500)
	private String medicamentosG;
	@NotBlank
	@Size(min=5, max= 500)
	private String saudeEBemEstar;
	@NotBlank
	@Size(min=5, max= 500)
	private String Beleza;
	
	
	
	
	public List<Produtos> getProdutos() {
		return produtos;
	}	
	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getHigieneP() {
		return higieneP;
	}
	public void setHigieneP(String higieneP) {
		this.higieneP = higieneP;
	}
	public String getMedicamentosG() {
		return medicamentosG;
	}
	public void setMedicamentosG(String medicamentosG) {
		this.medicamentosG = medicamentosG;
	}
	public String getSaudeEBemEstar() {
		return saudeEBemEstar;
	}
	public void setSaudeEBemEstar(String saudeEBemEstar) {
		this.saudeEBemEstar = saudeEBemEstar;
	}
	public String getBeleza() {
		return Beleza;
	}
	public void setBeleza(String beleza) {
		Beleza = beleza;
	}
	
	

	
	
	

}
