package com.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Parent")
@Table(name = "User_Details")

public class UserDetails {
    @Id @GeneratedValue
    @Column(name ="User_Id" )
    private int userID;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date userDate;
    @Column(name = "User_Description")
    private String description;
    @JsonIgnore
    @OneToOne(mappedBy = "userDetails",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Vechile vechile;
 /*   @ManyToMany(mappedBy = "userDetails", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection<Vechile1> vechiles = new ArrayList<Vechile1>();

    public Collection<Vechile1> getVechiles() {
        return vechiles;
    }

    public void setVechiles(Collection<Vechile1> vechiles) {
        this.vechiles = vechiles;
    }*/

    public Vechile getVechile() {
        return vechile;
    }

    public void setVechile(Vechile vechile) {
        this.vechile = vechile;
            }
    /*  @ElementCollection(fetch = FetchType.LAZY)
    @JoinTable(name = "User_Address",joinColumns = @JoinColumn(name = "User_Id"))
    private Collection<Address> address = new ArrayList<Address>();


    public void setAddress(Collection<Address> address) {
        this.address = address;
    }

    public Collection<Address> getAddress() {
        return address;
    }*/

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
