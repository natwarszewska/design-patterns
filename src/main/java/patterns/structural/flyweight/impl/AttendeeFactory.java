package patterns.structural.flyweight.impl;

import java.util.HashMap;

public class AttendeeFactory {
    private static final HashMap attendees = new HashMap();

    public static Attendee getAttendee(String name) {
        AttendeeImpl attendeeImpl = (AttendeeImpl)attendees.get(name);
        if(attendeeImpl == null) {
            attendeeImpl = new AttendeeImpl(name);
            attendees.put(name, attendeeImpl);
            System.out.println("Creating a new attendee: " + name);
        }
        return attendeeImpl;
    }
}