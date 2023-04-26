package com.SignupFormJenkins.Entity;

import javax.persistence.*;

@Entity
public class Employe {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
                @Column
       int id;
@Column
    String name;
@Column
    String password;
@Column
    int emplId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employe() {
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", emplId=" + emplId +
                '}';
    }

    public Employe(int id, String name, String password, int emplId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.emplId = emplId;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }
}
