package ma.ensa.eshop.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero_cmd;
	private LocalDate date_cmd;
	@ManyToOne
	@JoinColumn(name = "code")
	private Client client = new Client();

	@OneToMany(mappedBy = "cmd_art.cmd")
	private Set<Cmd_Article> cmd_art = new HashSet<>();

	public Commande() {
		// TODO Auto-generated constructor stub
	}

	public Commande(int id_cmd, LocalDate date_cmd) {
		super();
		this.numero_cmd = id_cmd;
		this.date_cmd = date_cmd;
	}

	public LocalDate getDate_cmd() {
		return date_cmd;
	}

	public void setDate_cmd(LocalDate date_cmd) {
		this.date_cmd = date_cmd;
	}

	public int getNumero_cmd() {
		return numero_cmd;
	}

	public void setNumero_cmd(int numero_cmd) {
		this.numero_cmd = numero_cmd;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Cmd_Article> getCmd_art() {
		return cmd_art;
	}

	public void setCmd_art(Set<Cmd_Article> cmd_art) {
		this.cmd_art = cmd_art;
	}

}
