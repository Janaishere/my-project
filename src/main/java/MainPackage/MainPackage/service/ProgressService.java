package MainPackage.service;

import MainPackage.model.Progress;

public interface ProgressService {
    Progress getProgressByUserId(Long userId);
    Progress updateProgress(Long userId, int questionsSolved, int topicsMastered, int mistakesCorrected);
}
