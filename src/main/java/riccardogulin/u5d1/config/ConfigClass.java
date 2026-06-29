package riccardogulin.u5d1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.Interviewer;
import riccardogulin.u5d1.entities.Student;

@Configuration
/*
Grazie a questa annotazione, questa sarà una classe speciale all'interno di quest'applicazione.
Essa conterrà difatti tutte le dichiarazioni dei BEAN (cioè oggetti gestiti da Spring)
ciò significa che possiamo chiedere a Spring di creare e gestire determinati oggetti seguendo
le istruzioni che daremo in questa classe.
Ogni metodo annotato con @Bean serve per definire un oggetto diverso.
*/
public class ConfigClass {

	@Bean
	public int getNumber() {
		return 42;
	}

	@Bean
	public String getAdminName() {
		return "Ajeje";
	}

	@Bean
	public FrontendStudent getFEStudent() {
		return new FrontendStudent("Aldo", "Baglio");
	}

//	@Bean(name = "giova")
//	public BackendStudent getBEStudent() {
//		return new BackendStudent("Giovanni", "Storti");
//	}
//
//	@Bean
//	public FullStackStudent getFSStudent() {
//		return new FullStackStudent("Giacomo", "Poretti");
//	}

//	@Bean
//	public FullStackStudent getFSStudent2() {
//		return new FullStackStudent("Giacomo", "Poretti");
//	}

	@Bean
	public Interviewer getInterviewer(Student student) {
		// Il parametro FullStackStudent è una DIPENDENZA di Interviewer
		// Spring pertanto non è che solo crea oggetti semplici, ma è anche
		// in grado di risolvere le dipendenze andando a ricercare nello
		// scatolone se ci siano dei Bean compatibili (in questo caso per tipo)
		// se li trova li passa ad Interviewer

		// Se di Bean compatibili ne dovesse trovare zero, ci darebbe errore
		// in partenza (cioè APPLICATION FAILED TO START)

		// Anche se dovesse trovarne più di uno compatibile, ci darebbe un errore
		// analogo

		return new Interviewer(student);
	}
}
