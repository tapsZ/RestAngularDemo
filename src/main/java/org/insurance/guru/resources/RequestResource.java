package org.insurance.guru.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.insurance.guru.model.Request;
import org.insurance.guru.service.RequestService;

@Path("/requests")
public class RequestResource {
	
	RequestService requestService=new RequestService();

@GET
@Produces(MediaType.APPLICATION_XML)
public List<Request> getRequests(){
	return (List<Request>) requestService.getAllRequests();
	
}

@GET
@Path("/{requestNo}")
@Produces(MediaType.APPLICATION_XML)
public Request getRequest(@PathParam("requestNo") long requestNo){
	return  requestService.getRequest(requestNo);
}


}
