

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	
	// リクエストを受け取るとdoGetメソッドが動作する
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// この処理は簡易的に画面に文字列を出力する
		response.getWriter().append("Hello");
	}

}
