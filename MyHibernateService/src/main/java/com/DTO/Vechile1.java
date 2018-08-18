package com.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Vechile1 {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vechileId;
    private String vechileName;
/*    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "User_Details",joinColumns = @JoinColumn(name = "User_ID"))
     private Collection<UserDetails> userDetails = new ArrayList<UserDetails>();*/

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
