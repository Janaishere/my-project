package MainPackage.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import MainPackage.model.Question;
import MainPackage.model.Slides;

public interface SlideService {
    Slides uploadSlide(MultipartFile file, Long userId);
    List<Question> generateQuestionsFromSlide(Long slideId);
}