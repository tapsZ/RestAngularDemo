package org.insurance.guru.database;

import java.util.HashMap;
import java.util.Map;

import org.insurance.guru.model.Member;
import org.insurance.guru.model.Message;
import org.insurance.guru.model.Request;

public class DatabaseExample {

	private static Map<Long, Request> requests= new HashMap();
	private static Map<Long, Member> members= new HashMap();
	
	public static Map<Long, Request> getRequests(){
		return requests;
	}
		public static Map<Long, Member> getMembers(){
			return members;
	}
}
