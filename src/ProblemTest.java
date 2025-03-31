import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemTest {
    @Test
    void testCountSeriousInfections() {
        // Salamander sal = new Salamander(2);
        // Salamander sally = new Salamander(1);
        // Salamander samuel = new Salamander(5);
        // Salamander sammy = new Salamander(8);
        // Salamander sandy = new Salamander(9);
        // Salamander squiggles = new Salamander(5);
        // Salamander slippy = new Salamander(1);

        Salamander a = new Salamander(2);
        Salamander b = new Salamander(1);
        Salamander c = new Salamander(5);
        Salamander d = new Salamander(2);
        Salamander e = new Salamander(9);
        Salamander f = new Salamander(2);
        Salamander g = new Salamander(1);
        Salamander h = new Salamander(7);

        a.extendContacts(Set.of(b));
        b.extendContacts(Set.of(e, c));
        c.extendContacts(Set.of(f));
        d.extendContacts(Set.of(g));
        e.extendContacts(Set.of(a));
        f.extendContacts(Set.of());
        g.extendContacts(Set.of(c, d, f));

        int actual = Problem.countSeriousInfections(a);
        assertEquals(3, actual);

        actual = Problem.countSeriousInfections(b);
        assertEquals(3, actual);

        actual = Problem.countSeriousInfections(c);
        assertEquals(1, actual);

        actual = Problem.countSeriousInfections(d);
        assertEquals(3, actual);

        actual = Problem.countSeriousInfections(e);
        assertEquals(3, actual);

        actual = Problem.countSeriousInfections(f);
        assertEquals(1, actual);

        actual = Problem.countSeriousInfections(g);
        assertEquals(3, actual);

        actual = Problem.countSeriousInfections(h);
        assertEquals(0, actual);
    }
}
