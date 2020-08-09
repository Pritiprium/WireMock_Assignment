package com.Test_API;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class TestBase {
	
	public   Response response;
	@BeforeSuite
	public void serversertup() {	
	String hostName = "http://localhost:8081";
	String URI = "/car_list_details";
	String URL = hostName + URI;
	RestAssured.baseURI = URL;
	RestAssured.defaultParser = Parser.JSON;
	response = RestAssured.given().contentType("application/json").get();
	System.out.println(response.asString());
	System.out.println(response.statusCode());
	}
}
