package com.developer.taskmanagement.dto.request;

import java.io.Serializable;
import java.util.Date;

public class TaskRequest implements Serializable {
    private String name;
    private String taskName;
    private String gender;
    private String progress;
    private Date startDate;
    private Date dueDate;
    private String Comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String TaskName) {
        this.name = taskName;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return Comments;
    }

    public void setComments(String comments){this.Comments=comments;}


}

