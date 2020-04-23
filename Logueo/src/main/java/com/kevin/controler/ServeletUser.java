package com.kevin.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kevin.DAO.UsuarioDao;
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
		
		TbUsuariop usuario = new TbUsuariop();
		
		usuario.setUsuario(usu);
		usuario.setContrasenia(contra);
		
		UsuarioDao usudao = new UsuarioDao();
		int verificar = usudao.ingresoUsuario(usuario).size();
		
		if(verificar == 1) {
			
			System.out.println("Entraste");
			
		}else{
			
			System.out.println("No se encontro el usuario");
		}
		
		
		
		response.sendRedirect("index.jsp");
	}

}
