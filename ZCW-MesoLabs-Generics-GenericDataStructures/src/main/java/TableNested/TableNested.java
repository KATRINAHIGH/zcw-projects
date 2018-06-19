package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    private ArrayList<Entry<K, V>> entries;


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


    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);
                break;
            }
        }
    }

}

