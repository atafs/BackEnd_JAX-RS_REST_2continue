package pt.americolib.projWS_011_JAXB_objectToXml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.americolib.projWS_011_JAXB_objectToXml.object.Customer;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("ws")
public class MyResource {

	@GET
	@Path("/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {

		Customer customer = new Customer();
		customer.setName("mkyong");
		customer.setPin(pin);

		return customer;

	}
}
