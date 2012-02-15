import java.util.Date;

public class Event {

	private String title;
	private String description;
	private Date startTime;
	private Date endTime;
	private String author;

	public Event(String t, String d, Date start, Date end, String a) {
		title = t;
		description = d;
		startTime = start;
		endTime = end;
		author = a;

	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription(){
		return description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
	
	public String getAuthor(){
		return author;
	}

}
