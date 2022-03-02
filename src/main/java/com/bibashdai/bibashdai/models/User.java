package com.bibashdai.bibashdai.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer userId ;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
//    @OneToMany(targetEntity = Blog.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "ub_fk",referencedColumnName = "userId")
//    private List<Blog> blogs;

}
