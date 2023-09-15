package anudip.org;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	private String tname;
	private int salary;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="sid")
	@OrderColumn(name="type")
	private List<Subjects>subjects;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}	
}