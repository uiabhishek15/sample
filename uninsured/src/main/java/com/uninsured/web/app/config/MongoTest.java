package com.uninsured.web.app.config;


import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.uninsured.data.entity.User;


//@Component

public class MongoTest {
	
	
 

	public static void main(String[] args) {
		MongoOperations mongoOperations = MongoDBContextOperations.getMongoOperations();
		Query query = new Query();
		query.addCriteria(Criteria.where("County").regex("C$"));
		List<User> users = mongoOperations.find(query,User.class);
				System.out.println(users.size());
	
		
	}
}




