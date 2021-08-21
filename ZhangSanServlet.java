package com.tianting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ZhangSanservlet
 */
@WebServlet("/ZhangSanservlet")
public class ZhangSanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ZhangSanServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");// 设置输出内容的编码格式
		response.setContentType("text/html");// 设置输出的文件类型
		PrintWriter out = response.getWriter();//响应页面
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<HEAD><meta charset='UTF-8'><title>月老登场</title></HEAD>");
		out.println("<BODY>大家好，我是月老儿。是天界专管婚姻的媒神。<br/>" 
				+"俗谚：“千里姻缘一线牵，无缘对门不相识”。<br/>"
				+"大家以后有什么婚姻方面的问题都可以来咨询我,我一定会对大家：知无不言，言无不尽！<br/>"
				+ "另外大家一定要记住我的昵称:yueLao,咨询我的地址是："
				+ "http://localhost:8080/TianJi/yueLao。</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();//关闭输出流
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
