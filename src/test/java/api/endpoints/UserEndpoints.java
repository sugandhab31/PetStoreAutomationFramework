package api.endpoints;


import api.payload.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserEndpoints {

    public static Response createUser(User payload){
        RestAssured.baseURI = Routes.postCreateUser;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.body(payload);

        Response response = requestSpecification.post();
        return response;
    }

    public static Response getUser(String userName){
        RestAssured.baseURI = Routes.getUser;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.pathParam("username",userName);

        Response response = requestSpecification.get();
        return response;
    }

    public static Response updateUser(User payload, String userName){
        RestAssured.baseURI = Routes.postCreateUser;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.pathParam("username",userName);
        requestSpecification.body(payload);

        Response response = requestSpecification.post();
        return response;
    }

    public static Response deleteUser(String userName){
        RestAssured.baseURI = Routes.getUser;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.pathParam("username",userName);

        Response response = requestSpecification.get();
        return response;
    }

}
