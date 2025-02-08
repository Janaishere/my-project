package MainPackage.service;

import MainPackage.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.model.Question;
import MainPackage.model.Solution;
import MainPackage.model.User;
import MainPackage.repository.QuestionRepository;
import MainPackage.repository.SolutionRepository;
import MainPackage.repository.UserRepository;

@Service
public  class SolutionServiceImpl implements SolutionService {

    @Autowired
    private SolutionRepository solutionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Solution submitSolution(Solution solution) {
        // Validate user and question
        User user = userRepository.findById(solution.getUser().getId())
            .orElseThrow(() -> new RuntimeException("User not found"));
        Question question = questionRepository.findById(solution.getQuestion().getId())
            .orElseThrow(() -> new RuntimeException("Question not found"));

        // Set user and question in solution
        solution.setUser(user);
        solution.setQuestion(question);

        // Save solution to database
        return solutionRepository.save(solution);
    }

    @Override
    public List<Solution> getSolutionsByUserId(Long userId) {
        return solutionRepository.findByUserId(userId);
    }

    @Override
    public List<Solution> getSolutionsByQuestionId(Long questionId) {
        return solutionRepository.findByQuestionId(questionId);
    }
}