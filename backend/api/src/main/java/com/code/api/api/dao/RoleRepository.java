package api.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import api.entities.Role;


@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long>{
	public Role findByRoleName(String rolename);
}
