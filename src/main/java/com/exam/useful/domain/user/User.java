package com.exam.useful.domain.user;

import com.exam.useful.usecase.user.ERole;
import lombok.Builder;
import lombok.Data;
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
    private ERole role;

    @Column(nullable = false)
    private Boolean useYn;

    @CreationTimestamp
    private LocalDateTime insertDate;
}
