package just.fo.fun.commentary.repository;

import just.fo.fun.entities.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaryRepository extends JpaRepository<Commentary, Long> {

    List<Commentary> getAllByParentIsNullAndPostIdOrderByRatingDesc(Long id);
    List<Commentary> getAllByParentIdOrderByRatingDesc(Long id);

}
