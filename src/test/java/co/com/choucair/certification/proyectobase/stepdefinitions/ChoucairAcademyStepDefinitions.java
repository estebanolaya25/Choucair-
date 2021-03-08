package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyctobase.model.AcademyChocairData;
import co.com.choucair.certification.proyctobase.questions.Answer;
import co.com.choucair.certification.proyctobase.tasks.Login;
import co.com.choucair.certification.proyctobase.tasks.OpenUp;
import co.com.choucair.certification.proyctobase.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChocairData> academyChocairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChocairData.get(0).getStrUser(), academyChocairData.get(0).getSrtPassword()));

    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChocairData> academyChocairData) throws Exception {
    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChocairData.get(0).getStrCourse()));

    }

    @Then("^he fins the course called resources$")
    public void heFinsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChocairData> academyChocairData) throws Exception {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChocairData.get(0).getStrCourse())));

    }

}
