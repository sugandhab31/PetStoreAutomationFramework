package api.test;

import api.payload.User;
import com.github.javafaker.Faker;

public class UserTest {

    Faker faker;
    User user;

    public void setupPayload(){

        user = new User();
        user.setUserId(faker.idNumber().hashCode());
        user.setUsername(faker.name().username());
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setEmail(faker.internet().emailAddress());
        user.setPhone(faker.phoneNumber().phoneNumber());
        user.setPassword(faker.internet().password());

    }

}
