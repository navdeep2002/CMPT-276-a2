package student_tracker.tracker.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer>{
    List<User> findByName(String name);
    List<User> findByGpa(String gpa);
    List<User> findByHaircolor(String haircolor);
    List<User> findByHeight(String height);
    List<User> findByWeight(String weight);
    

}
