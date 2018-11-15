package ma.ensa.eshop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.ensa.eshop.dao.EshopDao;
import ma.ensa.eshop.dao.HibernateUtil;
import ma.ensa.eshop.entities.Article;
import ma.ensa.eshop.entities.Client;
import ma.ensa.eshop.entities.Cmd_Article;
import ma.ensa.eshop.entities.Commande;
import ma.ensa.eshop.helper_beans.Montant_Cmd;
import ma.ensa.eshop.helper_beans.Qte_Articles;

public class EshopDaoImpl implements EshopDao {
	
	@Override
	public double getMontantCmd(int numero_cmd) {
		List<Qte_Articles> articles = new ArrayList<Qte_Articles>();
		double montant=0;
		EshopDaoImpl dao=new EshopDaoImpl();
	    articles=dao.getCmdArticles(numero_cmd);
	    for(Qte_Articles a:articles){
	    	montant=montant+(a.getPrix()*a.getQuantite());
	    }
		return montant;
	}
	

	@Override
	public void EnregClient(Client c) {
   		Session session=HibernateUtil.getSessionFactory().openSession();
   		session.beginTransaction();
   		session.save(c);
   		session.getTransaction().commit();
   		session.close();
	}

	@Override
	public boolean IsLogin(String code, String password) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.createQuery("FROM Client WHERE code =? and mot_pass = ?");
		query.setString(0, code);
		query.setString(1, password);
		Client c=(Client)query.uniqueResult();
		session.getTransaction().commit();
		session.close();
        if(c==null){
        	return false;
        }
        else{
		return true;
        }
	}

	@Override
	public List<Article> listOfArticles() {
      List<Article> articles=new ArrayList<Article>();
      Session session=HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      articles=session.createQuery("FROM Article").list();
	  session.getTransaction().commit();
	  session.close();
	 return articles;
	}

	@Override
	public List<Montant_Cmd> MesCmd(String code) {
	  EshopDaoImpl dao=new EshopDaoImpl();
	  List<Montant_Cmd> list=new ArrayList<Montant_Cmd>();
	  List<Commande> cmds=new ArrayList<Commande>();
      Session session=HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      Query query=session.createQuery("FROM Commande where code = ?");
      query.setString(0, code);
      cmds=query.list();
      for(Commande c:cmds){
    	  Montant_Cmd mnt_cmd=new Montant_Cmd();
    	  mnt_cmd.setDate_cmd(c.getDate_cmd());
    	  mnt_cmd.setNumero_cmd(c.getNumero_cmd());
    	  mnt_cmd.setMontant(dao.getMontantCmd(c.getNumero_cmd()));
    	  list.add(mnt_cmd);
      }
      session.getTransaction().commit();
      session.close();
	  return list;
	}

	@Override
	public List<Qte_Articles> getCmdArticles(int numero_cmd) {
		List<Integer> numero_arts=new ArrayList<>();
		List<Qte_Articles> qte_articles=new ArrayList<Qte_Articles>();
	    List<Cmd_Article> cmd_articles=new ArrayList<Cmd_Article>();
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query=session.createQuery("FROM Cmd_Article where numero_cmd = ?");
        query.setInteger(0, numero_cmd);
        
        cmd_articles=query.list();
        for(Cmd_Article ca:cmd_articles){
        	numero_arts.add(ca.getCmd_art().getArt().getNumero_art());
        }
        Query query2=session.createQuery("FROM Article where numero_art in (:numero_arts)");
        query2.setParameter("numero_arts", numero_arts);
        List<Article> articles=new ArrayList<Article>();
        articles=query2.list();
        int i=0;
        for(Article a : articles){
        
        	Qte_Articles qte_art=new Qte_Articles();
        	qte_art.setNumero_art(a.getNumero_art());
        	qte_art.setDesignation(a.getDesignation());
        	qte_art.setPrix(a.getPrix());
        	qte_art.setQuantite(cmd_articles.get(i).getQuantite());
        	i=i+1;
        	qte_articles.add(qte_art);
        }
        session.getTransaction().commit();
        session.close();
		return qte_articles;
	}

	@Override
	public String getNom(String code) {
    Session session=HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Query query=session.createQuery("FROM Client where code=?");
    query.setString(0, code);
    Client c=(Client)query.uniqueResult();
	session.getTransaction().commit();
	session.close();
		return c.getNom();
	}


	@Override
	public Commande getCmdByNumero(int numero_cmd) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.createQuery("FROM Commande where numero_cmd = ?");
		query.setInteger(0, numero_cmd);
		Commande c=(Commande)query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return c;
	}

	
	

}
