package org.example.HW3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {

    @Test
    void test1() {
        List<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("John Locke"));
        contacts.add(new Contacts("Thomas Aquinas"));
        contacts.add(new Contacts("David Hume"));
        contacts.add(new Contacts("Rene Descartes"));
        List<Contacts> expected = Arrays.asList(new Contacts("Thomas Aquinas"),
                new Contacts("Rene Descartes"), new Contacts("David Hume"),
                new Contacts("John Locke"));

        List<Contacts> ans = Task5.parseContacts(contacts, "ACS");
        for (int i = 0; i < ans.size(); i++) {
            assertEquals(ans.get(i).getName(), expected.get(i).getName());
            assertEquals(ans.get(i).getSurname(), expected.get(i).getSurname());
        }
    }

    @Test
    void test2() {
        List<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Paul Erdos"));
        contacts.add(new Contacts("Leonhard Euler"));
        contacts.add(new Contacts("Carl Gauss"));

        List<Contacts> ans = Task5.parseContacts(contacts, "DESC");
        List<Contacts> expected = Arrays.asList(new Contacts("Carl Gauss"), new Contacts("Leonhard Euler"),
                new Contacts("Paul Erdos"));
        for (int i = 0; i < ans.size(); i++) {
            assertEquals(ans.get(i).getName(), expected.get(i).getName());
            assertEquals(ans.get(i).getSurname(), expected.get(i).getSurname());
        }
    }

    @Test
    void test3() {
        List<Contacts> contacts = new ArrayList<>();

        List<Contacts> ans = Task5.parseContacts(contacts, "DESC");
        assertEquals(ans.size(), 0);
    }

    @Test
    void test4() {
        List<Contacts> ans = Task5.parseContacts(null, "DESC");

    }
}