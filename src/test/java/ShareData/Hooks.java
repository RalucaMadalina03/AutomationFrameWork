package ShareData;

import Logger.LoggerUtility;
import ProprietyUtility.ProprietyUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData {
    public HashMap<String, String> testData;
    public String testName;


    @BeforeMethod
    public void prepareEnviroment(){

        testName = this.getClass().getSimpleName();
        ProprietyUtility proprietyUtility = new ProprietyUtility(testName);
        testData = proprietyUtility.getAllData();
        LoggerUtility.startTestCase(testName);
        setup(); // apare metoda de setup fiindca avem extends ShareData
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        else {
            clear();  // tot asa, apare clear fiindca avem extends ShareData
            LoggerUtility.endTestCase(testName); //apelam METODA STATICA pentru log-uri, nu avem nevoie de obiect

            //adaugam un listener pe statusul testului pentru a ne ajuta sa printam in log-uri eroare daca apare
        }
    }
    @AfterSuite
    public void finnishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }
}
