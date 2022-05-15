package api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api.entities.Annonce;
import api.entities.Message;
import api.service.IMessageService;
import api.service.MessageService;
import lombok.Data;

@RestController
public class MessageController {
@Autowired
MessageService messageService;


@GetMapping("/messages")
public List<Message> getAll()
{
}
@PostMapping("/messages")
public Message sendMessage(@RequestBody MessageForm messageForm)
{

}

}

@Data
class MessageForm{
	
}