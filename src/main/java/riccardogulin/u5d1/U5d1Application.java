package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d1.entities.Interviewer;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		// ------------------- METODO TRADIZIONALE ---------------------
//		FrontendStudent aldo = new FrontendStudent("Aldo", "Baglio");
//		Interviewer interviewer = new Interviewer(aldo);
//
//		interviewer.askQuestion();

		// ------------------- METODO CON I BEANS ---------------------
		// 1. Devo accedere all'Application Context creando un oggetto di tipo AnnotationConfigApplicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);

		// 2. Tramite il context posso usare il metodo .getBean() per leggere i bean dallo "scatolone", posso farlo o specificando
		// il NOME PRECISO DEL BEAN oppure il TIPO DEL BEAN
//		FrontendStudent aldoFromContext = context.getBean(FrontendStudent.class);
//		System.out.println(aldoFromContext);
//
//		BackendStudent giovaFromContext = context.getBean(BackendStudent.class);
//		System.out.println(giovaFromContext);
//
//		FullStackStudent giacomoFromContext = context.getBean(FullStackStudent.class);
//		System.out.println(giacomoFromContext);

		// Posso leggere i Bean anche per NOME. Di default il nome è il nome del metodo, posso cambiare il default
		// con @Bean(name = "nome_custom")
//		FrontendStudent aldoFromContext2 = context.getBean("getFEStudent", FrontendStudent.class);
//		System.out.println(aldoFromContext2);
//
//		BackendStudent giovaFromContext2 = context.getBean("giova", BackendStudent.class);
//		System.out.println(giovaFromContext2);

		Interviewer interviewer = context.getBean(Interviewer.class);
		interviewer.askQuestion();


	}

}
