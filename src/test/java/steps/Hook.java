package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseUtil {
    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void setup() {
        System.out.println("Message Before Test");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
