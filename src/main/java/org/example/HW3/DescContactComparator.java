package org.example.HW3;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class DescContactComparator implements Comparator<Contacts> {
    @Override
    public int compare(@NotNull Contacts o1, Contacts o2) {
        if (o1.getSurname().equals(o2.getSurname())) {
            return o2.getName().compareTo(o1.getName());
        } else {
            return o2.getSurname().compareTo(o1.getSurname());
        }
    }
}
