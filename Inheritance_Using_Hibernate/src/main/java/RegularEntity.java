import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity  
@Table(name="Regular_Students")
@DiscriminatorValue("Regular")  
public class RegularEntity extends StudentEntity{
	private String name;
	private int fees;
	//getters and setters 
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getFees() {
	return fees;
	}
	public void setFees(int fees) {
	this.fees = fees;
	}

}
