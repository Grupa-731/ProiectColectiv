package com.example.proiectcolectiv;

import javax.persistence.*;

@Entity
@Table(name = "peg")
public class Peg {
    @Id
    @Column(name = "peg_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "peg_status_completed")
    private Boolean pegStatusCompleted;

    @Column(name = "peg_status_pending")
    private Boolean pegStatusPending;

    @Column(name = "peg_status_requested")
    private Boolean pegStatusRequested;

    @Column(name = "project_info", length = 50)
    private String projectInfo;

    @Column(name = "manager", length = 50)
    private String manager;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    public Boolean getPegStatusRequested() {
        return pegStatusRequested;
    }

    public void setPegStatusRequested(Boolean pegStatusRequested) {
        this.pegStatusRequested = pegStatusRequested;
    }

    public Boolean getPegStatusPending() {
        return pegStatusPending;
    }

    public void setPegStatusPending(Boolean pegStatusPending) {
        this.pegStatusPending = pegStatusPending;
    }

    public Boolean getPegStatusCompleted() {
        return pegStatusCompleted;
    }

    public void setPegStatusCompleted(Boolean pegStatusCompleted) {
        this.pegStatusCompleted = pegStatusCompleted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}