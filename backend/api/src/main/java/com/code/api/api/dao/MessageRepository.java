package api.api;

import org.springframework.data.jpa.repository.JpaRepository;

import api.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
