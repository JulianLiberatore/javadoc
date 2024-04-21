package org.example;

import java.util.Date;

/**
 * The Manager class represents a manager and provides methods to get and set their start date and experience.
 * @author Julián Liberatore
 * @version 1.0.0
 * @since 1.0.0
 */
public class Manager {

    /** The start date of the manager. */
    public Date startDate;

    /** The experience of the manager in years. */
    public int experience;

    /**
     * Constructs a new Manager object with the specified start date and experience.
     *
     * @param startDate The start date of the manager.
     * @param experience The experience of the manager in years.
     */
    public Manager(Date startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }

    /**
     * Constructs a new Manager object with no specified start date or experience.
     */
    public Manager() {
    }

    /**
     * Retrieves the start date of the manager.
     *
     * @return The start date of the manager.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the manager.
     *
     * @param startDate The start date to set.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Retrieves the experience of the manager.
     *
     * @return The experience of the manager in years.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the experience of the manager.
     *
     * @param experience The experience to set.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Returns a string representation of the Manager object.
     *
     * @return A string representation of the Manager object, including its start date and experience.
     */
    @Override
    public String toString() {
        return "Manager [startDate=" + startDate + ", experience=" + experience + "]";
    }
}