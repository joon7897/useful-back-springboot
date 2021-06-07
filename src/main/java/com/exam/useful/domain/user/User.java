package com.exam.useful.domain.user;

import com.exam.useful.service.user.ERole;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@Table(name="tb_user", uniqueConstraints = {@UniqueConstraint(name = "NAME_EMAIL_UNIQUE", columnNames = {"USERNAME", "EMAIL"})})
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private String id;

    @Column(nullable = false)
    @NotBlank
    @Length(min = 4)
    private String password;

    @Transient // DB에 반영되지 않고 Object에서만 관리하도록 설정
    @NotBlank
    private String confirmPassword;

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


    @Builder
    public User(String password, String userName, String email, ERole role, Boolean useYn) {
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.useYn = useYn;
    }
}
