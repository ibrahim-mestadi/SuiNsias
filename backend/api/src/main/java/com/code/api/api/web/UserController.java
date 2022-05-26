package api.web;

import java.sql.Date;

import api.service.notifServices.SendMail;
import api.service.mailingServices.EmailService;
import api.service.notifServices.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment ;

import api.entities.User;
import api.service.AccountService;
import lombok.Data;

import javax.mail.MessagingException;

@RestController
public class UserController {

	@Autowired
	AccountService accountService;

	@Autowired

	EmailService emailService ;



	@Autowired Environment environment;


	@Autowired
	Sender sender ;






	@PostMapping("/register")
	public User register(@RequestBody UserForm userForm) throws MessagingException {
		
		System.err.println(userForm);
		User createdUser =
		 accountService.saveUser(
				userForm.getFirstname(),
				userForm.getLastname(),
				userForm.getEmail(),
				userForm.getPassword(),
				userForm.getRole(),
				userForm.getActive(),
				userForm.getBirthdDay(),
				userForm.getEtablissement(),
				userForm.getGrade(),
				userForm.getTel(),
				userForm.getSpecialite(),
				userForm.getThemeDeRecherche()
				);


		/*SendMail sendMail = new SendMail();*/
		String core = "Hello,"+createdUser.getFirstname() +" "+createdUser.getLastname()+ "\n";
		core = "We sent you this email, because the admins of the platform suiensias, added you, knowing that" +
				"you are a part of ENSIAS familly. \n" +
				"You are welcome with us, you will find here many resources & Students blog posts \n" +
				"feel free to join us, dev team, pedagogic team ... or make a suggestion to us in contact zone \n"
				+ "Your credentials to join  : \n" +
				"userName: "+ createdUser.getEmail() + "\n"+
				"Password: "+ "1234" ;
		String subj = "Welcome in suiensias" ;
		sender.send(createdUser.getEmail(), environment.getProperty("spring.mail.username") , core, subj, environment.getProperty("spring.mail.host") );

		return createdUser ;
	}

	@GetMapping("/profile")
	public String currentOne() {

		String userName = SecurityContextHolder.getContext().getAuthentication().getName() ;

		return userName ;
	}
}
@Data
class UserForm{
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String role;
	private Boolean active;
	private Date birthdDay;
	private String etablissement;
	private String grade;
	private String tel;
	private String specialite;
	private String themeDeRecherche;
}
