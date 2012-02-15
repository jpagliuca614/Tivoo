import java.util.ArrayList;
import java.util.Date;

public class EventFilters {

	ArrayList<Event> myEvents = new ArrayList<Event>();

	public EventFilters(ArrayList<Event> parsedEvents) {
		myEvents = parsedEvents;
	}

	public ArrayList<Event> filterByTime(Date startDate, Date endDate)
			throws Exception {
		if (myEvents.isEmpty()) {
			throw new Exception("No parsed events to filter!");
		}
		ArrayList<Event> filteredEvents = new ArrayList<Event>();
		for (Event e : myEvents) {
			Date startTime = e.getStartTime();
			Date endTime = e.getEndTime();
			if (startTime.after(startDate) && endTime.before(endDate)) {
				filteredEvents.add(e);
			}
		}
		return filteredEvents;
	}

	public ArrayList<Event> filterByTitle(String titleFilter) throws Exception {
		if (myEvents.isEmpty()) {
			throw new Exception("No parsed events to filter!");
		}
		ArrayList<Event> filteredEvents = new ArrayList<Event>();
		for (Event e : myEvents) {
			String title = e.getTitle();
			if (title.equalsIgnoreCase(titleFilter)) {
				filteredEvents.add(e);
			}
		}
		return filteredEvents;
	}

}
