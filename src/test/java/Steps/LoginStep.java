package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage()  {
    }


    @And("^I click login button$")
    public void iClickLoginButton(){

    }

    @And("^I enter the f ollowing for Login$")
    public void iEnterTheFOllowingForLogin(DataTable table) {

/*
        List<List<String>> data = table.raw();
*/

       /* System.out.println("The Value is " +  data.get(0).get(0).toString());
        System.out.println("The Value is " + data.get(0).get(1).toString());
*/

        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The UserName is" + user.username);
            System.out.println("The UserName is" + user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("Username is : " + userName );
        System.out.println("Password is : " + password );
    }

    public class User
    {
        public  String username;
        public  String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }


}
