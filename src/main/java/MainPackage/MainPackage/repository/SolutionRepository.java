package MainPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import MainPackage.model.Solution;


import java.util.List;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
    List<Solution> findByUserId(Long userId); // Find all solutions submitted by a specific user
    List<Solution> findByQuestionId(Long questionId); 
    @Query("SELECT s FROM Solution s WHERE s.user.id = :userId AND s.question.id = :questionId")
    List<Solution> findByUserAndQuestion(@Param("userId") Long userId, @Param("questionId") Long questionId);
}
