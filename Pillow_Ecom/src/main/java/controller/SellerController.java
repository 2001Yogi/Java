package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.event.TreeSelectionListener;

import dao.SellerDao;
import model.Seller;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SellerController() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			Seller s = new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			System.out.println(s);
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if(flag == false) {
				SellerDao.insertSeller(s);
				response.sendRedirect("seller-login.jsp");
			}
			else {
				request.setAttribute("msg", "user already exist");
				request.getRequestDispatcher("seller-registration.jsp").forward(request, response);
			}
			
		}
		
		else if(action.equalsIgnoreCase("login")) {
			Seller s = new Seller();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email  = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if(flag == true) {
				Seller s1 = SellerDao.sellerLogin(s);
				if(s1!= null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}else {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				}
					
			}else {
				request.setAttribute("msg", "account not found");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
			
		}
		
		else if(action.equalsIgnoreCase("update")) {
			Seller s = new Seller();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			SellerDao.updateSellerProfile(s);
			HttpSession session = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("up")) {
			String email = request.getParameter("email");
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = SellerDao.checkOldPassword(email, op);
			if(flag==true) {
				if(np.equals(cnp)) {
					SellerDao.updateSellerPassword(email, np);
					response.sendRedirect("seller-home.jsp");
				}else {
					request.setAttribute("msg","NP and CNP is not matched");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("msg", "Old Password is incorrect");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);

			}
		}
		
//		else if(action.equalsIgnoreCase("get-otp")) {
//			String email = request.getParameter("email");
//			boolean flag = SellerDao.checkEmail(email);
//			if(flag == true) {
//				Random r = new Random();
//				int num = r.nextInt(999999);
//		}
//	}

 }
}