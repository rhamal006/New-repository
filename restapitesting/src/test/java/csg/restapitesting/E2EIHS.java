package csg.restapitesting;


import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;

public class E2EIHS {
	


	public void resttesting()
	{

		
	RestAssured.baseURI = "https://services.sbx1.cdops.net";
	given().
	header("CD-SystemId","732c3bdd-5fc1-4a83-b27f-f643f8a665a9").
	header("CD-SessionId","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzaSI6IjczMmMzYmRkLTVmYzEtNGE4My1iMjdmLWY2NDNmOGE2NjVhOSIsImJ1IjoiMzAyIiwiaWQiOiJhYWQ2OTg1OS1lZWVlLTRlMTAtODEyMC05ZmM4NDU2M2Q4MjQiLCJsIjoiZW4tVVMiLCJkYyI6IjU2IiwidCI6IjIiLCJuYW1laWQiOiI3ODAwIiwiZyI6IkZhbHNlIiwibmFtZSI6IlJvc2hhbiBIYW1hbCIsInJvbGUiOlsiOSIsIjExIiwiMTIiLCIxMyIsIjY5IiwiNzEiLCI3MiIsIjczIiwiNzQiLCI3NSIsIjc2IiwiNzciLCI3OSIsIjgwIiwiMTAyIiwiMTExIiwiMTEyIiwiMTEzIiwiMTE1IiwiMTU1IiwiMTc0IiwiMTkzIiwiMTk0IiwiMTk1IiwiMjE2IiwiMTAwMCIsIjEwMjUiLCIxMDI2IiwiMTAyNyIsIjEwMjgiLCIxMDI5IiwiMTAzMCIsIjEwMzEiLCIxMDMyIiwiMTAzMyIsIjEwMzQiLCIxMDM1IiwiMTAzNyIsIjEwMzgiLCIxMDM5IiwiMTA0MCIsIjEwNDEiLCIxMDQyIiwiMTA0MyIsIjEwNDQiLCIxMDQ1IiwiMTA0NiIsIjEwNDciLCIxMDQ4IiwiMTA3NCIsIjEwNzUiLCIyMDE4IiwiMjAxOSIsIjIwMzEiLCIyMDk4IiwiMjA5OSIsIjIxMzciLCIyMTQxIiwiMjE1MyIsIjIxNTkiLCIyMTYwIiwiMjE2MSIsIjIxNjIiXSwiaXAiOiIxNTguMTU1LjAuNzMiLCJjbyI6IlVTQSIsImlzcyI6ImFzY2VuZG9uLnR2IiwiYXVkIjoiYXNjZW5kb24udHYiLCJleHAiOjE1NzQxNDg5NDIsIm5iZiI6MTU3NDEyMDE0Mn0.Y0r04lgji9xMnBnzGJNFa3uoB_Jz7DQp0Fq9E9lvIjs").
	header("Content-Type","application/json").
	body("{\r\n" + 
			"  \"Credentials\": {\r\n" + 
			"    \"Login\": \"Dishroshanitv3044\"\r\n" + 
			"  },\r\n" + 
			"  \"Subscriber\": {\r\n" + 
			"    \"ExternalReference\": \"DISHitvDBSS3044\",\r\n" + 
			"    \"Email\": \"DishITV1021@sharklasers.com\",\r\n" + 
			"    \"FirstName\": \"Dish\",\r\n" + 
			"    \"LastName\": \"1002\",\r\n" + 
			"    \"SubscriberTypeCode\": 10060\r\n" + 
			"  },\r\n" + 
			"  \"Addresses\": [\r\n" + 
			"    {\r\n" + 
			"      \"City\": \"Chicago\",\r\n" + 
			"      \"Country\": \"USA\",\r\n" + 
			"      \"LineOne\": \"33 w monroe\",\r\n" + 
			"      \"PostalCode\": \"60603\",\r\n" + 
			"      \"State\": \"IL\",\r\n" + 
			"      \"GeoCode\": \"00000000\",\r\n" + 
			"      \"Name\": \"Dish371\"\r\n" + 
			"    }\r\n" + 
			"  ]\r\n" + 
			"}\r\n" + 
			"").
	
	when().
	post("SubscriberManagement/CreateSubscriber").
	
	then().assertThat().statusCode(200);
	
	
	
	
		
		
	}

}
