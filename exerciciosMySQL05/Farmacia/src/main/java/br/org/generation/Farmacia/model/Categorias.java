package br.org.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name="tb_categorias")
public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min=5, max= 500)
	private Long descricao;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDescricao() {
		return descricao;
	}
	public void setDescricao(Long descricao) {
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
