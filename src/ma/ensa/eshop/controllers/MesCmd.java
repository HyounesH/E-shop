package ma.ensa.eshop.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;
import ma.ensa.eshop.helper_beans.Montant_Cmd;

/**
 * Servlet implementation class MesCmd
 */
public class MesCmd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MesCmd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String code=(String)session.getAttribute("code");
		System.out.println(code);
		EshopDaoImpl dao=new EshopDaoImpl();
		List<Montant_Cmd> list=new ArrayList<Montant_Cmd>();
		list=dao.MesCmd(code);
		request.setAttribute("commandes",list);
		this.getServletContext().getRequestDispatcher("/commandes.jsp").forward(request, response);
		}

}
