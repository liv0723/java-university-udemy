package udemy.university.section15.fit_zone.domain;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {
    private int id;
    private String name;
    private String lastname;
    private int membreship;

    public Client() {

    }

    public Client(int id) {
        this.id = id;
    }

    public Client(String name, String lastname, int membreship) {
        this.name = name;
        this.lastname = lastname;
        this.membreship = membreship;
    }

    public Client(int id, String name, String lastname, int membreship) {
        this(name, lastname, membreship);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMembreship() {
        return membreship;
    }

    public void setMembreship(int membreship) {
        this.membreship = membreship;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", membreship=" + membreship +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return getId() == client.getId() && getMembreship() == client.getMembreship() && Objects.equals(getName(), client.getName()) && Objects.equals(getLastname(), client.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastname(), getMembreship());
    }
}
