package org.example.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Meeting {
    private int id;
    private String topic;
    private LocalDate meetingDate;
    private LocalTime start;
    private LocalTime end;
    private Person organizer;
    private List<Person> attendants;
    public static int count= 1;

    public static int getCount( int count) {
        return count++;
    }

    public Meeting(int id, String topic, LocalDate meetingDate, LocalTime start, LocalTime end, Person organizer, List<Person> attendants) {
        this.id =getCount(count);
        setTopic(topic);
        setMeetingDate(meetingDate);
        setStart(start);
        setEnd(end);
        setOrganizer(organizer);
        setAttendants(attendants);
            }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if (topic==null) throw new IllegalArgumentException("Please enter a topic");
        this.topic = topic;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        if (meetingDate==null) throw new IllegalArgumentException("Please enter meeting date");
        this.meetingDate = meetingDate;
    }


    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        if (start==null) throw new IllegalArgumentException("Please define stat time");
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        if (end==null) throw new IllegalArgumentException("Please define end time ");
        this.end = end;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
               if(organizer== null) throw  new IllegalArgumentException("Please enter an organizer");
                this.organizer = organizer;

    }

    public List<Person> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<Person> attendants) {
        this.attendants = attendants;
    }
    public void addAttendant( List Person)
    {

    }
    public int compareTo( int Meeting)
    {
return compareTo(Meeting);
    }
}
