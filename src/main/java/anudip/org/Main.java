package anudip.org;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();          
		   Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();		   
		   SessionFactory sf=md.getSessionFactoryBuilder().build();		   
		   Session session=sf.openSession();		   
		   Transaction t=session.beginTransaction();		   
		   Subjects s=new Subjects();
		   s.setSubjectname("Java");		   
		   Subjects s1=new Subjects();
		   s1.setSubjectname("C language");		   
		   Subjects s2=new Subjects();
		   s2.setSubjectname("DBMS");		   
		   List<Subjects> list=new ArrayList<Subjects>();
		   list.add(s);
		   list.add(s1);
		   list.add(s2);		   
		   Teacher teacher=new Teacher();
		   teacher.setTname("Chaitanya");
		   teacher.setSalary(50000);
		   teacher.setSubjects(list);		   
		   //session.persist(s);
		  // session.persist(s1);
		   //session.persist(s2);
		  // session.persist(teacher);		   
		   t.commit();
		   session.close();
		   sf.close();   
	}
}