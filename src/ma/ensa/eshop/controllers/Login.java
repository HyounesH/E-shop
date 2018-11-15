package ma.ensa.eshop.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EshopDaoImpl dao=new EshopDaoImpl();
		 String code=request.getParameter("code");
		 String pass=request.getParameter("password");
		 if(dao.IsLogin(code, pass)){
			 String nom=dao.getNom(code);
			 HttpSession session=request.getSession();
			 session.setAttribute("code", code);
			 session.setAttribute("user", nom);
			 this.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		 }
		 else{
			 String message="probléme d'authentification .<br> code ou mot de pass incorrect";
		     request.setAttribute("message", message);
			 this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		 }
	     
	}

}
