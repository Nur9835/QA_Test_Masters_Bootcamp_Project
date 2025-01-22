import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PetStore_UserTests {

    @Test
    public void GetUserInfo(){
        CreateUser();
        RestAssured
                .get("https://petstore.swagger.io/v2/user/tester1234");

    }

    @Test
    public void CreateUser(){

        Map<String, Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",123456790);
        bodyPayload.put("username","tester1234");
        bodyPayload.put("firstName","test212");
        bodyPayload.put("lastName","test2");
        bodyPayload.put("email","test@mail.com");
        bodyPayload.put("password","test123");
        bodyPayload.put("phone","123456");
        bodyPayload.put("userStatus",1);

        Map<String,String> header=new HashMap<>();
        header.put("accept","application/json");
        header.put("Content-Type","application/json");

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers(header)
                .body(bodyPayload)
                .when()
                .post("https://petstore.swagger.io/v2/user")
                .then()
                .statusCode(200);
    }

    @Test
    public void UpdateUser(){
        Map<String, Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",123456790);
        bodyPayload.put("username","tester123456");
        bodyPayload.put("firstName","test212");
        bodyPayload.put("lastName","test2");
        bodyPayload.put("email","test@mail.com");
        bodyPayload.put("password","test123");
        bodyPayload.put("phone","123456");
        bodyPayload.put("userStatus",1);


        RestAssured
                .given()
                .contentType("application/json")
                .body(bodyPayload)
                .when()
                .put("https://petstore.swagger.io/v2/user/tester1234")
                .then()
                .statusCode(200);

    }

    //Silme işlemi yapılmış user'ın güncellenmesine  izin vermektedir(hata)

    @Test
    public void DeleteUser(){

        CreateUser();

        RestAssured
                .delete("https://petstore.swagger.io/v2/user/tester1234")
                .then()
                .statusCode(200);

    }

    @Test
    public void UserLogin(){

        Map<String,String> queryParamsValue=new HashMap<>();
        queryParamsValue.put("username","tester1234");
        queryParamsValue.put("password","test123");

        RestAssured
                .given()
                .queryParams(queryParamsValue)
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200);
    }

    @Test
    public void UserLogout(){
        RestAssured.get("https://petstore.swagger.io/v2/user/logout")
                .then()
                .statusCode(200);
    }

    @Test
    public void UserCreateWithArray(){
        String payload="[\n" +
                "  {\n" +
                "    \"id\": 312123,\n" +
                "    \"username\": \"testing\",\n" +
                "    \"firstName\": \"testing\",\n" +
                "    \"lastName\": \"test\",\n" +
                "    \"email\": \"mail@yok.com\",\n" +
                "    \"password\": \"123457\",\n" +
                "    \"phone\": \"05444444444\",\n" +
                "    \"userStatus\": 1\n" +
                "  }\n" +
                ",\n" +
                "{\n" +
                "    \"id\": 3121231,\n" +
                "    \"username\": \"testing1\",\n" +
                "    \"firstName\": \"testing1\",\n" +
                "    \"lastName\": \"test1\",\n" +
                "    \"email\": \"mail1@yok.com\",\n" +
                "    \"password\": \"1234571\",\n" +
                "    \"phone\": \"054444444441\",\n" +
                "    \"userStatus\": 2\n" +
                "  }\n" +
                "\n" +
                "]";

        RestAssured
                .given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("https://petstore.swagger.io/v2/user/createWithArray")
                .then()
                .statusCode(200);

    }

    @Test
    public void UserCreateWithList(){
        String payload="[\n" +
                "  {\n" +
                "    \"id\": 312123,\n" +
                "    \"username\": \"testing\",\n" +
                "    \"firstName\": \"testing\",\n" +
                "    \"lastName\": \"test\",\n" +
                "    \"email\": \"mail@yok.com\",\n" +
                "    \"password\": \"123457\",\n" +
                "    \"phone\": \"05444444444\",\n" +
                "    \"userStatus\": 1\n" +
                "  }\n" +
                ",\n" +
                "{\n" +
                "    \"id\": 3121231,\n" +
                "    \"username\": \"testing1\",\n" +
                "    \"firstName\": \"testing1\",\n" +
                "    \"lastName\": \"test1\",\n" +
                "    \"email\": \"mail1@yok.com\",\n" +
                "    \"password\": \"1234571\",\n" +
                "    \"phone\": \"054444444441\",\n" +
                "    \"userStatus\": 2\n" +
                "  }\n" +
                "\n" +
                "]";

        RestAssured
                .given()
                .body(payload)
                .contentType("application/json")
                .when()
                .post("https://petstore.swagger.io/v2/user/createWithList")
                .then()
                .statusCode(200);

    }
}
