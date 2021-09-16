package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.LineasDAO;
import modelo.LineasDTO;

/**
 * Servlet implementation class Servletgestionlineas
 */
@WebServlet("/Servletgestionlineas")
public class Servletgestionlineas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletgestionlineas() {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    boolean x;
		String nombrelinea;
		int codigo;
		LineasDTO lindto;
		LineasDAO lindao;
		if(request.getParameter("btnins")!=null) {
			
			codigo=Integer.parseInt(request.getParameter("codlin"));
			nombrelinea=request.getParameter("nomlin");
		    lindto=new LineasDTO(codigo, nombrelinea);
		    lindao=new LineasDAO();
		    x=lindao.insertarlinea(lindto);
		    if(x) {
		    	JOptionPane.showMessageDialog(null, "la linea de credito de registro");
		    	response.sendRedirect("index.jsp");
		    }
		    else {
		    	JOptionPane.showMessageDialog(null, "la linea de credito de registro");
		    	response.sendRedirect("index.jsp");
		    }
			
		}
		
		
		
	}

}
