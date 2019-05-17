package edu.upc.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

@Entity
@Table(name="detalle_servicio")
public class DetalleServicio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="cod_servicio")
	private Servicio servicio_sel;
	@ManyToOne
	@JoinColumn(name="cod_revision")
	private Revision revision_sel;
	/*@ManyToOne
	@JoinColumn(name="cod_tecnico")
	private Tecnico tecnico_sel;
	@ManyToOne
	@JoinColumn(name="cod_repuesto")
	private Repuesto repuesto_sel;*/
	@Column(name="cant_horas")
	private int cant_horas;
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_serv")
	private Date fecha;
	@Column(name="cant_rep")
	private int cant_rep;
	public DetalleServicio() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Servicio getServicio_sel() {
		return servicio_sel;
	}
	public void setServicio_sel(Servicio servicio_sel) {
		this.servicio_sel = servicio_sel;
	}
	public Revision getRevision_sel() {
		return revision_sel;
	}
	public void setRevision_sel(Revision revision_sel) {
		this.revision_sel = revision_sel;
	}
	/*public Tecnico getTecnico_sel() {
		return tecnico_sel;
	}
	public void setTecnico_sel(Tecnico tecnico_sel) {
		this.tecnico_sel = tecnico_sel;
	}
	public Repuesto getRepuesto_sel() {
		return repuesto_sel;
	}
	public void setRepuesto_sel(Repuesto repuesto_sel) {
		this.repuesto_sel = repuesto_sel;
	}*/
	public int getCant_horas() {
		return cant_horas;
	}
	public void setCant_horas(int cant_horas) {
		this.cant_horas = cant_horas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCant_rep() {
		return cant_rep;
	}
	public void setCant_rep(int cant_rep) {
		this.cant_rep = cant_rep;
	}
	
	
	
	
	
}
