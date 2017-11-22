package pl.coderslab.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="styles")
public class Style {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_style")
	private List<Gym> gyms;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Gym> getGyms() {
		return gyms;
	}

	public void setGyms(List<Gym> gyms) {
		this.gyms = gyms;
	}

	@Override
	public String toString() {
		return "Style [id=" + id + ", name=" + name + ", gyms=" + gyms + "]";
	}

	


	
}
