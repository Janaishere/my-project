/*package MainPackage.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import MainPackage.model.Question;
import MainPackage.model.Slides;
import MainPackage.model.User;
import MainPackage.repository.QuestionRepository;
import MainPackage.repository.SlideRepository;
import MainPackage.repository.UserRepository;

@Service
public class SlideServiceImpl implements SlideService {

    @Autowired
    private SlideRepository slideRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
   public Slides uploadSlide(MultipartFile file, Long userId) {
        // Validate user
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found"));

        // Save file to server or cloud storage
        String filePath = saveFile(file);

        // Create and save slide
        Slides slide = new Slides();
        slide.setTitle(file.getOriginalFilename());
        slide.setFilePath(filePath);
        slide.setUser(user);
        return slideRepository.save(slide);
    }

    @Override
    public List<Question> generateQuestionsFromSlide(Long slideId) {
        // Find slide by ID
        Slides slide = slideRepository.findById(slideId)
            .orElseThrow(() -> new RuntimeException("Slide not found"));

        // Extract text from slide (e.g., using OCR)
        String slideText = extractTextFromSlide(slide.getFilePath());

        // Generate questions from slide text
       // List<Question> questions = generateQuestions(slideText);

        // Save questions to database
      //  questions.forEach(question -> question.setSlide(slide));
       // return questionRepository.saveAll(questions);
    }

    private String saveFile(MultipartFile file) {
        // Logic to save file to server or cloud storage
        return "path/to/saved/file";
    }

    private String extractTextFromSlide(String filePath) {
        // Logic to extract text using OCR 
        return "Extracted text from slide";
    }

   // private List<Question> generateQuestions(String slideText) {
        // Logic to generate questions from slide text
    //    return List.of(
    //        new Question(),
      //      new Question("Explain the concept of inheritance.", "ACTIVE_RECALL")
   //     );
    }
}*/
