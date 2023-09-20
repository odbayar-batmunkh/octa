package mn.octagon.userservice.repository;

import mn.octagon.userservice.entity.User;
import mn.octagon.userservice.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends MainRepository<User, Long> {

    @Query("select new mn.octagon.userservice.model.UserModel(a.id, a.first_name, a.last_name) from User a")
    List<UserModel> getUserList();

}
