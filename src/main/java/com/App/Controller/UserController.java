package com.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.App.Service.UserService;
import com.App.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;

	// create a user
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> CreateUser(@RequestBody User user) throws Exception {
		return new ResponseEntity<User>(userservice.save(user), HttpStatus.CREATED);

	}

	// get users
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> get(@RequestBody User user) throws Exception {
		return new ResponseEntity<List<User>>(userservice.findall(user), HttpStatus.OK);

	}

	// get user by user name
	@RequestMapping(value = "{/UserName}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("UserName") String UserName) throws Exception {
		return new ResponseEntity<User>(userservice.findUserbyName(UserName), HttpStatus.OK);
	}

	// update user
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@RequestBody User user) throws Exception {
		return new ResponseEntity<User>(userservice.save(user), HttpStatus.OK);

	}

	// delete user
	@RequestMapping(value = "{/UserName}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("UserName") String UserName) throws Exception {
		if (!UserName.contains(".com")) {
			UserName += ".com";
		}
		userservice.delete(UserName);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}
