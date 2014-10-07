
package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection collection;

    @Before
    public void before() {
        collection = new DecimalCollection();
        collection.add(1d);
        collection.add(2d);
        collection.add(3d);
    }

    @Test
    public void testDecimalCollection() {

        double elemento1 = collection.getCollection().get(0);
        double elemento2 = collection.getCollection().get(1);
        double elemento3 = collection.getCollection().get(2);
        assertEquals(1d, elemento1, 0.001);
        assertEquals(2d, elemento2, 0.001);
        assertEquals(3d, elemento3, 0.001);

    }

    @Test
    public void testSize() {
        assertEquals(3, collection.size(), 0.001);
    }

    @Test
    public void testSum() {
        // TODO
        double suma = collection.sum();
        assertEquals(6d, suma, 0.001);

    }

    @Test
    public void testHigher() {

        double higher = collection.higher();
        assertEquals(3d, higher, 0.001);

    }

    @Test
    public void multiplicaTest() {
        assertEquals(6d, collection.multiplica(), 10e-5);
    }
}

