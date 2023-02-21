package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void getUsers() {
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get("https://reqres.in/api/users?page=2")
                .then()
                .extract()
                .body().jsonPath().getList("data", UserData.class);
        users.forEach(el -> Assertions.assertTrue(el.getAvatar().contains(el.getId().toString())));
        Assertions.assertTrue(users.stream().allMatch(el->el.getEmail().endsWith("@reqres.in")));
    }
}
