package br.belasartes.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.belasartes.demo.model.User;
import br.belasartes.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

	public User create(String name) {
		User person = new User(name);
		return repository.save(person);
	}
	
	public Optional<User> findBy(Long id) {
		return repository.findById(id);
	}
}
