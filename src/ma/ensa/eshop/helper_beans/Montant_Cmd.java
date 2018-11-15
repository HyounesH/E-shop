package ma.ensa.eshop.helper_beans;

import java.time.LocalDate;

public class Montant_Cmd {

	private int numero_cmd;
	private LocalDate date_cmd;
	private double montant;
	
	
	
	
	public Montant_Cmd(int numero_cmd, LocalDate date_cmd, double montant) {
		super();
		this.numero_cmd = numero_cmd;
		this.date_cmd = date_cmd;
		this.montant = montant;
	}
	
	public Montant_Cmd(){};
	public int getNumero_cmd() {
		return numero_cmd;
	}
	public void setNumero_cmd(int numero_cmd) {
		this.numero_cmd = numero_cmd;
	}
	public LocalDate getDate_cmd() {
		return date_cmd;
	}
	public void setDate_cmd(LocalDate date_cmd) {
		this.date_cmd = date_cmd;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	};
	

}
