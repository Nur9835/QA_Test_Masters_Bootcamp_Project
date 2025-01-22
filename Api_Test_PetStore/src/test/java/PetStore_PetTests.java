import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.notNullValue;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PetStore_PetTests {

    @Test
    public void GetPetInfo(){
        CreatePet();
        RestAssured
                .get("https://petstore.swagger.io/v2/pet/101");

    }

    @Test
    public void GetFindByStatus(){

        Map<String,String> queryParamsValue=new HashMap<>();
        queryParamsValue.put("status","available");
        RestAssured
                .given()
                .queryParams(queryParamsValue)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200);
    }

    @Test
    public void CreatePet(){
        String bodyPayload="{\n" +
                "  \"id\": 101,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"deneme\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"denemeurl\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 10,\n" +
                "      \"name\": \"deneme\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Map<String,String> header=new HashMap<>();
        header.put("accept","application/json");
        header.put("Content-Type","application/json");

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers(header)
                .body(bodyPayload)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200);
    }

    @Test
    public void UploadPet(){
        String bodyPayload="{\n" +
                "  \"id\": 101,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"denemeyeni\"\n" +
                "  },\n" +
                "  \"name\": \"doggieyeni\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"denemeurlyeni\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"deneyeni\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Map<String,String> header=new HashMap<>();
        header.put("accept","application/json");
        header.put("Content-Type","application/json");

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers(header)
                .body(bodyPayload)
                .when()
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200);
    }

    @Test
    public void UploadPet2(){


        Map<String,String> header=new HashMap<>();
        header.put("accept","application/json");
        header.put("Content-Type","application/x-www-form-urlencoded");

        RestAssured
                .given()
                .headers(header)
                .formParam("name", "denemeyeni2") // Form-data parametreleri
                .formParam("status", "availableyeni") // Form-data parametreleri
                .when()
                .post("https://petstore.swagger.io/v2/pet/101")
                .then()
                .statusCode(200);
    }

    @Test
    public void UploadPetImage(){

        Map<String,String> header=new HashMap<>();
        header.put("accept","application/json");
        File file = new File("");
        RestAssured
                .given()
                .header("accept", "application/json")
                .header("Content-Type", "multipart/form-data")
                .multiPart("file", file) // Dosya yükleme
                .when()
                .post("https://petstore.swagger.io/v2/pet/101/uploadImage")
                .then()
                .statusCode(200);
    }


    @Test
    public void DeletePet(){
        CreatePet();
        RestAssured
                .delete("https://petstore.swagger.io/v2/pet/101")
                .then()
                .statusCode(200);

    }



}
