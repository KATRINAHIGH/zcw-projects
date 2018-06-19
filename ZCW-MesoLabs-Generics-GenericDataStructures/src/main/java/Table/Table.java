package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.
 * It needs a get method that takes a key and returns its corresponding value,
 * or null of the key is not in the arraylist.
 * It needs a put method that takes a key and value and makes an entry with key, value.
 * NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    //private ArrayList entries;
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        this.entries = new ArrayList<>();
    }

    /*
    takes a key and returns either the entry from the arraylist with that key or null if none is found
     */
    public V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    /*
    put takes a key value and sets the value in the Arraylist with that key or null if none is found
    note keys are unique
     */
    public void put(K key, V value) {
        //check to see if key exists, if so replace value, if not add both key and value
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);
                entries.add(new Entry<>(key, value));
                break;
            }
        }
        entries.add(new Entry<>(key, value));
    }


    /*
    remove which takes a key and removes it from the arraylist if its in there. Its a void method no return type
     */
    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);
                break;
            }

        }

    }
}


