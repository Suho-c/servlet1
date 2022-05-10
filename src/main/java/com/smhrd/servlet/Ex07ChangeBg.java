package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07ChangeBg")
public class Ex07ChangeBg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String color =  request.getParameter("color");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body bgcolor = '"+color+"'>");  // 문자열 받아주려면 바로 못쓰고 작은 따옴표와 + 로 이어줘야 한다 바로 넣으면 인식못함
		
		out.print("</body>");		
		out.print("</html>");
		
	}

}
