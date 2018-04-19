package unsafe.jaxrs;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/")
public class PoC_resource {

	@POST
	@Path("/concat")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({"*/*"})
	public Map<String, String> doConcat(Pair pair) {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("Result", pair.getP1() + pair.getP2());

		return result;
	}

	@POST
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Map<String, Integer> doCount(ArrayList<Object> elements) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		result.put("Result", elements.size());

		return result;
	}
	
}