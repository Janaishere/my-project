package MainPackage.model;



	import jakarta.persistence.*;
	import java.sql.Timestamp;

	@Entity
	public class Solution {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String code; // For code submissions
	    private String handwrittenImagePath; // Path to uploaded handwritten image
	    private String feedback; // Feedback from the platform

	    @ManyToOne
	    @JoinColumn(name = "question_id", nullable = false)
	    private Question question;

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getHandwrittenImagePath() {
			return handwrittenImagePath;
		}

		public void setHandwrittenImagePath(String handwrittenImagePath) {
			this.handwrittenImagePath = handwrittenImagePath;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public Question getQuestion() {
			return question;
		}

		public void setQuestion(Question question) {
			this.question = question;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	}


