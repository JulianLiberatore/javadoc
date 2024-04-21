package org.example;

/**
 * The Guest class represents a guest and provides methods to get and set their nationality.
 * @author Julián Liberatore
 * @version 1.0.0
 * @since 1.0.0
 */
public class Guest {

    /** The nationality of the guest. */
    public String nationality;

    /**
     * Constructs a new Guest object with no specified nationality.
     */
    public Guest() {

    }

    /**
     * Retrieves the nationality of the guest.
     *
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     *
     * @param nationality The nationality to set.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
