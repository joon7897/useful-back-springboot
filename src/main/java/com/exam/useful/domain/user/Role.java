package com.exam.useful.domain.user;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    @Column(unique = true)
    private String role;
}
