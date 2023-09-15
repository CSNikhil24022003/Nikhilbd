package anudip.org;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Subjects {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String subjectname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}	
}