

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateTimeApp
 */
@WebServlet("/DateTimeApp")
public class DateTimeApp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Date d = new Date();
		request.setAttribute("now", d);
		
		RequestDispatcher rd = request.getRequestDispatcher("dateTimeOutput.jsp");
		
		rd.forward(request, response);
		
	}

}
