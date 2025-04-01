import java.util.HashSet;
import java.util.Set;

public class Salamander {
    private int age;
    private Set<Salamander> contacts;

    /**
     * Returns the age of the salamander.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns a copy of the set of contacts this salamander has.
     *
     * @return a new set containing the contacts
     */
    public Set<Salamander> getContacts() {
        return new HashSet<>(contacts);
    }

    /**
     * Adds a single salamander to this salamander's contacts.
     *
     * @param other the salamander to add as a contact
     */
    public void addContact(Salamander other) {
        contacts.add(other);
    }

    /**
     * Adds multiple salamanders to this salamander's contacts.
     *
     * @param others the set of salamanders to add as contacts
     */
    public void extendContacts(Set<Salamander> others) {
        contacts.addAll(others);
    }

    /**
     * Removes a salamander from this salamander's contacts.
     *
     * @param other the salamander to remove from contacts
     */
    public void removeContact(Salamander other) {
        contacts.remove(other);
    }

    /**
     * Creates a salamander with the specified age and contacts.
     *
     * @param age the age of the salamander
     * @param contacts the initial set of contacts
     */
    public Salamander(int age, Set<Salamander> contacts) {
        this.age = age;
        this.contacts = contacts;
    }

    /**
     * Creates a salamander with the specified age and no contacts.
     *
     * @param age the age of the salamander
     */
    public Salamander(int age) {
        this(age, new HashSet<>());
    }
}
