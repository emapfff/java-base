package org.example.HW3;

import java.util.Collections;
import java.util.List;

public class Task5 {
    public static List<Contacts> parseContacts(List<Contacts> contacts, String order) {
        if (order.equals("ACS")) {
            Collections.sort(contacts);
        } else {
            contacts.sort(new DescContactComparator());
        }
        return contacts;
    }
}
