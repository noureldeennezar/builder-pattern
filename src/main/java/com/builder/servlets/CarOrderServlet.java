package com.builder.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.builder.*;
/**
 * Servlet implementation class PizzaOrderServlet
 */
@WebServlet("/orderPizza")
public class CarOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String shape = request.getParameter("shape");
        String color = request.getParameter("color");
        String[] types = request.getParameterValues("types");

        CarBuilder builder = new ConcreteCarBuilder();
        builder.setShape(shape).setColor(color);
        for (String type : types) {
            builder.addType(type);
        }
        Car car = builder.build();

        // Forward to a JSP page to display the pizza order summary
        request.setAttribute("car", car);
        RequestDispatcher dispatcher = request.getRequestDispatcher("carSummary.jsp");
        dispatcher.forward(request, response);
    }

}
