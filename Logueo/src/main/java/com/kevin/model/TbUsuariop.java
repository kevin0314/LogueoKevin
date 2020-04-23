package com.kevin.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_usuariop database table.
 * 
 */
@Entity
@Table(name="tb_usuariop")
@NamedQuery(name="TbUsuariop.findAll", query="SELECT t FROM TbUsuariop t")
public class TbUsuariop implements Serializable {
	private static final long serialVersionUID = 1L;

	private String apellido_usuario;

	private String contrasenia;
	@Id
	private int idUsuarios;

	private String nombre_usuario;

	private String usuario;

	public TbUsuariop() {
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}