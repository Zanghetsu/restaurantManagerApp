package com.restaurantmanager.usermanager.appuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class AppUserController {

    @GetMapping(path = "api/v1/get_user")
    public List<AppUser> get_AppUsers() {
        return List.of(
                new AppUser(1, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990, 12, 1)),
                new AppUser(2, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990, 12, 1))
        );

    }
}
