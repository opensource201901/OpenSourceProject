package edu.upc.model.entity;


import java.io.Serializable;
/*import java.util.List;*/

/*import javax.persistence.CascadeType;*/
import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.FetchType;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
/*import javax.persistence.OneToMany;*/

@Entity
@Table(name="Tipo_Pago")
public class TipoPago implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="Descripcion_TPago")
	private String Descripcion;
	/*@OneToMany(mappedBy = "tipo_pago",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Boleta>boletas;*/
	
	public TipoPago() {
		/*this.boletas=new ArrayList<>();*/
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	/*public List<Boleta> getBoletas() {
		return boletas;
	}

	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}*/


	
}
