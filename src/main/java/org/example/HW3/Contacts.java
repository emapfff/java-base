package org.example.HW3;


import org.jetbrains.annotations.NotNull;

public class Contacts implements Comparable<Contacts> {
    private final String name;
    private String surname = null;

    public Contacts(String inputName) {
        String[] nameSurname = inputName.split(" ");
        this.name = nameSurname[0];
        if (!nameSurname[1].isEmpty()) {
            this.surname = nameSurname[1];
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public int compareTo(@NotNull Contacts o) {
        if (this.surname.equals(o.surname)) {
            return this.name.compareTo(o.name);
        } else {
            return this.surname.compareTo(o.surname);
        }
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
