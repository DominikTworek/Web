package BigPlan.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String email;
    @NonNull
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(
                        name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = {@JoinColumn( name = "role_id", referencedColumnName = "id"),
                                     @JoinColumn(name = "detail_id", referencedColumnName = "id")})

    @NonNull
    private Collection<Role> roles;
    @NonNull
    private Collection<Detail> detail;
}
