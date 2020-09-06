package BigPlan.model;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "detail")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "first_name")
    private String firstName;
    
    @NonNull
    @Column(name = "last_name")
    private String lastName;
    
    @NonNull
    private Long phone;
}
