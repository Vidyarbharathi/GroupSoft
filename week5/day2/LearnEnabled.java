package testng;

import org.testng.annotations.Test;

public class LearnEnabled {

	@Test(enabled = false,priority = -1)
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test
	public void editLead() {
		System.out.println("editlead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicatelead");
	}
}
