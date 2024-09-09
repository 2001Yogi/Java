package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String p_name;
	@ManyToMany
	private List<Employee> emp_list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<Employee> getEmp_list() {
		return emp_list;
	}
	public void setEmp_list(List<Employee> emp_list) {
		this.emp_list = emp_list;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", p_name=" + p_name + ", emp_list=" + emp_list + "]";
	}
	
}
