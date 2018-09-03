package example.project;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//import project.BaseUtil;
import utils.Configuration;

/**
 * Hello world!
 *
 */
public class App extends BaseUtil
{
	private BaseUtil base;
	//static String value;
	
	public App(BaseUtil base) {
		this.base = base;
		//value = base.stepinfo;
	}
	
	@Given("^I navigate to the login page$")
    public void read2()
    {
		System.out.println("I am in background");
        
    }
	
	@Given("^Read data from config$")
    public void read()
    {
		
		//System.out.println("value of pio = "+value);
		System.out.println("value of pio = "+base.stepinfo);
		
        System.out.println( "Hello World!" );
        System.out.println(Configuration.getConfigurationValueForProperty("env"));
        
    }
	
	//use (?:.*?) to avoid creating extra variables
	@Given("^the user (.*?) looks up the definition of the word (?:.*?) and (.*?) and (?:.*?) and (.*?)$")
	public void when(String name,String test,String name2){
	  System.out.println("myname ="+name);
	  System.out.println("test ="+test);
	  System.out.println("name2 ="+name2);
	}
}
