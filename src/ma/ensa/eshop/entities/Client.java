package ma.ensa.eshop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	private String Code;
	private String mot_pass;
	private String nom;
	private String ville;
	private String address;
	
	@OneToMany(mappedBy="client")
	private Set<Commande> cmds=new HashSet<>();
	
	public Client(String code, String mot_pass, String nom, String ville, String address) {
		super();
		Code = code;
		this.mot_pass = mot_pass;
		this.nom = nom;
		this.ville = ville;
		this.address = address;
	}

	public Client (){}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getMot_pass() {
		return mot_pass;
	}

	public void setMot_pass(String mot_pass) {
		this.mot_pass = mot_pass;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	};
	
	
}
