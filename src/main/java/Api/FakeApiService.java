package Api;

import com.shaft.driver.SHAFT;
import io.restassured.response.Response;

public class FakeApiService {
    private final SHAFT.API api;

    public FakeApiService(SHAFT.API api) {
        this.api = api;
    }

    public Response getUsers() {
        return api.get(Endpoints.USERS).perform();
    }

    public Response getCompanies() {
        return api.get(Endpoints.COMPANIES).perform();
    }
}
