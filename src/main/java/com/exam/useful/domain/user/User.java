package com.exam.useful.domain.user;

import com.exam.useful.domain.user.dto.UserUpdateDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="tb_user")
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime insertDate;

    @Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime modifyDate;

    @Builder
    public User(String email, String password, String name, String nickName, String birthday, String gender, String phone) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }

    public void update(String password, String name, String nickName, String birthday, String gender, String phone) {
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }

    public void update(UserUpdateDto dto) {
        this.password = dto.getPassword();
        this.name = dto.getName();
        this.nickName = dto.getNickName();
        this.birthday = dto.getBirthday();
        this.gender = dto.getGender();
        this.phone = dto.getPhone();
    }
}
