package ch.bbw.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.addressbook.Address;
import ch.bbw.addressbook.AddressService;

public class TestService {

	@Before
	public void setup() {
	}

	@Test
	public void test1() {
		AddressService as = new AddressService();
		assertTrue("Test Service",  as != null);
	}
	
}
