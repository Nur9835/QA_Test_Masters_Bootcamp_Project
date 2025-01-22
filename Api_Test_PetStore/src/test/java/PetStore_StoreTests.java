import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PetStore_StoreTests {

    @Test
    public void GetStoreInventory(){
        RestAssured.get("https://petstore.swagger.io/v2/store/inventory");
    }

    @Test
    public void Createorder(){

        //orderID kısmında get/store/orrderId 'de 10 dan fazla ID numarası kabul etmemesine rağmen
        //CreateOrder durumunda orderID 10'dan fazla değer vermemizi engellememektedir(hata)
        String bodyPayload="{\n" +
                "  \"id\": 5,\n" +
                "  \"petId\": 101,\n" +
                "  \"quantity\": 10,\n" +
                "  \"shipDate\": \"2025-01-08T22:41:20.523Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
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
                .post("https://petstore.swagger.io/v2/store/order")
                .then()
                .statusCode(200);
    }

    @Test
    public void Getorder(){
        Createorder();

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/store/order/5")
                .then()
                .statusCode(200);
    }

    @Test
    public void DeleteUser(){
        Createorder();
        RestAssured
                .delete("https://petstore.swagger.io/v2/store/order/5")
                .then()
                .statusCode(200);

    }
}
