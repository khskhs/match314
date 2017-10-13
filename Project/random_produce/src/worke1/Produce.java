package worke1;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Produce {
	private int numOfStudent;
	private int numOfDepartment;
	
	public Produce(int x,int y) {
		this.numOfStudent=x;
		this.numOfDepartment=y;
	}
		
	
	 String  week []= { 
		"Mon","Tues","Wed","Thur","Fri","Sat","Sun"
	};//7
	 String  tag[]={
		 "film", "English", "reading", "music", "dance", "basketball", "football", "baseball", "study", "chess", "programming"

	 };//11
	 public Input produce() {
		 Input SD = new Input ();
		 for(int i=0;i<numOfStudent;i++)
		 {
			 Student s= new Student();
			 if(i<10)
			 {
				 s.setStudent_no("03150200"+i);
			 }
			 else if(i<100)
			 {
				 s.setStudent_no("0315020"+i);
			 }
			 else
			 {
				 s.setStudent_no("031502"+i);
			 }
			 s.setFree_time(produce_free_time());
			 s.setApplications_department(produce_applications_department());
			 s.setTags(produce_tags());
			 SD.getStudents().add(s);
		 }
		 for(int i=0;i<numOfDepartment;i++)
		 {
			 Department d = new Department();
			 if(i<10)
			 {
				 d.setDepartment_no("D0"+i);
			 }
			 else
			 {
				 d.setDepartment_no("D"+i);
			 }
			 d.setEvent_schedules(produce_event_schedules());
			 Random r= new Random();
			 d.setMember_limit(r.nextInt(8)+8);
			 d.setTags(produce_tags());
			 SD.getDepatments().add(d);
		 }
		 return SD;
	 }
	
	
	private List<String> produce_free_time() {
		 List<String> freetime=new ArrayList<>();
		 Random r= new Random();
		 int count =r.nextInt(10)+8;
		 while(count>0)
		 {
			 count--;
			 int beginTime=r.nextInt(13)+8;
			 String s=week[r.nextInt(7)]+"."+beginTime+":00~"+(beginTime+2)+":00";
			 freetime.add(s);
		 }
		 
		return freetime;
				 
	 }
	private List<String> produce_applications_department() {
		 List<String> applications=new ArrayList<>();
		 Random r= new Random();
		 int count =r.nextInt(5)+1;
		 while(count>0)
		 {
			 count--;
			 int num=r.nextInt(20)+1;
			 String s;
			 if(num<10)
			 {
				 s="D00"+num;
			 }
			 else
			 {
				 s="D0"+num;
			 }
			 applications.add(s);
		 }
		 
		return applications;
				 
	 }
	private List<String> produce_tags() {
		 List<String> tag=new ArrayList<>();
		 Random r= new Random();
		 int count =r.nextInt(10)+1;
		 String  tags[]={
				 "film", "English", "reading", "music", "dance", "basketball", "football", "baseball", "study", "chess", "programming"

			 };
		 while(count>0)
		 {
			 count--;
			 int num=r.nextInt(11);
			 String s;
			 if(tags[num]!=null)
			 {
				 s=tags[num];
				 tags[num]=null;
				 tag.add(s);
			 }
			 else count++;
			  
			 
			 
		 }
		 
		return tag;
				 
	 }
	private List<String> produce_event_schedules() {
		 List<String> event_schedule=new ArrayList<>();
		 Random r= new Random();
		 int count =r.nextInt(6)+1;
		 while(count>0)
		 {
			 count--;
			 int beginTime=r.nextInt(13)+8;
			 String s=week[r.nextInt(7)]+"."+beginTime+":00~"+(beginTime+1)+":00";
			 event_schedule.add(s);
		 }
		 
		return event_schedule;
				 
	 }
}