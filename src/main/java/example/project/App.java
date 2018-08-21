package example.project;

import cucumber.api.java.en.Given;
import utils.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	@Given("^Read data from config$")
    public static void read()
    {
        System.out.println( "Hello World!" );
        System.out.println(Configuration.getConfigurationValueForProperty("env"));
        
    }
}
