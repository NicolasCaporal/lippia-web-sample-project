package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AddWorkTimeService;
import lippia.web.services.Utilities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AddWorkTimeSteps {
    private String entryDescription;


    @Given("^estoy en la sección TimeTracker")
    public void timeTracker() {
        AddWorkTimeService.clickTimeTracker();
    }


    @When("presiono Timer Mode")
    public void clickTimer() {
        AddWorkTimeService.clickTimer();
    }
    @When ("^ingreso una descripcion del trabajo")
    public void setDescription() {
        this.entryDescription = Utilities.timeStampName("test");
        AddWorkTimeService.setDescription(this.entryDescription);
    }

    @When("presiono el boton Start")
    public void clickStart() {
        AddWorkTimeService.clickStartButton();
    }

    @When("presiono el boton Stop")
    public void clickStop() {
        AddWorkTimeService.clickStopButton();
    }

    @Then("^crea la entrada de trabajo correctamente")
    public void checkTimeEntry() { AddWorkTimeService.checkTimeEntry(this.entryDescription); }

    @When("presiono Manual Mode")
    public void clickManual() {
        AddWorkTimeService.clickManual();
    }

    @When("presiono el boton Add")
    public void clickAdd() {
        AddWorkTimeService.clickAdd();
    }

    @When("^ingreso horario de inicio (.*)")
    public void setStartTime(String time){

        AddWorkTimeService.setStartTime(time);
    }

    @When("^ingreso horario de fin (.*)")
    public void setEndTime(String time){
        AddWorkTimeService.setEndTime(time);
    }

    @When("^ingreso fecha (.*)")
    public void setDate(String date){
        AddWorkTimeService.setDate(date);
    }

    @When("selecciono Discard")
    public void discardTimer(){
        AddWorkTimeService.clikOptions();
        AddWorkTimeService.clickDiscard();
        AddWorkTimeService.confirmDiscard();
    }

    @When("modifico la descripcion")
    public void editDescription(){
        AddWorkTimeService.changeDescription();

    }

    @When("presiono el boton Billable")
    public void clickBillable(){
        AddWorkTimeService.clickBillable();
    }

    @When("modifico la fecha de inicio y de fin")
    public void changeTime(){
        LocalDateTime actualTime = LocalDateTime.now();
        LocalDateTime actualTimeMinus90minutes = actualTime.minusMinutes(90);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        AddWorkTimeService.setStartTime(actualTimeMinus90minutes.format(formatter));
        AddWorkTimeService.setEndTime(actualTime.format(formatter)+"\n");
    }

    @When("asigno un proyecto nuevo")
    public void assignNewProject(){
        AddWorkTimeService.clickProject();
        AddWorkTimeService.clickCreateNewProject();
        AddWorkTimeService.setProjectName(Utilities.timeStampName("proyect"));
    }

}
