package br.belasartes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.belasartes.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
