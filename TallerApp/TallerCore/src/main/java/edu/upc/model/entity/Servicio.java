package edu.upc.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name ="Servicio")
public class Servicio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "nombre_servicio")
	private String Nombre;
	@Column(name="descripcion_servicio")
	private String Descripcion;
	@OneToMany(mappedBy = "servicio_sel",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
	private List<DetalleServicio>details;
	
	public Servicio() {
		this.details= new ArrayList<>();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public List<DetalleServicio> getDetails() {
		return details;
	}
	public void setDetails(List<DetalleServicio> details) {
		this.details = details;
	}
	
	
}
