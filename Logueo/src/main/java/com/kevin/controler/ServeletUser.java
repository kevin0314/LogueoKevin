package com.kevin.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kevin.DAO.HistorialDao;
import com.kevin.DAO.UsuarioDao;
import com.kevin.model.TbHistorial;
import com.kevin.model.TbUsuariop;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
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
	
		String usu = request.getParameter("txtUsuario");
		String contra = request.getParameter("txtClave");	
		String cerrar = request.getParameter("btnCerrar");	
		
		if(cerrar!=null) {
			if(cerrar.equals("CERRAR")) {
				HttpSession cerrarseciones = (HttpSession) request.getSession();
				cerrarseciones.invalidate();
				response.sendRedirect("index.jsp");
				
			}
				
			}else {
		
		
		TbUsuariop usuario = new TbUsuariop();
		
		usuario.setUsuario(usu);
		usuario.setContrasenia(contra);
		
		UsuarioDao usudao = new UsuarioDao();
		int verificar = usudao.ingresoUsuario(usuario).size();
		
		if(verificar == 1) {
			TbHistorial histo = new TbHistorial();
			HistorialDao histodao = new HistorialDao();
			
			Date fecha = new Date();
			
			histo.setFecha(fecha);
			usuario.setIdUsuarios(usuario.getIdUsuarios());
			histo.setTbUsuariop(usuario);
			histodao.agregarDatosHistorial(histo);
			
			HttpSession seccion = request.getSession(true);
			seccion.setAttribute("usuario", usu);
			response.sendRedirect("Principal.jsp");
			
		}else{
			
			System.out.println("No se encontro el usuario");
		}
		
		
		
		response.sendRedirect("index.jsp");
	}

}
	
}
