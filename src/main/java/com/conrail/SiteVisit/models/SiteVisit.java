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

    private String modNum1;
    private String room1;
    private String description1;
    private String comments1;
    private String action1;

    private String modNum2;
    private String room2;
    private String description2;
    private String comments2;
    private String action2;

    private String modNum3;
    private String room3;
    private String description3;
    private String comments3;
    private String action3;

    private String modNum4;
    private String room4;
    private String description4;
    private String comments4;
    private String action4;

    private String modNum5;
    private String room5;
    private String description5;
    private String comments5;
    private String action5;

    private String modNum6;
    private String room6;
    private String description6;
    private String comments6;
    private String action6;

    private String modNum7;
    private String room7;
    private String description7;
    private String comments7;
    private String action7;

    private String modNum8;
    private String room8;
    private String description8;
    private String comments8;
    private String action8;

    private String modNum9;
    private String room9;
    private String description9;
    private String comments9;
    private String action9;

    private String modNum10;
    private String room10;
    private String description10;
    private String comments10;
    private String action10;

    private String modNum11;
    private String room11;
    private String description11;
    private String comments11;
    private String action11;

    private String modNum12;
    private String room12;
    private String description12;
    private String comments12;
    private String action12;

    private String modNum13;
    private String room13;
    private String description13;
    private String comments13;
    private String action13;

    private String modNum14;
    private String room14;
    private String description14;
    private String comments14;
    private String action14;

    public SiteVisit(String date, String department, String location, String subLocation, boolean hardware, boolean software, boolean security, boolean generalMaintenance, String modNum, String room, String description, String comments, String action, String modNum1, String room1, String description1, String comments1, String action1, String modNum2, String room2, String description2, String comments2, String action2, String modNum3, String room3, String description3, String comments3, String action3, String modNum4, String room4, String description4, String comments4, String action4, String modNum5, String room5, String description5, String comments5, String action5, String modNum6, String room6, String description6, String comments6, String action6, String modNum7, String room7, String description7, String comments7, String action7, String modNum8, String room8, String description8, String comments8, String action8, String modNum9, String room9, String description9, String comments9, String action9, String modNum10, String room10, String description10, String comments10, String action10, String modNum11, String room11, String description11, String comments11, String action11, String modNum12, String room12, String description12, String comments12, String action12, String modNum13, String room13, String description13, String comments13, String action13, String modNum14, String room14, String description14, String comments14, String action14) {
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
        this.modNum1 = modNum1;
        this.room1 = room1;
        this.description1 = description1;
        this.comments1 = comments1;
        this.action1 = action1;
        this.modNum2 = modNum2;
        this.room2 = room2;
        this.description2 = description2;
        this.comments2 = comments2;
        this.action2 = action2;
        this.modNum3 = modNum3;
        this.room3 = room3;
        this.description3 = description3;
        this.comments3 = comments3;
        this.action3 = action3;
        this.modNum4 = modNum4;
        this.room4 = room4;
        this.description4 = description4;
        this.comments4 = comments4;
        this.action4 = action4;
        this.modNum5 = modNum5;
        this.room5 = room5;
        this.description5 = description5;
        this.comments5 = comments5;
        this.action5 = action5;
        this.modNum6 = modNum6;
        this.room6 = room6;
        this.description6 = description6;
        this.comments6 = comments6;
        this.action6 = action6;
        this.modNum7 = modNum7;
        this.room7 = room7;
        this.description7 = description7;
        this.comments7 = comments7;
        this.action7 = action7;
        this.modNum8 = modNum8;
        this.room8 = room8;
        this.description8 = description8;
        this.comments8 = comments8;
        this.action8 = action8;
        this.modNum9 = modNum9;
        this.room9 = room9;
        this.description9 = description9;
        this.comments9 = comments9;
        this.action9 = action9;
        this.modNum10 = modNum10;
        this.room10 = room10;
        this.description10 = description10;
        this.comments10 = comments10;
        this.action10 = action10;
        this.modNum11 = modNum11;
        this.room11 = room11;
        this.description11 = description11;
        this.comments11 = comments11;
        this.action11 = action11;
        this.modNum12 = modNum12;
        this.room12 = room12;
        this.description12 = description12;
        this.comments12 = comments12;
        this.action12 = action12;
        this.modNum13 = modNum13;
        this.room13 = room13;
        this.description13 = description13;
        this.comments13 = comments13;
        this.action13 = action13;
        this.modNum14 = modNum14;
        this.room14 = room14;
        this.description14 = description14;
        this.comments14 = comments14;
        this.action14 = action14;
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

    public String getModNum1() {
        return modNum1;
    }

    public void setModNum1(String modNum1) {
        this.modNum1 = modNum1;
    }

    public String getRoom1() {
        return room1;
    }

    public void setRoom1(String room1) {
        this.room1 = room1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getComments1() {
        return comments1;
    }

    public void setComments1(String comments1) {
        this.comments1 = comments1;
    }

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getModNum2() {
        return modNum2;
    }

    public void setModNum2(String modNum2) {
        this.modNum2 = modNum2;
    }

    public String getRoom2() {
        return room2;
    }

    public void setRoom2(String room2) {
        this.room2 = room2;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getComments2() {
        return comments2;
    }

    public void setComments2(String comments2) {
        this.comments2 = comments2;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getModNum3() {
        return modNum3;
    }

    public void setModNum3(String modNum3) {
        this.modNum3 = modNum3;
    }

    public String getRoom3() {
        return room3;
    }

    public void setRoom3(String room3) {
        this.room3 = room3;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getComments3() {
        return comments3;
    }

    public void setComments3(String comments3) {
        this.comments3 = comments3;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getModNum4() {
        return modNum4;
    }

    public void setModNum4(String modNum4) {
        this.modNum4 = modNum4;
    }

    public String getRoom4() {
        return room4;
    }

    public void setRoom4(String room4) {
        this.room4 = room4;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getComments4() {
        return comments4;
    }

    public void setComments4(String comments4) {
        this.comments4 = comments4;
    }

    public String getAction4() {
        return action4;
    }

    public void setAction4(String action4) {
        this.action4 = action4;
    }

    public String getModNum5() {
        return modNum5;
    }

    public void setModNum5(String modNum5) {
        this.modNum5 = modNum5;
    }

    public String getRoom5() {
        return room5;
    }

    public void setRoom5(String room5) {
        this.room5 = room5;
    }

    public String getDescription5() {
        return description5;
    }

    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    public String getComments5() {
        return comments5;
    }

    public void setComments5(String comments5) {
        this.comments5 = comments5;
    }

    public String getAction5() {
        return action5;
    }

    public void setAction5(String action5) {
        this.action5 = action5;
    }

    public String getModNum6() {
        return modNum6;
    }

    public void setModNum6(String modNum6) {
        this.modNum6 = modNum6;
    }

    public String getRoom6() {
        return room6;
    }

    public void setRoom6(String room6) {
        this.room6 = room6;
    }

    public String getDescription6() {
        return description6;
    }

    public void setDescription6(String description6) {
        this.description6 = description6;
    }

    public String getComments6() {
        return comments6;
    }

    public void setComments6(String comments6) {
        this.comments6 = comments6;
    }

    public String getAction6() {
        return action6;
    }

    public void setAction6(String action6) {
        this.action6 = action6;
    }

    public String getModNum7() {
        return modNum7;
    }

    public void setModNum7(String modNum7) {
        this.modNum7 = modNum7;
    }

    public String getRoom7() {
        return room7;
    }

    public void setRoom7(String room7) {
        this.room7 = room7;
    }

    public String getDescription7() {
        return description7;
    }

    public void setDescription7(String description7) {
        this.description7 = description7;
    }

    public String getComments7() {
        return comments7;
    }

    public void setComments7(String comments7) {
        this.comments7 = comments7;
    }

    public String getAction7() {
        return action7;
    }

    public void setAction7(String action7) {
        this.action7 = action7;
    }

    public String getModNum8() {
        return modNum8;
    }

    public void setModNum8(String modNum8) {
        this.modNum8 = modNum8;
    }

    public String getRoom8() {
        return room8;
    }

    public void setRoom8(String room8) {
        this.room8 = room8;
    }

    public String getDescription8() {
        return description8;
    }

    public void setDescription8(String description8) {
        this.description8 = description8;
    }

    public String getComments8() {
        return comments8;
    }

    public void setComments8(String comments8) {
        this.comments8 = comments8;
    }

    public String getAction8() {
        return action8;
    }

    public void setAction8(String action8) {
        this.action8 = action8;
    }

    public String getModNum9() {
        return modNum9;
    }

    public void setModNum9(String modNum9) {
        this.modNum9 = modNum9;
    }

    public String getRoom9() {
        return room9;
    }

    public void setRoom9(String room9) {
        this.room9 = room9;
    }

    public String getDescription9() {
        return description9;
    }

    public void setDescription9(String description9) {
        this.description9 = description9;
    }

    public String getComments9() {
        return comments9;
    }

    public void setComments9(String comments9) {
        this.comments9 = comments9;
    }

    public String getAction9() {
        return action9;
    }

    public void setAction9(String action9) {
        this.action9 = action9;
    }

    public String getModNum10() {
        return modNum10;
    }

    public void setModNum10(String modNum10) {
        this.modNum10 = modNum10;
    }

    public String getRoom10() {
        return room10;
    }

    public void setRoom10(String room10) {
        this.room10 = room10;
    }

    public String getDescription10() {
        return description10;
    }

    public void setDescription10(String description10) {
        this.description10 = description10;
    }

    public String getComments10() {
        return comments10;
    }

    public void setComments10(String comments10) {
        this.comments10 = comments10;
    }

    public String getAction10() {
        return action10;
    }

    public void setAction10(String action10) {
        this.action10 = action10;
    }

    public String getModNum11() {
        return modNum11;
    }

    public void setModNum11(String modNum11) {
        this.modNum11 = modNum11;
    }

    public String getRoom11() {
        return room11;
    }

    public void setRoom11(String room11) {
        this.room11 = room11;
    }

    public String getDescription11() {
        return description11;
    }

    public void setDescription11(String description11) {
        this.description11 = description11;
    }

    public String getComments11() {
        return comments11;
    }

    public void setComments11(String comments11) {
        this.comments11 = comments11;
    }

    public String getAction11() {
        return action11;
    }

    public void setAction11(String action11) {
        this.action11 = action11;
    }

    public String getModNum12() {
        return modNum12;
    }

    public void setModNum12(String modNum12) {
        this.modNum12 = modNum12;
    }

    public String getRoom12() {
        return room12;
    }

    public void setRoom12(String room12) {
        this.room12 = room12;
    }

    public String getDescription12() {
        return description12;
    }

    public void setDescription12(String description12) {
        this.description12 = description12;
    }

    public String getComments12() {
        return comments12;
    }

    public void setComments12(String comments12) {
        this.comments12 = comments12;
    }

    public String getAction12() {
        return action12;
    }

    public void setAction12(String action12) {
        this.action12 = action12;
    }

    public String getModNum13() {
        return modNum13;
    }

    public void setModNum13(String modNum13) {
        this.modNum13 = modNum13;
    }

    public String getRoom13() {
        return room13;
    }

    public void setRoom13(String room13) {
        this.room13 = room13;
    }

    public String getDescription13() {
        return description13;
    }

    public void setDescription13(String description13) {
        this.description13 = description13;
    }

    public String getComments13() {
        return comments13;
    }

    public void setComments13(String comments13) {
        this.comments13 = comments13;
    }

    public String getAction13() {
        return action13;
    }

    public void setAction13(String action13) {
        this.action13 = action13;
    }

    public String getModNum14() {
        return modNum14;
    }

    public void setModNum14(String modNum14) {
        this.modNum14 = modNum14;
    }

    public String getRoom14() {
        return room14;
    }

    public void setRoom14(String room14) {
        this.room14 = room14;
    }

    public String getDescription14() {
        return description14;
    }

    public void setDescription14(String description14) {
        this.description14 = description14;
    }

    public String getComments14() {
        return comments14;
    }

    public void setComments14(String comments14) {
        this.comments14 = comments14;
    }

    public String getAction14() {
        return action14;
    }

    public void setAction14(String action14) {
        this.action14 = action14;
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
                ", date='" + date + '\'' +
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
                ", modNum1='" + modNum1 + '\'' +
                ", room1='" + room1 + '\'' +
                ", description1='" + description1 + '\'' +
                ", comments1='" + comments1 + '\'' +
                ", action1='" + action1 + '\'' +
                ", modNum2='" + modNum2 + '\'' +
                ", room2='" + room2 + '\'' +
                ", description2='" + description2 + '\'' +
                ", comments2='" + comments2 + '\'' +
                ", action2='" + action2 + '\'' +
                ", modNum3='" + modNum3 + '\'' +
                ", room3='" + room3 + '\'' +
                ", description3='" + description3 + '\'' +
                ", comments3='" + comments3 + '\'' +
                ", action3='" + action3 + '\'' +
                ", modNum4='" + modNum4 + '\'' +
                ", room4='" + room4 + '\'' +
                ", description4='" + description4 + '\'' +
                ", comments4='" + comments4 + '\'' +
                ", action4='" + action4 + '\'' +
                ", modNum5='" + modNum5 + '\'' +
                ", room5='" + room5 + '\'' +
                ", description5='" + description5 + '\'' +
                ", comments5='" + comments5 + '\'' +
                ", action5='" + action5 + '\'' +
                ", modNum6='" + modNum6 + '\'' +
                ", room6='" + room6 + '\'' +
                ", description6='" + description6 + '\'' +
                ", comments6='" + comments6 + '\'' +
                ", action6='" + action6 + '\'' +
                ", modNum7='" + modNum7 + '\'' +
                ", room7='" + room7 + '\'' +
                ", description7='" + description7 + '\'' +
                ", comments7='" + comments7 + '\'' +
                ", action7='" + action7 + '\'' +
                ", modNum8='" + modNum8 + '\'' +
                ", room8='" + room8 + '\'' +
                ", description8='" + description8 + '\'' +
                ", comments8='" + comments8 + '\'' +
                ", action8='" + action8 + '\'' +
                ", modNum9='" + modNum9 + '\'' +
                ", room9='" + room9 + '\'' +
                ", description9='" + description9 + '\'' +
                ", comments9='" + comments9 + '\'' +
                ", action9='" + action9 + '\'' +
                ", modNum10='" + modNum10 + '\'' +
                ", room10='" + room10 + '\'' +
                ", description10='" + description10 + '\'' +
                ", comments10='" + comments10 + '\'' +
                ", action10='" + action10 + '\'' +
                ", modNum11='" + modNum11 + '\'' +
                ", room11='" + room11 + '\'' +
                ", description11='" + description11 + '\'' +
                ", comments11='" + comments11 + '\'' +
                ", action11='" + action11 + '\'' +
                ", modNum12='" + modNum12 + '\'' +
                ", room12='" + room12 + '\'' +
                ", description12='" + description12 + '\'' +
                ", comments12='" + comments12 + '\'' +
                ", action12='" + action12 + '\'' +
                ", modNum13='" + modNum13 + '\'' +
                ", room13='" + room13 + '\'' +
                ", description13='" + description13 + '\'' +
                ", comments13='" + comments13 + '\'' +
                ", action13='" + action13 + '\'' +
                ", modNum14='" + modNum14 + '\'' +
                ", room14='" + room14 + '\'' +
                ", description14='" + description14 + '\'' +
                ", comments14='" + comments14 + '\'' +
                ", action14='" + action14 + '\'' +
                '}';
    }
}
