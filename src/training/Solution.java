package training;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Event {
    String name;
    LocalDate date;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
    	return name;
    }
    public void setName(String name) {
		this.name = name;
	}

    public LocalDate getDate() {
    	return date;
    }
	public void setDate(LocalDate date) {
		this.date = date;
	}


}

public class Solution {

	public static void main(String[] args) {
		ArrayList<Event> eventList = new ArrayList<>();
		Event e1 = new Event("Music1", LocalDate.of(2024, 1, 1));
		Event e2 =new Event("Music2", LocalDate.of(2024, 1, 2));
		Event e3 =new Event("Concert1", LocalDate.of(2024, 1, 3));
		Event e4 =new Event("Sports1", LocalDate.of(2024, 1, 4));
		
        eventList.add(e1);
        eventList.add(e2);
        eventList.add(e3);
        eventList.add(e4);
        
        Collections.sort(eventList, Comparator.comparing(Event::getDate).reversed());
        
        System.out.println("Events sorted by date (descending order):");
        for (Event eve : eventList) {
            System.out.println("Event: " + eve.getName() + ", Date: " + eve.getDate());
        }

	}

}
