package riccardogulin.u5d1.entities;

public class Interviewer {
	private Student student; // Questa è una DIPENDENZA nei confronti di un'altra classe

	public Interviewer(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		System.out.println("Buongiorno " + this.student.getSurname() + ", mi risponda alla seguente domanda...blablabla");
		this.student.answerQuestion();
	}
}
