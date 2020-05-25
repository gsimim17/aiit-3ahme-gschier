package ue03_objects;

import java.util.Objects;

public class Person implements Cloneable {
    private final String firstname;
    private final String surname;

    public Person(String firstname, String surname) {
        if (firstname == null || firstname.isBlank()) {
            throw new IllegalArgumentException("invalid firstname");
        }
        
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("invalid surname");
        }
        
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return firstname + " " + surname;
    }

    @Override
    protected Person clone() {
        try {
            // return new Person(firstname, surname);
            return (Person)super.clone(); //To change body of generated methods, choose Tools | Templates.
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Person other = (Person)obj;
        
        if (!Objects.equals(firstname, other.firstname)) {
            return false;
        }
        
        if (!Objects.equals(surname, other.surname)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hc = firstname.hashCode();
        hc = hc * 59 + surname.hashCode();
        
        return hc;
    }
}
