package org.insurance.guru.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.insurance.guru.model.Request;
import org.insurance.guru.service.RequestService;

@Path("/requests")
@Produces(MediaType.APPLICATION_JSON)
public class RequestResource {
	
	RequestService requestService=new RequestService();

@GET

public List<Request> getRequests(){
	return (List<Request>) requestService.getAllRequests();
	
}

@GET
@Path("/{requestNo}")
public Request getRequest(@PathParam("requestNo") long requestNo){
	return  requestService.getRequest(requestNo);
}

@POST
@Produces(MediaType.APPLICATION_JSON)
public Request addRequest(Request request){
	return requestService.addRequest(request);
}

}
