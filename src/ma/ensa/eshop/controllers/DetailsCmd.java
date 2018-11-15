package ma.ensa.eshop.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;
import ma.ensa.eshop.entities.Commande;
import ma.ensa.eshop.helper_beans.Qte_Articles;

/**
 * Servlet implementation class DetailsCmd
 */
public class DetailsCmd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsCmd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String d=request.getParameter("d");
		int numero_cmd=Integer.parseInt(d);
		EshopDaoImpl dao=new EshopDaoImpl();
		Commande c=dao.getCmdByNumero(numero_cmd);
		request.setAttribute("numero_cmd",c.getNumero_cmd());
		request.setAttribute("date_cmd", c.getDate_cmd());
		request.setAttribute("montant_cmd",dao.getMontantCmd(numero_cmd));
		request.setAttribute("articles",dao.getCmdArticles(numero_cmd));
		this.getServletContext().getRequestDispatcher("/detailesCmd.jsp").forward(request, response);
	}

}
