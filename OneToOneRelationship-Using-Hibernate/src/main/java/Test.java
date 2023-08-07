import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			Transaction TR=session.beginTransaction();
			EmployeeEntity EE=new EmployeeEntity();
			EE.setEmployeeName("Saron Jeba Christy");
			EE.setEmployeeSalary(30000);
			AddressEntity AE=new AddressEntity();
			AE.setCity("Madurai");
			AE.setState("TamilNadu");
			AE.setCountry("India");
			AE.setEmployee(EE);
			EE.setAddress(AE);
			session.save(EE);
			//committing transaction
			TR.commit();
			System.out.println("One to One Created Successfully");
			session.close();
		}
	}

}
