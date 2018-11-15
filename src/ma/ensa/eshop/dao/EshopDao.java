package ma.ensa.eshop.dao;

import java.util.List;

import ma.ensa.eshop.entities.Article;
import ma.ensa.eshop.entities.Client;
import ma.ensa.eshop.entities.Commande;
import ma.ensa.eshop.helper_beans.Montant_Cmd;
import ma.ensa.eshop.helper_beans.Qte_Articles;

public interface EshopDao {

	public void EnregClient(Client c);
	public boolean IsLogin(String code,String password);
	public List<Article> listOfArticles();
	public List<Montant_Cmd> MesCmd(String code);
	public List<Qte_Articles> getCmdArticles(int numero_cmd);
	public String getNom(String code);
	public double getMontantCmd(int numero_cmd);
	public Commande getCmdByNumero(int numero_cmd);
}
