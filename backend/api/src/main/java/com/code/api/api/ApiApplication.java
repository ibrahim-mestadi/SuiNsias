package api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import api.dao.RoleRepository;
import api.entities.Annonce;
import api.entities.Message;
import api.entities.Role;
import api.service.AccountService;
import api.service.AnnonceService;
import api.service.MessageService;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	AccountService accountService;
	@Autowired
	AnnonceService annonceService;
	@Autowired
	MessageService messageService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===============================START=======================================");
		accountService.save(new Role(null,"ADMIN"));
		accountService.save(new Role(null,"USER"));
		accountService.saveUser("user","user","user@mail.com", "1234","USER",true,new Date(),"Etablissement","Grade","0655443322","Specialite","Theme de recherche");
		accountService.saveUser("admin","admin","admin@gmail.com","1234","ADMIN",true,new Date(),"Etablissement","Grade","0655443322","Specialite","Theme de recherche");
	/*	for (int i = 1; i < 11; i++) {
			accountService.saveUser("ibrahim"+i,"Mestadi"+i,"ibrahim.mestadi"+i+"@ieee.org","1234","USER",true,new Date(),"ENSIAS","2A","0655443322","GL","Theme de recherche");
		}*/
		accountService.saveUser("ibrahim","Mestadi","ibrahim.mestadi@ieee.org","1234","USER",true,new Date(),"ENSIAS","2A","0655443322","GL","Theme de recherche");
		accountService.saveUser("ismail","Mosleh","ismailmosleh2018@gmail.com","1234","USER",true,new Date(),"ENSIAS","2A","0655443322","GL","Theme de recherche");
		accountService.saveUser("walid","Mhidou","walidmhidou1@gmail.com","1234","USER",true,new Date(),"ENSIAS","2A","0655443322","GL","Theme de recherche");



		for (int i = 1; i < 3; i++) {
			annonceService.saveAnnonce(new Annonce(null, "Sed do eiusmod tempor incididunt", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolo.", new Date(), "Urgent"));
		}
		for (int i = 1; i < 11; i++) {
			messageService.saveMessage(new Message(null,"Nom "+i,"nom"+i+"@mail.com","Message de nom"+i));
		}
		
	}

}
