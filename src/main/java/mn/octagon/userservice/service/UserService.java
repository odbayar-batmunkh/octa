package mn.octagon.userservice.service;

import mn.octagon.userservice.entity.User;
import mn.octagon.userservice.model.UserModel;
import mn.octagon.userservice.repository.IUserRepository;
import mn.octagon.userservice.response.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "Success";
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public ResponseEntity<ResponseModel<User>> saveUser1(User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(new ResponseModel<>("200","Амжилттай", true, savedUser));
    }

    public ResponseEntity<ResponseModel<List<UserModel>>> getUserModel() {
        List<UserModel> userList = userRepository.getUserList();
        return ResponseEntity.ok(new ResponseModel<>("200","Амжилттай", true, userList));
    }
}
