package org.example;

/**
 * The Hotel class represents a hotel and provides methods to get and set its name, address, and website.
 * @author Julián Liberatore
 * @version 1.0.0
 * @since 1.0.0
 */
public class Hotel {

    /** The name of the hotel. */
    public String name;

    /** The address of the hotel. */
    public String address;

    /** The website URL of the hotel. */
    public String web;

    /**
     * Constructs a new Hotel object with the specified name, address, and website.
     *
     * @param name The name of the hotel.
     * @param address The address of the hotel.
     * @param web The website URL of the hotel.
     */
    public Hotel(String name, String address, String web) {
        this.name = name;
        this.address = address;
        this.web = web;
    }

    /**
     * Constructs a new Hotel object with no specified name, address, or website.
     */
    public Hotel() {
    }

    /**
     * Retrieves the name of the hotel.
     *
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the address of the hotel.
     *
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the hotel.
     *
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the website URL of the hotel.
     *
     * @return The website URL of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the website URL of the hotel.
     *
     * @param web The website URL to set.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Returns a string representation of the Hotel object.
     *
     * @return A string representation of the Hotel object, including its name, address, and website.
     */
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", web='" + web + '\'' +
                '}';
    }
}