package pl.damianradowiecki;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class KeyWithoutEqualsAndHashCodeTest {

    static class Key {
        private final int key;

        public Key(int key) {
            this.key = key;
        }
    }

    @Test
    public void test() {
        Map<Key, String> map = new HashMap<>();
        Key key1 = new Key(1);
        Key key2 = new Key(1);

        map.put(key1, "original value");
        map.put(key2, "overridden value");

        assertEquals("original value", map.get(key1));
        assertEquals("overridden value", map.get(key2));
    }
}
