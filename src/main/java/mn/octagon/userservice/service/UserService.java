package mn.octagon.userservice.service;

import mn.octagon.userservice.entity.Users;
import mn.octagon.userservice.model.UserModel;
import mn.octagon.userservice.repository.IUserRepository;
import mn.octagon.userservice.response.ResponseModel;
import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "Success";
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public ResponseEntity<ResponseModel<Users>> saveUser1(Users user) {
        Users savedUser = userRepository.save(user);
        return ResponseEntity.ok(new ResponseModel<>("200","Амжилттай", true, savedUser));
    }

    public ResponseEntity<ResponseModel<List<UserModel>>> getUserModel() {
        List<UserModel> userList = userRepository.getUserList();
        return ResponseEntity.ok(new ResponseModel<>("200","Амжилттай", true, userList));
    }
}
