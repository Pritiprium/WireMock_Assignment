package com.Test_API;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.Urls;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class TestBase {
	
	public   Response response;
	public WireMockServer wiremockserver;
		
	@BeforeSuite
	public void serversertup() {
		wiremockserver = new WireMockServer(options().port(9090));
		wiremockserver.start();
		System.out.println("wiremock server started >>> "+wiremockserver.port());
			
	}
	
	@AfterSuite
	public void teardown() {
		wiremockserver.stop();
	}
}
