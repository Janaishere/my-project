package MainPackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Scenario {

	
	@Id 
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long id;
	
    private String description; // Prompt for the scenario (e.g., "What if you pass a null value?")
    private String modifiedCode; // Student's modified code for the scenario
    private String output;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getModifiedCode() {
		return modifiedCode;
	}


	public void setModifiedCode(String modifiedCode) {
		this.modifiedCode = modifiedCode;
	}


	public String getOutput() {
		return output;
	}


	public void setOutput(String output) {
		this.output = output;
	}


	public Solution getSolution() {
		return solution;
	}


	public void setSolution(Solution solution) {
		this.solution = solution;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	@ManyToOne 
	@JoinColumn(name ="solution_id",nullable = false)
	private Solution solution;
	
	
	@ManyToOne 
	@JoinColumn(name ="question_id",nullable = false)
	private Question question;
	
	
}
