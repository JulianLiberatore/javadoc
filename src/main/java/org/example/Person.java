package org.example;

/**
 * The Person class represents a person and provides methods to get and set their name and identifier.
 * @author Julián Liberatore
 * @version 1.0.0
 * @since 1.0.0
 */
public class Person {

    /** The name of the person. */
    public String name;

    /** The identifier of the person. */
    public String identifier;

    /**
     * Constructs a new Person object with the specified name and identifier.
     *
     * @param name The name of the person.
     * @param identifier The identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Constructs a new Person object with no specified name or identifier.
     */
    public Person() {
    }

    /**
     * Retrieves the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the identifier of the person.
     *
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     *
     * @param identifier The identifier to set.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return A string representation of the Person object, including its name and identifier.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", identifier=" + identifier + "]";
    }
}