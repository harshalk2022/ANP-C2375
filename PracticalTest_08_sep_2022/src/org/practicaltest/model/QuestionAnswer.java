package org.practicaltest.model;

import java.util.Objects;

public class QuestionAnswer {
	
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;
	
	public QuestionAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionAnswer(String question, String option1, String option2, String option3, String option4,
			String answer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}
	
	

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionAnswer [question=" + question + ", answer=" + answer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(answer, option1, option2, option3, option4, question);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionAnswer other = (QuestionAnswer) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(option1, other.option1)
				&& Objects.equals(option2, other.option2) && Objects.equals(option3, other.option3)
				&& Objects.equals(option4, other.option4) && Objects.equals(question, other.question);
	}
	



}
