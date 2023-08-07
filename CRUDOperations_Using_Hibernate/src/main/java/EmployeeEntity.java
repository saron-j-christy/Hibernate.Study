
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="employee(CRUD)-table")
	public class EmployeeEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	
		private int employeeId;
		private String employeeName;
		private int employeeSalary;
		
		//getters and setters
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getEmployeeSalary() {
			return employeeSalary;
		}
		public void setEmployeeSalary(int employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		
		
		
	}


