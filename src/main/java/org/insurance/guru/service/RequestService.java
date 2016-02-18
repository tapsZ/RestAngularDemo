package org.insurance.guru.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.insurance.guru.database.DatabaseExample;
import org.insurance.guru.model.Member;
import org.insurance.guru.model.Request;

public class RequestService {

	private static Map<Long, Request> requests= DatabaseExample.getRequests();
	
	public RequestService(){
		requests.put(1L, new Request(1L, "Life", "This is My first Request", "Yes"));
		requests.put(2L, new Request(2L, "House", "This is the 2nd Request", "No"));
	}
	
	public List<Request> getAllRequests(){
		return new ArrayList<Request>(requests.values());
	}
	
	public Request getRequest(Long requestNo){
		return requests.get(requestNo);
	}
	
	public Request addRequest(Request request){
		request.setRequestNo(requests.size()+1);
		requests.put(request.getRequestNo(), request);
		return request;
	}
	
	public Request updateRequest(Request request){
		if (request.getRequestNo()<=0)
			{return null;}
		else{requests.put(request.getRequestNo(), request);}
		return request;
	}
	
	public Request removeRequest(Long requestNo){
		return requests.remove(requestNo);
	}
	
	
	
	/*public Member getAllMembers(){
	SessionFactory sessionfactory = Hibernate.getSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	
	Member member= (Member)session.get(Member.class,3);

	session.getTransaction().commit();
	session.close();
	
	return member;
	}*/
	
	
	
	
	
}

