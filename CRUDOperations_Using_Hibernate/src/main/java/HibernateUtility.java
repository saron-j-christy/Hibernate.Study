
import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	public class HibernateUtility {
		
		
		private static StandardServiceRegistry registry;
		private static SessionFactory sessionFactory;
		public static SessionFactory getSessionFactory() {
		try {
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources source = new MetadataSources(registry);
		Metadata data = source.getMetadataBuilder().build();
		sessionFactory = data.getSessionFactoryBuilder().build();
		}catch(Exception ex) {
		ex.printStackTrace();
		}
		return sessionFactory;
		}
		}