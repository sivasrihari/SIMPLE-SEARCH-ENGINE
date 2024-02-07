package in.ineuron.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.DTO.row;
import in.ineuron.Factory.ServiceFactoryMethod;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	ServiceFactoryMethod s=null;
    public SearchServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String keyword=request.getParameter("key");
		System.out.println(keyword);
		String user=request.getParameter("user");
		System.out.println(user); 
		s=new ServiceFactoryMethod();
		List<row> l=s.getServiceDAo().searchDatabase(keyword);
		Integer userid=(int)(Math.random()*10000);
		String saved=s.getServiceDAo().saveUserAndKeyword(keyword,user,userid);
		RequestDispatcher rd=request.getRequestDispatcher("search.jsp");
		System.out.println(l);
		request.setAttribute("webresults",l);
		request.setAttribute("status",saved);
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
