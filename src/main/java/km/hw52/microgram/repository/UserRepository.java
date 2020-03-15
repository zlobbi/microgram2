package km.hw52.microgram.repository;

import km.hw52.microgram.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findBylogin(String login);
}
// add searching user by name
// verify user existence by email
// get user publications list
// get comments for publication
// get user subscriptions count
// get user subscribers count
