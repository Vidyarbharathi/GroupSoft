package week5;

import org.testng.annotations.Test;

public class LearnDependonsOnMethods {

	@Test
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test
	public void editLead() {
		System.out.println("editlead");
	}
	@Test(dependsOnMethods = {"editLead"})
	public void duplicateLead() {
		System.out.println("duplicatelead");
	}
}
