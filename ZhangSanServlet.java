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
		response.setCharacterEncoding("UTF-8");// ����������ݵı����ʽ
		response.setContentType("text/html");// ����������ļ�����
		PrintWriter out = response.getWriter();//��Ӧҳ��
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<HEAD><meta charset='UTF-8'><title>���ϵǳ�</title></HEAD>");
		out.println("<BODY>��Һã��������϶��������ר�ܻ�����ý��<br/>" 
				+"���裺��ǧ����Եһ��ǣ����Ե���Ų���ʶ����<br/>"
				+"����Ժ���ʲô������������ⶼ��������ѯ��,��һ����Դ�ң�֪�޲��ԣ����޲�����<br/>"
				+ "������һ��Ҫ��ס�ҵ��ǳ�:yueLao,��ѯ�ҵĵ�ַ�ǣ�"
				+ "http://localhost:8080/TianJi/yueLao��</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();//�ر������
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
