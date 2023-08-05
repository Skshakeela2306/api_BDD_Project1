package gluecode;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Shared  //Hooks class
{
	//Common objects which are needed for all step definition classes
	public RequestSpecification req; //related to rest-assured
	public Response res; //related to rest-assured
	public Scenario s; //related to cucumber-java
	public static String name; //for data sharing between step-definition methods in various classes
	
	//before for every Scenario including "Background:" steps
	@Before
	public void method1(Scenario scobj) //"scobj" is object of currently running scenario
	{
		s=scobj;
		SimpleDateFormat sf=new SimpleDateFormat("hh/mm/ss dd/MMM/yyyy");
		Date d=new Date();
		s.log("Hi, "+s.getName()+" is going to run now-"+sf.format(d));
	}
	
	//after for every scenario
	@After
	public void method2(Scenario scobj)
	{
		s=scobj;
		s.log(s.getName()+" is "+s.getStatus().name());
	}	
}

