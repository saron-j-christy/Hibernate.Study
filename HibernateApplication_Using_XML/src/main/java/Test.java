import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				//Creating new object
				try(Session session = HibernateUtility.getSessionFactory().openSession())
				{
					Transaction TR=session.beginTransaction();
					Employee employee=new Employee();
					employee.setEmployeeName("Sherin Justus");
					employee.setEmployeeSalary(60000);
					session.save(employee);
					//committing transaction
					TR.commit();
					System.out.println("Table Created Successfully");
					session.close();
				}catch(Exception e) {e.printStackTrace();}
	}

}
