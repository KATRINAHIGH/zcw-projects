package ArrayListCombiner;

import Employee.Employee;
import Employee.Manager;
import org.junit.Test;

import org.junit.Assert;

import java.util.ArrayList;

public class ArrayListCombinerTest {
    Employee foo = new Employee("FOO", 100);
    Manager bar = new Manager("BAR", 100);
    @Test
    public void testExtendCombiner() throws Exception {
        // Given an array list with employees
        ArrayList<Employee> first = new ArrayList<>();
        first.add(foo);
        // An an array list with managers
        ArrayList<Manager> second = new ArrayList<>();
        second.add(bar);
        // When  I combine them
        ArrayListCombiner.extendCombiner(first, second);
        // Then I should get an arrayList with both
        ArrayList<Employee> expected = new ArrayList<>();
        expected.add(foo);
        expected.add(bar);
        Assert.assertEquals(expected, first);
    }

    @Test
    public void testSuperCombiner() throws Exception {
        // Given an array list with employees
        ArrayList<Employee> first = new ArrayList<>();
        first.add(foo);
        // An an array list with managers
        ArrayList<Manager> second = new ArrayList<>();
        second.add(bar);
        // When  I combine them
        ArrayListCombiner.superCombiner(first, second);
        // Then I should get an arrayList with both
        ArrayList<Employee> expected = new ArrayList<>();
        expected.add(foo);
        expected.add(bar);
        Assert.assertEquals(expected, first);
    }

}