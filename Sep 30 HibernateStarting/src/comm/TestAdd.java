package comm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAdd { //create 3 objects 
	
	public static void main(String[] args) {
	Configuration cfg =new Configuration().configure("hibernate.cfg.xml");
	
	SessionFactory sf = cfg.buildSessionFactory();
	
	Session session = sf.openSession();
	
	Employee emp = new Employee();
	emp.setEid(100);
	emp.setName("Hrishikesh");	
	emp.setAddress("GaneshNagar");	
		
	session.save(emp);
	session.beginTransaction().commit();
	System.out.println("Records Inserted Successfully..!!!");
		
		
		
		
		
		
	}	
	
}
