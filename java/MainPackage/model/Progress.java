package MainPackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
	public class Progress {
	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuestionsSolved() {
		return questionsSolved;
	}

	public void setQuestionsSolved(int questionsSolved) {
		this.questionsSolved = questionsSolved;
	}

	public int getTopicsMastered() {
		return topicsMastered;
	}

	public void setTopicsMastered(int topicsMastered) {
		this.topicsMastered = topicsMastered;
	}

	public int getMistakesCorrected() {
		return mistakesCorrected;
	}

	public void setMistakesCorrected(int mistakesCorrected) {
		this.mistakesCorrected = mistakesCorrected;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private int questionsSolved; // Total questions solved by the student
	    private int topicsMastered; // Number of topics the student has mastered
	    private int mistakesCorrected; // Number of mistakes the student has fixed

	    @OneToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user; // Tied to a specific student

	    // Getters and Setters
	}

