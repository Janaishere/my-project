package MainPackage.repository;
import MainPackage.model.testcases;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TestCaseRepository extends JpaRepository<testcases, Long> {
    List<testcases> findByQuestionId(Long questionId); // Find all test cases for a specific question
}
