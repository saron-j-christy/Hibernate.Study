import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Creating the information for the Base Class 
		StudentEntity SE=new StudentEntity();
		SE.setSname("sherin");
		
			//Creating the information for the Regular Extended Class 
		RegularEntity RE=new RegularEntity();
		RE.setName("Sherin");
		RE.setFees(15000);
			//Creating the information for the Part-time Extended Class 
		ParttimeEntity PE=new ParttimeEntity();
		PE.setName("Lincy");
		PE.setFees(20000);
		
		Transaction txn;
		try(Session ses = HibernateUtility.getSessionFactory().openSession()){
		
			txn=ses.beginTransaction();
			ses.save(SE);
			ses.save(RE);
			ses.save(PE);
			txn.commit();
	}

}
}
