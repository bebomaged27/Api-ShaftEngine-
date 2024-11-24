package Api;

import com.shaft.driver.SHAFT;
import io.restassured.response.Response;


public class DummyApiService {
    private final SHAFT.API api;

    public DummyApiService(SHAFT.API api) {
        this.api = api;
    }

    public Response getTodos() {
        return api.get(Endpoints.TODOS).perform();
    }

    public Response getPosts() {
        return api.get(Endpoints.POSTS).perform();
    }

    public Response getContinents() {
        return api.get(Endpoints.CONTINENTS).perform();
    }
}