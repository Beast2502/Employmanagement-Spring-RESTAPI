package in.Mehul.springRestAPI.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

    //@JsonProperty("fullName")
    private String name;

   // @JsonIgnore
    private Long age;
    private String location;
    private String email;
    private String department;
}
