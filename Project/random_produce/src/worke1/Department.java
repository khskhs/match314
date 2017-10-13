package worke1;

import java.util.List;

public class Department {
	private List<String> event_schedules;
	private int member_limit;
	private String department_no;
	private List<String> tags;
	public List<String> getEvent_schedules() {
		return event_schedules;
	}
	public void setEvent_schedules(List<String> event_schedules) {
		this.event_schedules = event_schedules;
	}
	public int getMember_limit() {
		return member_limit;
	}
	public void setMember_limit(int member_limit) {
		this.member_limit = member_limit;
	}
	public String getDepartment_no() {
		return department_no;
	}
	public void setDepartment_no(String department_no) {
		this.department_no = department_no;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	
	

}
