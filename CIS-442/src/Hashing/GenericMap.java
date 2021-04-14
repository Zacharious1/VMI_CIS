package Hashing;

import java.util.Set;

public class GenericMap <KeyType, ValueType>{

    private QuadraticProbing items;

    public GenericMap() {

        items = new QuadraticProbing<>();
    }

    public void put(KeyType key, ValueType value) {
        Entry<KeyType, ValueType> entry = new Entry<>(key, value);

        items.insert(entry);
    }

    public ValueType get(KeyType key) {
        if (key == null) return null;
        int index = items.findPos(key);
        //Not sure what to do here to be honest sir.
        return null;
    }

    public boolean containKey(KeyType key) {
        return items.contains(key);
    }

    public Set<KeyType> keySet(){
        //Not sure what to do here either sir.
        return null;
    }

    private static class Entry<KeyType, ValueType>{

        private KeyType key;
        private ValueType value;

        public Entry(KeyType key, ValueType value) {

            this.key = key;
            this.value = value;
        }

        public KeyType getKey() {

            return key;
        }

        public ValueType getValue() {

            return value;
        }

        public void setValue(KeyType key, ValueType value) {

            this.key = key;
            this.value = value;
        }

        public int hashCode() {

            return key.hashCode() + value.hashCode();
        }
    }

    public static void main(String[] args) {
        GenericMap<Object, String> map = new GenericMap<Object, String>();
        map.put(11, "hello");

    }
}
