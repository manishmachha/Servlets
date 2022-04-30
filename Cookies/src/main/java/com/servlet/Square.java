package com.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Square
 */
public class Square extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Square() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num = 0;
		Cookie cookies[] = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("result"))
				num = Integer.parseInt(c.getValue());
		}

		int square = num * num;
		PrintWriter out = response.getWriter();
		out.println("Square is " + square);
	}

}
