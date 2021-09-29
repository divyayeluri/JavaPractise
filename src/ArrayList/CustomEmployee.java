package ArrayList;

import java.util.Objects;

public class CustomEmployee {
    private  String firstname;
    private  String lastname;
    private int id;

    public CustomEmployee(String firstname,String lastname,int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomEmployee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomEmployee that = (CustomEmployee) o;
        return id == that.id && firstname.equals(that.firstname) && lastname.equals(that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id);
    }
}
