package ma.ensa.eshop.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  numero_art;
	private String designation;
	private double prix;
	
	@OneToMany(mappedBy="cmd_art.art")
	private Set<Cmd_Article> cmd_ar=new HashSet<Cmd_Article>();
	
	public Article(){}



	public Article(int numero_art, String designation, double prix) {
		super();
		this.numero_art = numero_art;
		this.designation = designation;
		this.prix = prix;
	}



	public int getNumero_art() {
		return numero_art;
	}



	public void setNumero_art(int numero_art) {
		this.numero_art = numero_art;
	}



	public String getDesignation() {
		return designation;
	}

  

	public Set<Cmd_Article> getCmd_ar() {
		return cmd_ar;
	}



	public void setCmd_ar(Set<Cmd_Article> cmd_art) {
		this.cmd_ar = cmd_art;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}
    
	
	
	

}
