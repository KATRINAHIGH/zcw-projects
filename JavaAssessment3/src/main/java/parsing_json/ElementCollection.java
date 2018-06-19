package parsing_json;

import java.util.Collection;
import java.util.List;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ElementCollection implements Collection<Element>, List<Element> {

    private ArrayList<Element> backingArray;

    /**
     * json Deserialization
     * @param json
     * @return
     */
    public static ElementCollection fromJSONString(String json) {
        Gson gson = new Gson();
        Element[] elements = gson.fromJson(json, Element[].class);
        ElementCollection output = new ElementCollection();

        for (Element e : elements) {
            output.add(e);
        }

        return output;
    }

    public ElementCollection() {
        this.backingArray = new ArrayList<>();
    }


    /**
     * @param atomic_number
     * @return the Element with number atomicNumber
     */
    public Element findByAtomicNumber(int atomic_number) {
        while (this.iterator().hasNext()) {
            Element e = this.iterator().next();
            if (e.getNumber() == atomic_number) {
                return e;
            }
        }
        return null;
    }

    /**
     * @param name
     * @return return the Element with name name
     */
    public Element findByName(String name) {
        while (this.iterator().hasNext()) {
            Element e = this.iterator().next();
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Get an ElementCollection where all Elements have a property "fieldName" equal to "value"
     *
     * @param fieldName
     * @param value
     * @return
     */
    public ElementCollection where(String fieldName, Object value) {
        // where will take arguments String field and Object value. If Element has an attribute with the
//name field then the method will go through each Element in the collection and return a new ElementCollection
//with all Elements who's field matches the Object value. If no attribute is called field then the method
//should simply return an empty ElementCollection.
        return null;
    }


    //region COLLECTION INTERFACE: implement methods using backing array. Tried to extend array but wasn't working????
    @Override
    public boolean addAll(int index, Collection<? extends Element> c) {
        return this.backingArray.addAll(c);
    }

    @Override
    public Element get(int index) {
        return this.backingArray.get(index);
    }

    @Override
    public Element set(int index, Element element) {
        return this.backingArray.set(index, element);
    }

    @Override
    public int indexOf(Object o) {
        return this.backingArray.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.backingArray.lastIndexOf(o);
    }

    @Override
    public ListIterator<Element> listIterator() {
        return this.backingArray.listIterator();
    }

    @Override
    public ListIterator<Element> listIterator(int index) {
        return this.backingArray.listIterator(index);
    }

    @Override
    public List<Element> subList(int fromIndex, int toIndex) {
        return this.backingArray.subList(fromIndex, toIndex);
    }

    @Override
    public int size() {
        return this.backingArray.size();
    }

    @Override
    public boolean isEmpty() {
        return this.backingArray.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.backingArray.contains(o);
    }

    @Override
    public Iterator<Element> iterator() {
        return this.backingArray.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.toArray(new Element[0]);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.backingArray.toArray(a);
    }

    @Override
    public void add(int index, Element element) {
        this.backingArray.add(index, element);
    }

    @Override
    public boolean add(Element element) {
        return this.backingArray.add(element);
    }

    @Override
    public Element remove(int index) {
        return this.backingArray.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return this.backingArray.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.backingArray.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Element> c) {
        return this.backingArray.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.backingArray.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.backingArray.retainAll(c);
    }

    @Override
    public void clear() {
        this.backingArray.clear();

    }
    //endregion
}
















