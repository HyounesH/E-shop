package ma.ensa.eshop.helper_beans;

public class Qte_Articles {
	private int  numero_art;
	private String designation;
	private double prix;
	private int quantite;
	public Qte_Articles(int numero_art, String designation, double prix, int quantite) {
		super();
		this.numero_art = numero_art;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Qte_Articles() {
		super();
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
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
    
	
	
	
}
