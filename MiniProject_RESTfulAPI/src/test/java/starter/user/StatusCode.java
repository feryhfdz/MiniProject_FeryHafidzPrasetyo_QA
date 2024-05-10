package starter.user;

import net.serenitybdd.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class StatusCode {
    @Step("I receive status code 200 OK response")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive status code 404 Not Found response")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive status code 400 Bad Request")
    public void receiveStatusCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }
}