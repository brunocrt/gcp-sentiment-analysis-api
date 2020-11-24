package me.brunocrt.gcp.nlp;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

@QuarkusTest
public class SentimentResourceTest {

    @Test
    public void testEndpoint() {
        given()
          .when().get("/nlp/test")
          .then()
             .statusCode(200);
    }

    @Test
    public void testResponseEndpoint() {

        String text = "My life is good";

        given()
          .when().get("/nlp/sentiment?text="+text)
          .then()
             .statusCode(200)
             .body(containsStringIgnoringCase("score"));
    }

}