package be.lesgoblins.backend.user.entity;

import be.lesgoblins.yggdrasil.common.persistance.entity.HistoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "YGGDRASIL_USER")
@Table(name = "YGGDRASIL_USER", schema =  "AUTHENTIFICATION" ,
        indexes = @Index(name = "IDX_YGGDRASIL_USER_USERNAME_SECRET" , columnList = "username,secret"))
@Getter
@Setter
public class YggdrasilUser extends HistoryEntity {


    @SequenceGenerator(name="yggdrasil-user-seq",
            schema = "AUTHENTIFICATION",
            sequenceName="yggdrasil-user-seq",
            allocationSize=1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="yggdrasil-user-seq" )
    private Long id;

    @Column(name="USERNAME" ,length = 50 , nullable = false , unique = true)
    private String username;
    @Column(name="SECRET",length = 255 , nullable = false)
    private String secret;
    @Column(name="EMAIL",length = 50)
    private String email;

    @ManyToMany()
    @JoinTable(
            schema = "AUTHENTIFICATION",
            name = "YGGDRASIL_USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<YggdrasilRole> roles;

}
