import java.util.HashSet;
import java.util.Set;

public class Salamander {
    private int age;
    private Set<Salamander> contacts;

    public int getAge() {
        return age;
    }

    public Set<Salamander> getContacts() {
        return new HashSet<>(contacts);
    }

    public void addContact(Salamander other) {
        contacts.add(other);
    }

    public void extendContacts(Set<Salamander> others) {
        contacts.addAll(others);
    }

    public void removeContact(Salamander other) {
        contacts.remove(other);
    }

    public Salamander(int age, Set<Salamander> contacts) {
        this.age = age;
        this.contacts = contacts;
    }

    public Salamander(int age) {
        this(age, new HashSet<>());
    }
}