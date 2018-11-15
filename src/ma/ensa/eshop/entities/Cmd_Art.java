package ma.ensa.eshop.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Cmd_Art implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="numero_cmd")
	private Commande cmd;
	
	
	@ManyToOne
	@JoinColumn(name="numero_art")
	private Article art;
	
	public Cmd_Art(Commande cmd, Article art) {
		super();
		this.cmd = cmd;
		this.art = art;
	}
	
	public Cmd_Art(){}

	public Commande getCmd() {
		return cmd;
	}

	public void setCmd(Commande cmd) {
		this.cmd = cmd;
	}

	public Article getArt() {
		return art;
	}

	public void setArt(Article art) {
		this.art = art;
	};
	
	
	

}
