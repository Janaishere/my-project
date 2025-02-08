package MainPackage.repository;
import MainPackage.model.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {
    List<Scenario> findByQuestionId(Long questionId); // Find all scenarios for a specific question
    List<Scenario> findBySolutionId(Long solutionId); // Find all scenarios for a specific solution
}
