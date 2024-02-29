package student_tracker.tracker.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    private String weight;
    private String height;
    private String haircolor;
    private String gpa;
    public User() {
    }
    public User(String name, String weight, String height, String haircolor, String gpa) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }
    public User(String uName, int uWeight, int uHeight, String uHaircolor, String uGpa) {
        //TODO Auto-generated constructor stub
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getHaircolor() {
        return haircolor;
    }
    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public String getGpa() {
        return gpa;
    }
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    
}
