package api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import api.api.RoleRepository;
import api.entities.Annonce;
import api.entities.Message;
import api.entities.Role;
import api.service.AccountService;
import api.service.AnnonceService;
import api.service.MessageService;

@SpringBootApplication
public class Application implements CommandLineRunner{
}
	