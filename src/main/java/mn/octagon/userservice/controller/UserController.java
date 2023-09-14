package mn.octagon.userservice.controller;


import mn.octagon.userservice.entity.Users;
import mn.octagon.userservice.model.UserModel;
import mn.octagon.userservice.response.ResponseModel;
import mn.octagon.userservice.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("save-user")
    public Users saveUser(@RequestBody Users users) {
        return userService.saveUser(users);
    }

    @PostMapping("save-user1")
    public ResponseEntity<ResponseModel<Users>> saveUser1(@RequestBody Users users) {
        return userService.saveUser1(users);
    }

    @PostMapping("delete")
    public String deleteUser(@RequestBody String id) {
        return userService.deleteUser(Long.parseLong(id));
    }

    @GetMapping("user-all")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("user")
    public Users getUserById(@RequestParam("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("user-list")
    public ResponseEntity<ResponseModel<List<UserModel>>> getUserList() {
        return userService.getUserModel();
    }
}
