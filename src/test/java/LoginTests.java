import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTests {

    @BeforeClass
    public void preCondition(){
        //open browser
        //open site
    }

    public void loginSuccess(){
        // open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    public void loginWrongEmail(){
        // open form (find element + click)
        //fill form (find element + click + clear + type)
        //submit form (find element + click)

    }
    public void loginWrongPassword(){
        // open form (find element + click)
        //fill form (find element + click + clear + type)
        //submit form (find element + click)

    }
    public void loginUnregisteredUser(){
        // open form (find element + click)
        //fill form (find element + click + clear + type)
        //submit form

    }

    @AfterClass
    public void postCondition(){
        // close browser
    }
}
