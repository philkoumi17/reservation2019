package be.icc.reservation.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Artists {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "artiste_type",
            joinColumns = {@JoinColumn(name = "artist_id")},
            inverseJoinColumns = {@JoinColumn(name = "type_id")}
    )
    private Set<Types> types;

    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Set<Types> getTypes() {
        return types;
    }

    public void setTypes(Set<Types> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artists artists = (Artists) o;
        return id == artists.id &&
                Objects.equals(firstname, artists.firstname) &&
                Objects.equals(lastname, artists.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
