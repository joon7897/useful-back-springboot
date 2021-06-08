package com.exam.useful.domain.user.model;

import com.exam.useful.domain.user.assets.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name="tb_user", uniqueConstraints = {@UniqueConstraint(name = "NAME_EMAIL_UNIQUE", columnNames = {"USERNAME", "EMAIL"})})
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private String id;

    @Column(nullable = false)
    @NotBlank
    @Length(min = 4)
    private String password;

    @Column(nullable = false)
    @NotBlank
    @Length(min = 4)
    private String userName;

    @Column(nullable = false)
    @NotBlank
    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private boolean useYn;

    private User(String id, String password, String userName, String email, Role role, boolean useYn) {
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.useYn = useYn;
    }

    public static User createUser(String id, String password, String userName, String email, Role role, boolean useYn) {
        return new User(id, password, userName, email, role, useYn);
    }
}
