package mn.octagon.userservice.model;

import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String first_name;
    private String last_name;

    public UserModel(Long id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
