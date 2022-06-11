package trial.MyDetails.EntityClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyDetails")
public class MyDetails {
	
	@Id
	@Column(name="id")
	private Integer id;	
	
	@Column(name="name")
	private String name;
	
	@Column(name="occupation")
	private String occupation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	
	
	public MyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MyDetails(Integer id, String name, String occupation) {
		super();
		this.id = id;
		this.name = name;
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "MyDetails [id=" + id + ", name=" + name + ", occupation=" + occupation + "]";
	}
	
	//checking another commit


}
