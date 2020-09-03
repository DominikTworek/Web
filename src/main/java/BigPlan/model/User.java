package BigPlan.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(
                        name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = {@JoinColumn( name = "role_id", referencedColumnName = "id"),
                                     @JoinColumn(name = "detail_id", referencedColumnName = "id")})


    private Collection<Role> roles;
    private Collection<Detail> detail;

    public User(String email, String password, Collection<Role> roles, Collection<Detail> detail) {
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public Collection<Detail> getDetail() {
        return detail;
    }

    public void setDetail(Collection<Detail> detail) {
        this.detail = detail;
    }
}
