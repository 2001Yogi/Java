package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.WishListDao;
import model.WishList;

/**
 * Servlet implementation class WishListController
 */
@WebServlet("/WishListController")
public class WishListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WishListController() {
    	 super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equalsIgnoreCase("add")) {
			WishList w = new WishList();
			int cusid = Integer.parseInt(request.getParameter("cusid"));
			int pid = Integer.parseInt(request.getParameter("pid"));
			w.setCusid(Integer.parseInt(request.getParameter("cusid")));
			w.setPid(Integer.parseInt(request.getParameter("pid")));
			System.out.println(w);
			boolean flag  =WishListDao.checkProduct(pid, cusid);
			if(flag == true) {
				request.setAttribute("msg", "product already added");
				request.getRequestDispatcher("customer-home.jsp").forward(request, response);
			}
			else {
				WishListDao.insertIntoWishList(w);
				response.sendRedirect("customer-home.jsp");
			}
		}else if(action.equalsIgnoreCase("remove")) {
			int wid = Integer.parseInt(request.getParameter("wid"));
			WishListDao.removeWishLIst(wid);
			response.sendRedirect("wishlist.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
