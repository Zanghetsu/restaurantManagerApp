package com.restaurantmanager.usermanager.appuser;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppUserService{
    public List<AppUser> get_Users() {
        return List.of(
                new AppUser(1, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990, 12, 1)),
                new AppUser(2, "bob", "yosef", "boby.yosef@mail.com", LocalDate.of(1990, 12, 1))
        );
    }
}
