package MainPackage.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Question {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String description;
	    private String type;
	@ManyToOne
    @JoinColumn(name = "slide_id", nullable = false)
    private Slides slide; // Tied to a specific slide

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<testcases> testCases = new ArrayList<>();

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Scenario> scenarios = new ArrayList<>();

	public Question(String question, String typeof) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Slides getSlide() {
		return slide;
	}

	public void setSlide(Slides slide) {
		this.slide = slide;
	}

	public List<testcases> getTestCases() {
		return testCases;
	}

	public void setTestCases(List<testcases> testCases) {
		this.testCases = testCases;
	}

	public List<Scenario> getScenarios() {
		return scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}
  
   
   

   
}
