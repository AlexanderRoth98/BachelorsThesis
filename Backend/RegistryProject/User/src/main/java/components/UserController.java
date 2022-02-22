package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.User;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/createUser")
	public @Valid User createUser(@Valid @RequestBody User user) {
		service.createUser(user);
		return user;
	}

	@RequestMapping("/readUsers")
	public List<User> readUsers() {
		List<User> userList = service.readUsers();
		return userList;
	}

	@RequestMapping("/updateUser{email}")
	public User updateUser(@PathVariable("email") String email,
			@Valid @RequestBody User updatedUser) {
		User originalUser = service.findById(email);
		service.updateUser(originalUser, updatedUser);
		return originalUser;

	}

	@RequestMapping("/deleteUser{email}")
	public User deleteUser(@PathVariable("email") String email) {
		User user = service.findById(email);
		service.deleteUser(user);
		return user;
	}

	@RequestMapping("/findByEmail{email}")
	public User findUserByEmail(@PathVariable("email") String email) {
		User user = service.findById(email);
		return user;

	}

	
}
