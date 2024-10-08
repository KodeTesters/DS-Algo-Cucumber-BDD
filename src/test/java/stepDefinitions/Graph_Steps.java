
package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Graph_Page;
import utilities.LoggerLoad;

public class Graph_Steps {
    Graph_Page graph=new Graph_Page();

    @When("user clicks on Graph getstarted")
    public void user_clicks_on_graph_getstarted() {
        graph.getStarted();
        LoggerLoad.info("User Clicked on Graph Get Started link");

    }

    @Given("User is on the Graph page")
    public void user_is_on_the_graph_page() {
        graph.navigateToGraphPage();
        LoggerLoad.info("User is on the Graph Page");
    }

    @When("User clicks on Graph Link in Graph Page")
    public void user_clicks_on_graph_link_in_graph_page() {
        graph.clickOnGraphLink();
    }


    @Given("User navigates to the Graph Graph page")
    public void user_navigates_to_the_graph_graph_page() {
        graph.navigateToGraphGraphPage();
    }

    @When("User clicks on Graph Representation in Graph Page")
    public void user_clicks_on_graph_representation_in_graph_page() {
        graph.clickOnGraphRepresentationsLink();
    }

    @Given("User navigates to the Graph Representations page")
    public void user_navigates_to_the_graph_representations_page() {
        graph.navigateToGraphRepresentationsPage();
    }

    @When("User clicks on Graph Practice Questions link")
    public void user_clicks_on_graph_practice_questions_link() {
        graph.clickOnGraphPracQuesLink();
    }

    @Then("User redirected to Graph {string} page")
    public void user_redirected_to_graph_page(String string) {
        LoggerLoad.info("The User redirected to " + string + "Page");
        String title = graph.getGraphPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, string);

    }
    @When("User clicks on signout")
    public void user_clicks_on_signout() {
        graph.logout();

    }

    @Then("Message displayed LoggedOut Successfully")
    public void message_displayed_logged_out_successfully() {
        graph.successLogout();

    }

}