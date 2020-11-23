package blog_iovasofta.entity;


import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "roles")
public class Role {
    private Integer id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Set<User> users;

    public Role() {
        this.users = new HashSet<>();
    }


    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() { return users; }


    @Transient
    public String getSimpleName(){
        return StringUtils.capitalize(this.getName().substring(5).toLowerCase());
    }
}
