package org.kechang.service.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kechang.service.util.SignUtil;

public class CoreServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Wechat encrypted signature
		String signature = request.getParameter("signature");
		//Timestamp
		String timestamp = request.getParameter("timestamp");
		//Random
		String nonce = request.getParameter("nonce");
		//Random string
		String echostr = request.getParameter("echostr");
		
		PrintWriter out =response.getWriter();
		//Ask for check
		if(SignUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
			
		}
		out.close();
		out = null;
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
	}
}
