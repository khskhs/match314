package worke1;

import java.util.List;

public class Student {
	private String student_no;
	private List<String>free_time;
	private List<String>applications_department;
	private List<String>tags;
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public List<String> getFree_time() {
		return free_time;
	}
	public void setFree_time(List<String> free_time) {
		this.free_time = free_time;
	}
	public List<String> getApplications_department() {
		return applications_department;
	}
	public void setApplications_department(List<String> applications_department) {
		this.applications_department = applications_department;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	

}
