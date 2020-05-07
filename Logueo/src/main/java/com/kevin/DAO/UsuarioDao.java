package com.kevin.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kevin.model.TbUsuariop;


public class UsuarioDao {

	public List<TbUsuariop> ingresoUsuario(TbUsuariop usu){
		
		
		List<TbUsuariop> usuario = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Logueo");
		em = emf.createEntityManager();
		
		try {
		
			em.getTransaction().begin();
			usuario = em.createQuery("from TbUsuariop as u where u.usuario = '"+usu.getUsuario()+"' and u.contrasenia='"+usu.getContrasenia()+"' ").getResultList();
			em.getTransaction().commit();
			for(TbUsuariop datosids:usuario) {
				
			usu.setIdUsuarios(datosids.getIdUsuarios());	
			}
			
		} catch (Exception e) {
			System.out.println(e+"Error");
		}
		return usuario;
	}
}
