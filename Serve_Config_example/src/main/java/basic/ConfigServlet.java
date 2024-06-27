package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 * @param <ServletConfig>
 */
@WebServlet("/ConfigServlet")
public class ConfigServlet<ServletConfig> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String param1;
    private String param2;
    
    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
        param1 = config.getInitParameter("param1");
        param2 = config.getInitParameter("param2");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Servlet Configuration Parameters</h2>");
        response.getWriter().println("Param1: " + param1 + "<br>");
        response.getWriter().println("Param2: " + param2 + "<br>");
        response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
