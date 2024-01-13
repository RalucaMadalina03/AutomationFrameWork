package Tests;

import ObjectData.FormTableObject;
import Pages.Forms.FormsPage;
import Pages.Forms.PracticeForms;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

import java.util.List;

public class FormTableTest extends Hooks {
    @Test

    public void test_method(){

        FormTableObject formTableObject = new FormTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage= new FormsPage(getDriver());
        formsPage.clickForm();


        PracticeForms practiceForms = new PracticeForms(getDriver());
        practiceForms.fillPracticeForm(formTableObject);

        List<String> FormValues = practiceForms.getValuesForm();
        practiceForms.fillSubmit();



        practiceForms.clickClose();




    }
}
