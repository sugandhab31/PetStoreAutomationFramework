package api.test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTest {

    Faker faker = new Faker();
    User user;
    @BeforeClass
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
    @Test
    public void postCreateUser(){
        UserEndpoints userEndpoints = new UserEndpoints();
        Response response = userEndpoints.createUser(user);
        Assert.assertEquals(response.statusCode(),200);
    }

}
