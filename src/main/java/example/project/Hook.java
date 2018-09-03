package example.project;

import Base.BaseUtil;
import cucumber.api.java.Before;

public class Hook extends BaseUtil  {

	private BaseUtil base;
	
	public Hook(BaseUtil base) {
		// TODO Auto-generated constructor stub
		this.base = base;
	}
	
	@Before
	public void testpiocontainer() {
		//base.stepinfo="testning piocontainer";
		System.out.println("In hook class");
		base.stepinfo="testing poi containers";
	}
	
	@Before("@testtag1")
	public void runonlyForTag() {
		//base.stepinfo="testning piocontainer";
		System.out.println("runonlyForTag");

	}
	
	@Before("@testtag1 and not @testtag2")
	public void runonlyForTagwithNot() {
		//base.stepinfo="testning piocontainer";
		System.out.println("runonlyForTag - testtag1");

	}
}
