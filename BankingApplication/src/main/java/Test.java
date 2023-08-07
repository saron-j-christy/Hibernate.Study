import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {
		
	public static void saveCustomer()
	{
			Transaction transaction=null;
			try(Session session = HibernateUtility.getSessionFactory().openSession())
			{
			//start the transaction
			transaction= session.beginTransaction();
			//creating Customer Object
			Customer customer1=new Customer(1001,10000,"Saron Jeba Christy","Kochadai");
			//amount Deposited
			customer1.setAmtDeposit(2000);
			customer1.setBalance(customer1.getInitialAmt()+customer1.getAmtDeposit());
			//amount Withdrawn
			customer1.setAmtWithdraw(1000);
			customer1.setBalance(customer1.getBalance()-customer1.getAmtWithdraw());
			session.save(customer1);
			//commit the transaction
			transaction.commit();
			List li=session.createQuery("from Customer dp").list();
			Iterator it=li.iterator();
			while(it.hasNext())
			{
				Object o=(Object)it.next();
				Customer dp=(Customer)o;
				System.out.println("Account Number : " + dp.getCustomerId());
				System.out.println("Name : " + dp.getCustomerName());
				System.out.println("Branch : " + dp.getBranch());	
				System.out.println("Initial Amount : " + dp.getInitialAmt());	
				System.out.println("Amount Deposited : " + dp.getAmtDeposit());	
				System.out.println("Amount Withdrawn: " + dp.getAmtWithdraw());	
				System.out.println("Balance : " + dp.getBalance());	
				System.out.println();
						
			}
			session.close();
			
			}catch(Exception e)
			{
			if(transaction!=null)
			{
			transaction.rollback();
			}
			}
	}
		public static void main(String[] args) 
			{
			Test.saveCustomer();
			}
}
	

