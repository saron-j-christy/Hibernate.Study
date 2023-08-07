
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

	@Entity  
	@Table(name = "student_details")  
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
	@DiscriminatorColumn(name="Class_Name",discriminatorType=DiscriminatorType.STRING)  
	@DiscriminatorValue("Base")  
	public class StudentEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="studentId")
		   	private int id;
			private String sname;
			
			//getters and setters 
	 
			public String getSname() {
			return sname;
			}
			public void setSname(String sname) {
			this.sname = sname;
			}
		
			public int getId() {
			return id;
			}
			public void setId(int id) {
			this.id = id;
			}
		
	    
}
