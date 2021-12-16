package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> user = driverService.getByLogin(login);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            logger.info("Driver with username: \"" + login + "\" authorization was successful.");
            return user.get();
        }
        logger.error("Driver with username: \"" + login + "\" authorization was unsuccessful.");
        throw new AuthenticationException("Username or password was incorrect");
    }
}
