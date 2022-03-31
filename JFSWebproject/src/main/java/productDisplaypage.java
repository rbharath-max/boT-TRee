

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class productDisplaypage
 */
public class productDisplaypage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productDisplaypage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productid=request.getParameter("productid");
		out.print("<marquee>"+productid+"</marquee>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String productid=request.getParameter("productid");
		//if (productid.equals("12345")) {
		//	response.sendRedirect("productreceiver.jsp");
		//}
	//}
	//public void init(ServletConfig config) throws ServletException {
		//System.out.println("initiated");
	//}

	/**
	 * @see Servlet#destroy()
	 */
	//public void destroy() {
	//	System.out.println("destroy");
		
	//}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}


}
