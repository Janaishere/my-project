package MainPackage.service;

import MainPackage.model.Solution;
import MainPackage.repository.SolutionRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// 
public interface SolutionService {
    Solution submitSolution(Solution solution);
    List<Solution> getSolutionsByUserId(Long userId);
    List<Solution> getSolutionsByQuestionId(Long questionId);
}