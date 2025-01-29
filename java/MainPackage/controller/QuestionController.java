package MainPackage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MainPackage.service.Questionservice;
import MainPackage.model.Question;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Endpoint to get all questions for a slide
    @GetMapping("/slide/{slideId}")
    public List<Question> getQuestionsBySlide(@PathVariable Long slideId) {
        return questionService.getQuestionsForSlide(slideId);
    }

    // Endpoint to add "What If" prompt to a question
    @PostMapping("/{questionId}/whatIf")
    public Question addWhatIfPrompt(@PathVariable Long questionId, @RequestBody String prompt) {
        return questionService.addWhatIfPrompt(questionId, prompt);
    }
}

