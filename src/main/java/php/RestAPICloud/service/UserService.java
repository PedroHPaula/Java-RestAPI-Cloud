package php.RestAPICloud.service;

import php.RestAPICloud.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
