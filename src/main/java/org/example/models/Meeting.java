package org.example.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Meeting {
    private int id;
    private String topic;
    private LocalDate meetingDate;
    private LocalTime start;
    private LocalTime end;
    private Person organizer;
    private List<Person> attendants;
    public static int count = 1;
    private ArrayList<String> personItem = new ArrayList<String>();
    public void addAttendant(String person) {
        personItem.add(person);
    }

    public String removeAttendant(String person)
    {
        int position = personItem.indexOf(person);
        if (position >= 0) {
            String item = personItem.get(position);
            personItem.remove(item);
        }
        return  null;
    }

    public static int getCount(int count) {
        return count++;
    }

    public Meeting(int id, String topic, LocalDate meetingDate, LocalTime start, LocalTime end, Person organizer) {
        this.id = id;
        this.topic = topic;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if (topic == null) throw new IllegalArgumentException("Please enter a topic");
        this.topic = topic;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        if (meetingDate == null) throw new IllegalArgumentException("Please enter meeting date");
        this.meetingDate = meetingDate;
    }
    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        if (start == null) throw new IllegalArgumentException("Please define stat time");
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        if (end == null) throw new IllegalArgumentException("Please define end time ");
        this.end = end;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
        if (organizer == null) throw new IllegalArgumentException("Please enter an organizer");
        this.organizer = organizer;
    }

    public List<Person> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<Person> attendants) {
        if (attendants == null) throw new IllegalArgumentException("");
        this.attendants = attendants;

    }

    public void addAttendant(Person person) {
        if (attendants == null) attendants = new ArrayList();
        attendants.add(person);
    }

    public void removeAttend(List<Person> personList) {
        if (personList == null) throw new IllegalArgumentException();
        if (personList == null) personList = new ArrayList<>();
        personList.remove(personList);
    }

}
