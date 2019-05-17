package edu.upc.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;*/
import javax.persistence.OneToMany;
/*import javax.persistence.OneToOne;*/
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Revision")
public class Revision implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/*@OneToOne
	@JoinColumn(name="cod_cita")
	private Cita cita_sel;*/
	@Column(name="descripcion_cita")
	private String descripcion;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	@OneToMany(mappedBy = "revision_sel",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<DetalleServicio>det_serv;
	public Revision() {
		this.det_serv=new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public Cita getCita_sel() {
		return cita_sel;
	}
	public void setCita_sel(Cita cita_sel) {
		this.cita_sel = cita_sel;
	}*/
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public List<DetalleServicio> getDet_serv() {
		return det_serv;
	}
	public void setDet_serv(List<DetalleServicio> det_serv) {
		this.det_serv = det_serv;
	}
	
	
}
