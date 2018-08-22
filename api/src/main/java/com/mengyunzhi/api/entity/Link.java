package com.mengyunzhi.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String linkName;
    @NotNull
    private String linkUrl;
    private String logoUrl = "images/default-link-logo.png";
    @ManyToMany
    private List<LinkType> linkTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public List<LinkType> getLinkTypes() {
        return linkTypes;
    }

    public void setLinkTypes(List<LinkType> linkTypes) {
        this.linkTypes = linkTypes;
    }
}
