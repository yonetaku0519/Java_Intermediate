

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String input = request.getParameter("dataInput");
		
		// アプリケーションスコープ
		ServletContext context = getServletContext();
		context.setAttribute("data", input);
		
		// リクエストスコープ
		request.setAttribute("data", input);
		
		// セッションスコープ
		HttpSession session = request.getSession();
		session.setAttribute("data", input);
		
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		
		rd.forward(request, response);
	}

}
