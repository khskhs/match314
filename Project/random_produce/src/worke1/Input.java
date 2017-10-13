package worke1;

import java.util.List;
import java.util.ArrayList;
public class Input {
	private List<Student> students =new ArrayList<>() ;
	private List<Department> departments =new ArrayList<>() ;
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Department> getDepatments() {
		return departments;
	}
	public void setDepatments(List<Department> depatments) {
		this.departments = depatments;
	}
	public String toString() {
		return"{\n\"student\": [\n{\n"+students+departments;

	}

}
