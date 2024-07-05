package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.StudentDao;
import email_services.Servicesss;
import model.student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentController() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			student s = new student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("psw"));
			s.setConfirm_password(request.getParameter("conf_psw"));
			System.out.println(s);
			String email = request.getParameter("email");
			String password = request.getParameter("psw");
	        String confirmPassword = request.getParameter("conf_psw");
			boolean flag = StudentDao.checkEmail(email);
			if(flag == false && password.equals(confirmPassword) ) {
				StudentDao.insertStudent(s);
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("msg", "user already exist Or Password and Confirm Password does not match");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
			
	}
		else if(action.equalsIgnoreCase("login")) {
			student s = new student();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("psw"));
			String email  = request.getParameter("email");
			boolean flag = StudentDao.checkEmail(email);
			if(flag == true) {
				student s1 = StudentDao.studentLogin(s);
				if(s1!= null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("main.jsp").forward(request, response);
				}else {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
					
			}else {
				request.setAttribute("msg", "account not found");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		}
		
		else if(action.equalsIgnoreCase("get-otp")) {
			String email = request.getParameter("email");
			boolean flag = StudentDao.checkEmail(email);
			if(flag == true) {
				Random r = new Random();
				int num = r.nextInt(999999);
				Servicesss s = new Servicesss();
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "account doesn't exist !");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "OTP not matched");
				request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("new pass")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if(np.equals(cnp)) {
				StudentDao.updateStudentPassword(email, np);
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("msg", "NP and CNP not matched");
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("up")) {
			String email = request.getParameter("email");
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = StudentDao.checkOldPassword(email, op);
			if(flag==true) {
				if(np.equals(cnp)) {
					StudentDao.updateStudentPassword(email, np);
					response.sendRedirect("main.jsp");
				}else {
					request.setAttribute("msg","NP and CNP is not matched");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("msg", "Old Password is incorrect");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);

			}
		}
	}
}
