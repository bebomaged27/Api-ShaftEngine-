package Api;


import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected SHAFT.API fakeApi;
    protected SHAFT.API dummyApi;

    @BeforeSuite
    public void setup() {
        // Initialize the SHAFT API instances with base URLs
        fakeApi = new SHAFT.API("https://fake-json-api.mock.beeceptor.com/");
        dummyApi = new SHAFT.API("https://dummy-json.mock.beeceptor.com/");
    }


}

