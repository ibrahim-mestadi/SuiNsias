package api.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api.entities.Annonce;
import api.entities.User;
import api.service.AnnonceService;
import api.service.IAnnonceService;
import lombok.Data;

@RestController
public class AnnonceController {
	@Autowired
	AnnonceService annonceService;
	
	@GetMapping("/annonces")
	public List<Annonce> getAll()
	{
	}
	@PostMapping("/annonces")
	public Annonce register(@RequestBody AnnonceForm annonceForm)
	{
		
	}

}

@Data
class AnnonceForm{
	
}
