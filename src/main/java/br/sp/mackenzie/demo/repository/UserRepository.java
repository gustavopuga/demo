package br.sp.mackenzie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.mackenzie.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
