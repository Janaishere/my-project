package MainPackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class testcases {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String input;
	private String expectedoutpout;
	
	@ManyToOne
	@JoinColumn(name ="question_id",nullable = false)
	private Question question;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getExpectedoutpout() {
		return expectedoutpout;
	}

	public void setExpectedoutpout(String expectedoutpout) {
		this.expectedoutpout = expectedoutpout;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	
	
	
}
