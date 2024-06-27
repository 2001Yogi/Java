package basic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch data from the request
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Print data to the console
        System.out.println("Student Information:");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + password);

        // Set response content type and redirect to a success page (optional)
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Form submitted successfully!</h2></body></html>");
    }
}
