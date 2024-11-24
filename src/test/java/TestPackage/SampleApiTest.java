package TestPackage;


import Api.BaseTest;
import Api.DummyApiService;
import Api.FakeApiService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleApiTest extends BaseTest {
    private FakeApiService fakeApiService;
    private DummyApiService dummyApiService;


    @BeforeClass
    public void setupServices() {
        fakeApiService = new FakeApiService(fakeApi);
        dummyApiService = new DummyApiService(dummyApi);


    }

    @Test
    public void testGetUsers() {
        Response response = fakeApiService.getUsers();
        String userresponse=response.asString();
        Assert.assertEquals(response.statusCode(), 200, "Expected status code 200.");
        Assert.assertTrue(response.time() < 2000, "Response time exceeded 2 seconds.");
        System.out.println("Users: " + response.asPrettyString());
        Assert.assertTrue(userresponse.contains("id"));
        Assert.assertTrue(userresponse.contains("name"));
        Assert.assertTrue(userresponse.contains("email"));


    }

    @Test
    public void testGetCompanies() {
        Response response = fakeApiService.getCompanies();

        // Assertions
        Assert.assertEquals(response.statusCode(), 200, "Expected status code 200.");
        Assert.assertTrue(response.time() < 2000, "Response time exceeded 2 seconds.");
        System.out.println("COMPANIES: " + response.asPrettyString());


    }

    @Test
    public void testGetTodos() {
        Response response = dummyApiService.getTodos();

        // Assertions
        Assert.assertEquals(response.statusCode(), 200, "Expected status code 200.");
        Assert.assertTrue(response.time() < 2000, "Response time exceeded 2 seconds.");
        System.out.println("TODOS: " + response.asPrettyString());

    }

    @Test
    public void testGetPosts() {
        Response response = dummyApiService.getPosts();

        // Assertions
        Assert.assertEquals(response.statusCode(), 200, "Expected status code 200.");
        Assert.assertTrue(response.time() < 2000, "Response time exceeded 2 seconds.");
        System.out.println("POSTS: " + response.asPrettyString());

    }

    @Test
    public void testGetContinents() {
        Response response = dummyApiService.getContinents();

        // Assertions
        Assert.assertEquals(response.statusCode(), 200, "Expected status code 200.");
        Assert.assertTrue(response.time() < 2000, "Response time exceeded 2 seconds.");
        System.out.println("CONTINENTS: " + response.asPrettyString());

    }
}
