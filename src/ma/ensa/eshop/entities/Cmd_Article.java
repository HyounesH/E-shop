package ma.ensa.eshop.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cmd_Article {
	
	@Id
	private Cmd_Art cmd_art;
	private int quantite;
	
	public Cmd_Article(Commande c,Article a,int qte){
		cmd_art=new Cmd_Art(c, a);
		this.quantite=qte;
	}
	
	public Cmd_Article(){};
	
	public Cmd_Art getCmd_art() {
		return cmd_art;
	}
	public void setCmd_art(Cmd_Art cmd_art) {
		this.cmd_art = cmd_art;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
