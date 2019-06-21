package com.ee.userservice;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRestPactRunner.class)
@Provider("user_service")
//@PactFolder("../order-service/target/pacts")
@PactBroker(host = "broker_app", port = "8000", tags = {"latest", "DEV", "PROD"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {

    // TODO - Implement so that pact can be verified.
	@TestTarget
	public final Target traget = new SpringBootHttpTarget();
	
	@State("User Paresh exists")
	public void userPareshExist() {
		//sout
	}
}
