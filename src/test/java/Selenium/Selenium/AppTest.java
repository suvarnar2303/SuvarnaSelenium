package Selenium.Selenium;

import static org.testng.Assert.assertTrue;

import org.testng.ITest;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * @return the suite of tests being tested
     */
    public static ITest suite()
    {
        return (ITest) new XmlSuite( );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
