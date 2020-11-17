package com.codegym.models;

import javax.persistence.*;

@Entity
@Table(name = "userShare")
public class User_Share {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String idUser;
    private int coutShare;

    public User_Share() {
    }

    public User_Share(String name, String idUser, int coutShare) {
        this.name = name;
        this.idUser = idUser;
        this.coutShare = coutShare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getCoutShare() {
        return coutShare;
    }

    public void setCoutShare(int coutShare) {
        this.coutShare = coutShare;
    }
}
