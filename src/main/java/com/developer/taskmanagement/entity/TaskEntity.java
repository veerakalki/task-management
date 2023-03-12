package com.developer.taskmanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mt_task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    private Long id;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "taskName")
    private String taskName;


    @Column(name = "status")
    private String status;

    @Column(name = "start_Date")
    private Date startDate;

    @Column(name = "due_Date")
    private Date dueDate;

    @Column(name = "comments")
    private String comments;

    public TaskEntity() {
    }

    public TaskEntity(Long taskId, String assignee, String taskName, String status, Date startDate, Date dueDate, String comments) {
        this.id = taskId ;
        this.assignee = assignee;
        this.taskName = taskName;
        this.status = status;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}