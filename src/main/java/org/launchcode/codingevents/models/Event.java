package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message = "Location is required.")
    @NotNull(message = "Location must be given.")
    private String eventLocation;

    @AssertTrue(message = "All Events Need A Rainy Day Option!")
    private Boolean rainyDayOptions;

    @AssertTrue(message = "All Events Need Preregistration!")
    private Boolean preRegistrationRequired;

    @Size(min = 1, message = "There must be at least one attendee.")
    private String numberOfAttendees;

    private EventType type;

    public Event(String name, String description, String contactEmail, String eventLocation, Boolean rainyDayOptions,
                 Boolean preRegistrationRequired, String numberOfAttendees, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventLocation = eventLocation;
        this.rainyDayOptions = rainyDayOptions;
        this.preRegistrationRequired = preRegistrationRequired;
        this.numberOfAttendees = numberOfAttendees;
        this.type = type;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Boolean getPreRegistrationRequired() {
        return preRegistrationRequired;
    }

    public void setPreRegistrationRequired(Boolean preRegistrationRequired) {
        this.preRegistrationRequired = preRegistrationRequired;
    }

    public String getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(String numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Boolean getRainyDayOptions() {
        return rainyDayOptions;
    }

    public void setRainyDayOptions(Boolean rainyDayOptions) {
        this.rainyDayOptions = rainyDayOptions;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
