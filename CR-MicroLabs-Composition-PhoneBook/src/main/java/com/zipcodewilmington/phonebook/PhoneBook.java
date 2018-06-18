package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.Arrays;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    //Map<String, List<String>> map = new HashMap<String, List<String>>();
    private Map<String, List<String>> phoneRecord;

    public PhoneBook() {
        phoneRecord = new TreeMap<String, List<String>>();
    }

    /**
     * adds a name and corresponding phone number to phone book
     *
     * @param name
     * @param number
     */
    public Boolean addNameAndNumber(String name, String number) {
        if (phoneRecord.containsKey(name)) {
            phoneRecord.get(name).add(number);
            return true;
        }
        List<String> newNumber = new ArrayList<String>();
        newNumber.add(number);
        phoneRecord.put(name, newNumber);
        return true;
    }

    /**
     * uses name to retrieve and delete both name and phone number
     *
     * @param name
     */
    public boolean deleteNameAndNumber(String name) {
        return phoneRecord.remove(name) != null;
    }


    /**
     * retrieves phone number by name
     *
     * @param name
     */
    public String retrieveNumbersByName(String name) {
        return join(phoneRecord.get(name));
    }

    /**
     * retrieves name by phone number
     *
     * @param number
     */
    public String retrieveNameByNumber(String number) {
        for (String nameKey : phoneRecord.keySet()) {
            List<String> numForName = phoneRecord.get(nameKey);
            if(numForName.contains(number)){
                return nameKey;
            }
        }
        return "";
    }

    /**
     * returns alphabetical list of all names in phoneBook
     */
    public String listAllNames() {
        StringBuilder list = new StringBuilder();
        Formatter prettyListNames = new Formatter(list);
        for (String nameKey : phoneRecord.keySet()) {
            prettyListNames.format("Name: %s%n", nameKey);
        }
        return list.toString();
    }

    /**
     * returns alphabetical list of all records in phoneBook
     */
    public String listAllNamesAndNumbers() {
        StringBuilder list = new StringBuilder();
        Formatter prettyList = new Formatter(list);
        for (String nameKey : phoneRecord.keySet()) {
            prettyList.format("Name: %s PhoneNumber: %-10s%n", nameKey, join(phoneRecord.get(nameKey)));
        }
        return list.toString();
    }

    /**
     * joins a list by a delimiter
     * @param listNum
     * @return String
     */
    public static String join(List<String> listNum){

        if(listNum.size() == 1){
            return listNum.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < listNum.size(); i++)
        {
            sb.append(listNum.get(i));
            if (i < listNum.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        PhoneBook lancasterPeople = new PhoneBook();
        lancasterPeople.addNameAndNumber("Sally", "7173419899");
        lancasterPeople.addNameAndNumber("Zach", "7173413244");
        lancasterPeople.addNameAndNumber("Adam", "7173419675");
        lancasterPeople.addNameAndNumber("Chance", "555");
        lancasterPeople.addNameAndNumber("Wally", "8906786");
        lancasterPeople.addNameAndNumber("Wally", "3456789");
        lancasterPeople.addNameAndNumber("Wally", "89665");


        String x = lancasterPeople.listAllNamesAndNumbers();
        System.out.println(x);

        String y = lancasterPeople.listAllNames();
        System.out.println(y);


    }

}


