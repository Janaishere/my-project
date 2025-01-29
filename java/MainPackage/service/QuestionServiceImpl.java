package MainPackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.model.Question;
import MainPackage.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsBySlideId(Long slideId) {
        return questionRepository.findBySlideId(slideId);
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Question not found"));
    }
}
