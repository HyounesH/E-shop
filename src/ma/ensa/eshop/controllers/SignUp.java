package ma.ensa.eshop.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;
import ma.ensa.eshop.entities.Client;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EshopDaoImpl daoImpl=new EshopDaoImpl();
		String code=request.getParameter("code");
		String pass=request.getParameter("password");
		String nom=request.getParameter("name");
		String address=request.getParameter("address");
		String ville=request.getParameter("ville");
		Client c=new Client(code, pass, nom, ville, address);
		daoImpl.EnregClient(c);
		HttpSession session=request.getSession();
		session.setAttribute("user",nom);
		session.setAttribute("code",code);
		this.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
}

}
