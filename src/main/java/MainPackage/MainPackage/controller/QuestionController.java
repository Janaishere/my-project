package MainPackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MainPackage.model.Question;
import MainPackage.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

   
  //  @GetMapping("/slide/{slideId}")
  //  public List<Question> getQuestionsBySlide(@PathVariable Long slideId) {
 //       return questionService.getQuestionsForSlide(slideId);
  //  }

    
 //   @PostMapping("/{questionId}/whatIf")
  //  public Question addWhatIfPrompt(@PathVariable Long questionId, @RequestBody String prompt) {
  //      return questionService.addWhatIfPrompt(questionId, prompt);
 //   }
}

