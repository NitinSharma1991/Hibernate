package com.DTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vechile {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vechileId;
    private String vechileName;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "User_ID", referencedColumnName = "User_ID")
    private UserDetails userDetails;



    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
           this.userDetails = userDetails;

    }

    public int getVechileId() {
        return vechileId;
    }

    public void setVechileId(int vechileId) {
        this.vechileId = vechileId;
    }

    public String getVechileName() {
        return vechileName;
    }

    public void setVechileName(String vechileName) {
        this.vechileName = vechileName;
    }


}
