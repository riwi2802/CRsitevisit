package com.conrail.SiteVisit.models;


//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import java.sql.Date;
import java.util.Objects;

//@Entity
public class SiteVisit {

//    @Id
//    @GeneratedValue
//    private int id;

    private int id;
    private static int nextId = 1;

    private String date;
    private String department;
    private String location;
    private String subLocation;

    private boolean hardware;
    private boolean software;
    private boolean security;
    private boolean generalMaintenance;

    private String modNum;
    private String room;
    private String description;
    private String comments;
    private String action;

    public SiteVisit(String date, String department, String location, String subLocation, boolean hardware,
                     boolean software, boolean security, boolean generalMaintenance, String modNum, String room,
                     String description, String comments, String action) {
        this.id = nextId;
        this.date = date;
        this.department = department;
        this.location = location;
        this.subLocation = subLocation;
        this.hardware = hardware;
        this.software = software;
        this.security = security;
        this.generalMaintenance = generalMaintenance;
        this.modNum = modNum;
        this.room = room;
        this.description = description;
        this.comments = comments;
        this.action = action;
        nextId++;
    }

/*
    public SiteVisit() {}
*/

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubLocation() {
        return subLocation;
    }

    public void setSubLocation(String subLocation) {
        this.subLocation = subLocation;
    }

    public boolean isHardware() {
        return hardware;
    }

    public void setHardware(boolean hardware) {
        this.hardware = hardware;
    }

    public boolean isSoftware() {
        return software;
    }

    public void setSoftware(boolean software) {
        this.software = software;
    }

    public boolean isSecurity() {
        return security;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }

    public boolean isGeneralMaintenance() {
        return generalMaintenance;
    }

    public void setGeneralMaintenance(boolean generalMaintenance) {
        this.generalMaintenance = generalMaintenance;
    }

    public String getModNum() {
        return modNum;
    }

    public void setModNum(String modNum) {
        this.modNum = modNum;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SiteVisit siteVisit = (SiteVisit) o;
        return id == siteVisit.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SiteVisit{" +
                "id=" + id +
                ", date=" + date +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                ", subLocation='" + subLocation + '\'' +
                ", hardware=" + hardware +
                ", software=" + software +
                ", security=" + security +
                ", generalMaintenance=" + generalMaintenance +
                ", modNum='" + modNum + '\'' +
                ", room='" + room + '\'' +
                ", description='" + description + '\'' +
                ", comments='" + comments + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
