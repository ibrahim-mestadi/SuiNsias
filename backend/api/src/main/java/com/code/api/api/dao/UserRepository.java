package api.api;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import api.entities.User;

@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long>{
	 
}
