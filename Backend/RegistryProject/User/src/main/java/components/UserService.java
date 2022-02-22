package components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.User;
import entities.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	// Create
	public void createUser(User user) {
		repository.save(user);

	}

	
	// Read
	public List<User> readUsers() {
		List<User> list = repository.findAll();
		return list;
	}

	public User findById(String email) {
		User user = repository.findByEmail(email);
		return user;
	}

	// Update
	public void updateUser(User originalUser, User updatedUser) {
		originalUser = updatedUser;
		
		repository.save(originalUser);

	}

	

	// Delete
	public void deleteUser(User user) {
		repository.delete(user);
	}



	
}
