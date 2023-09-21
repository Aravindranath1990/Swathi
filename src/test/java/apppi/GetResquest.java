package apppi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetResquest {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification resp = RestAssured.given();
	
		
		//String payload = "{\r\n"+"  \"email\": \"eve.holt@reqres.in\",\r\n"
				//+    "\"password\":\"pistol\"\r\n"+"}";
		//resp.contentType(ContentType.JSON);
		//resp.body(payload);
		Response post = resp.get();
		int statusCode = post.getStatusCode();
		String asString = post.getBody().asString();
		System.out.println(statusCode+"  "+asString);
		
		
	}

}
