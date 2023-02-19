package sn.esmt.admin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "approles")

public class AppRoleEntity {

    @Id // JPA ID est cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //AUTO-INCREMENT
    private int id;

    @Column(length = 150,nullable = false)
    private String name;
}
