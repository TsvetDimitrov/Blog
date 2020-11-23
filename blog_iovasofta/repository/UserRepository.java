package blog_iovasofta.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import blog_iovasofta.entity.User;




public interface UserRepository extends JpaRepository <User, Integer> {

    User findByEmail(String email);

}
