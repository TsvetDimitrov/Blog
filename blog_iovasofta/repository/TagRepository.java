package blog_iovasofta.repository;

import blog_iovasofta.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {

    Tag findByName(String name);
}
