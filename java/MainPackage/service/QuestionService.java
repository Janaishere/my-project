package MainPackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MainPackage.model.Question;
import MainPackage.repository.QuestionRepository;



public interface QuestionService {
    List<Question> getQuestionsBySlideId(Long slideId);
    Question getQuestionById(Long id);
}
