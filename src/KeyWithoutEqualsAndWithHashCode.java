import java.util.HashMap;
import java.util.Map;

public class KeyWithoutEqualsAndWithHashCode {

    public static void main(String[] args) {

        Map<Key, String> map = new HashMap<>();
        Key key1 = new Key(1);
        Key key2 = new Key(1);

        map.put(key1, "original value");
        map.put(key2, "overridden value");

        System.out.println(map.get(key1));
        System.out.println(map.get(key2));
        
    }

    static class Key {
        private final int key;

        public Key(int key) {
            this.key = key;
        }

        @Override
        public int hashCode() {
            return key;
        }
    }
}
