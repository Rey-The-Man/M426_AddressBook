package ch.bbw.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
	
	@Test
	public void testReadAll() {
		AddressService as = new AddressService();
		as.storeAddress(new Address(1, "Luca", "supi", "00011"));
		
		List<Address> list = as.getAllAddresses();
		assertTrue("Test Read All", list.get(1).getFirstname().equals("Luca"));
	}
	
}
