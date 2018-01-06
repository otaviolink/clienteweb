package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/cliente","/clienteServlet", "/clienteController"})
public class ClienteServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Chamou pelo M�todo GET");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Chamou pelo M�todo POST");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou o M�todo Post!");

	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Chamou o Metodo Deletar");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("Chamou o M�todo DELETE!");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Chamou o Metodo PUT!");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("Chamou o M�todo PUT!");
	}

}
