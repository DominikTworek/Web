package BigPlan.service;

import BigPlan.model.User;
import BigPlan.webdto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
