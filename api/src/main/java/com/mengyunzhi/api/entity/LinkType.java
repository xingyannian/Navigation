package com.mengyunzhi.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
@Entity
public class LinkType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private Boolean isCommom = false;
    @ManyToOne
    private User user;
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

    public Boolean getCommom() {
        return isCommom;
    }

    public void setCommom(Boolean commom) {
        isCommom = commom;
    }
}
