package BigPlan.service;

import BigPlan.model.Detail;
import BigPlan.model.Role;
import BigPlan.model.User;
import BigPlan.repository.UserRepository;
import BigPlan.webdto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImp  implements  UserService{

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getEmail(), registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")),
                Arrays.asList(new Detail("FIRSTNAME_USER", "LASTNAME_USER", (long) 000000000)));

        return userRepository.save(user);
    }
}
