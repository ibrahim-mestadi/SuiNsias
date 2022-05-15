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


}
