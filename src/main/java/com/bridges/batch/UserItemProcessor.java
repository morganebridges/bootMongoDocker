package com.bridges.batch;

        import com.bridges.model.User;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(final User User) throws Exception {
        final String name = User.getName().toUpperCase();
        final User transformedUser = new User(name);

        log.info("Converting (" + User + ") into (" + transformedUser + ")");

        return transformedUser;
    }

}