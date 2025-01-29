package MainPackage.service;

import MainPackage.model.User;

import MainPackage.repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MainPackage.repository.UserRepository;

public interface UserService {
    User registerUser(User user);
    User loginUser(String email, String password);
    Optional<User> getUserById(Long id);
}
