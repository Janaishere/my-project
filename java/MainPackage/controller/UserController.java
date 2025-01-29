
package MainPackage.controller;

import MainPackage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test-connection")
    public String testDatabase() {
        userService.createSampleUser();
        return "Database connected, and user added!";
    }
}
