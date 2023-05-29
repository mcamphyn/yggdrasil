package be.lesgoblins.backend.user.entity;

import be.lesgoblins.yggdrasil.common.persistance.entity.HistoryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity(name = "YGGDRASIL_ROLE")
@Table(schema = "AUTHENTIFICATION",name="YGGDRASIL_ROLE")
public class YggdrasilRole extends HistoryEntity {
    @SequenceGenerator(name="yggdrasil-role-seq",
            schema = "AUTHENTIFICATION",
            sequenceName="yggdrasil-role-seq",
            allocationSize=1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="yggdrasil-role-seq" )
    private Long id;
    @Column(name="DESCRIPTION" ,length = 255 , nullable = false , unique = true)
    private String description;
    @Column(name="NAME" ,length = 255 , nullable = false , unique = true)
    private String name;


    @ManyToMany(mappedBy = "roles")
    private Set<YggdrasilUser> users;


}
