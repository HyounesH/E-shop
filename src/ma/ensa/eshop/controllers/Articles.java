package ma.ensa.eshop.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;

/**
 * Servlet implementation class Articles
 */
public class Articles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Articles() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	EshopDaoImpl dao=new EshopDaoImpl();
	request.setAttribute("articles", dao.listOfArticles());
    this.getServletContext().getRequestDispatcher("/articles.jsp").forward(request, response);
	}

}
