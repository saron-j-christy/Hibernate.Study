import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating new object
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			Transaction TR=session.beginTransaction();
			EmployeeEntity EE=new EmployeeEntity();
			EE.setEmployeeName("Sherin Justus");
			EE.setEmployeeSalary(60000);
			session.save(EE);
			//committing transaction
			TR.commit();
			System.out.println("Table Created Successfully");
			session.close();
		}catch(Exception e) {e.printStackTrace();}
		//Showing Particular Object
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			Transaction TR=session.beginTransaction();
			EmployeeEntity employee=new EmployeeEntity();
			employee=(EmployeeEntity)session.get(EmployeeEntity.class,3);
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getEmployeeSalary());
			//committing transaction
			TR.commit();
			//closing the session
			session.close();
		}catch(Exception e) {e.printStackTrace();}
		//Updating Object
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			Transaction TR=session.beginTransaction();
			EmployeeEntity employee=new EmployeeEntity();
			employee.setEmployeeId(2);
			employee.setEmployeeName("Obworo David Sabbath-Updated");
			employee.setEmployeeSalary(50000);
			session.update(employee);
			//committing transaction
			TR.commit();
			System.out.println("Employee Updated Successfully");
			//closing the session
			session.close();
		}catch(Exception e) {e.printStackTrace();}
		//Deleting Object
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			Transaction TR=session.beginTransaction();
			EmployeeEntity employee=new EmployeeEntity();
			employee.setEmployeeId(1);
			session.delete(employee);
			//committing transaction
			TR.commit();
			System.out.println("Employee Deleted Successfully");
			//closing the session
			session.close();
		}catch(Exception e) {e.printStackTrace();}
		
		
	}

}
