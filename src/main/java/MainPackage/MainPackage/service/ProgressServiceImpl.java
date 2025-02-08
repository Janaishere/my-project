package MainPackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainPackage.model.Progress;
import MainPackage.repository.ProgressRepository;
import MainPackage.repository.UserRepository;
import MainPackage.model.Progress;
@Service
public class ProgressServiceImpl implements ProgressService {

    @Autowired
    private ProgressRepository progressRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Progress getProgressByUserId(Long userId) {
        return progressRepository.findByUserId(userId)
            .orElseThrow(() -> new RuntimeException("Progress not found"));
    }

    @Override
    public Progress updateProgress(Long userId, int questionsSolved, int topicsMastered, int mistakesCorrected) {
        // Find progress by user ID
        Progress progress = progressRepository.findByUserId(userId)
            .orElseThrow(() -> new RuntimeException("Progress not found"));

        // Update progress
        progress.setQuestionsSolved(questionsSolved);
        progress.setTopicsMastered(topicsMastered);
        progress.setMistakesCorrected(mistakesCorrected);

        // Save updated progress
        return progressRepository.save(progress);
    }
}