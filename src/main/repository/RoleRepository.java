package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Order;
/**
 * 
 * @author hsu
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
