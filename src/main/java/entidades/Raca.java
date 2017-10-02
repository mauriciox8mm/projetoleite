package entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Raca implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeDaRaca;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDaRaca() {
		return nomeDaRaca;
	}
	public void setNomeDaRaca(String nomeDaRaca) {
		this.nomeDaRaca = nomeDaRaca;
	}
	
	
	
}
