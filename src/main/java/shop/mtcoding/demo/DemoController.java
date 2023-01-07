package shop.mtcoding.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @CrossOrigin
    @GetMapping("/init/user")
    public ResponseEntity<?> home() {
        List<User> users = new ArrayList<>();
        User u1 = new User(1, "ssar", "1234", "ssar@nate.com");
        User u2 = new User(2, "cos", "1234", "cos@nate.com");
        User u3 = new User(3, "love", "1234", "love@nate.com");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
