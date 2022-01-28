package resassured1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static  io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Get1 {
	
	
	@BeforeClass()
		public void bf1() {
			RestAssured.useRelaxedHTTPSValidation();
		}
		
	
	
	
	@Test(enabled=false)
	public void getmethod() {
	
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[2]",equalTo(9)).
		body("data.first_name",hasItems("Gehjhrge"));
	
	}
	
	/*
	@Test(dataProvider="dppost")
	public void post1(String uname,String ujob) {
		
		JSONObject js=new JSONObject();
		
		js.put("name", uname);
		js.put("job", ujob);
		
		
		given().body(js.toJSONString()).
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);
	}
	
	@DataProvider(name="dppost")
    public Object[][] employee1(){
		
		Object[][] t1=new Object[][] {
				{"sri","singer"},
				{"raj","associate director"},
				{"kamal","director"}
				
		};
		
		return t1;
		
	}*/
	
	
	@Test
	public void delete1() {
		
		given().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204);
	}
	

}
