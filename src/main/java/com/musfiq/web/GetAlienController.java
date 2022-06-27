package com.musfiq.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.musfiq.web.dao.AlienDao;
import com.musfiq.web.model.Alien;


public class GetAlienController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		request.setAttribute("alien", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
		
		
	}


}
