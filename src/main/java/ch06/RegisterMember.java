package ch06;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterMember
 */
@WebServlet("/ch06/regMember")
public class RegisterMember extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String pwd2 = request.getParameter("pwd2");
		String uname = request.getParameter("uname");
		String birthDay = request.getParameter("birthDay");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		
		String data = "uid:" + uid + "\n";
		data += "pwd:" + pwd.equals(pwd2) + "\n";
		data += "uname:" + uname + "\n";
		data += "birthDay:" + birthDay + "\n";
		data += "email:" + email + "\n";
		data += "gender:" + gender + "\n";
		data += "hobbies:" + hobbies + "\n";
	}

}
