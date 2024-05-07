package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false,length = 50)
	private String nombre;
	
	@Column(name = "descripcion",nullable = false,length = 50)
	private String descripcion;
	
	@Column(name = "salon",nullable = false,length = 50,unique = true)
	private String salon;
	
	public Estudiante() {
		
	}

	public Estudiante(Long id, String nombre, String descripcion, String salon) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion ;
		this.salon = salon;
	}
	
	public Estudiante( String nombre, String descripcion, String salon) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.salon = salon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", salon=" + salon + "]";
	}
	
	
}
