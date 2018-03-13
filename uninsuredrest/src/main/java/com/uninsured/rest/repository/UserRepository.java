package com.uninsured.rest.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.uninsured.data.entity.Admin;
import com.uninsured.data.entity.User;
import com.uninsured.web.app.config.MongoDBContextOperations;

@Repository
public class UserRepository {

	private static final Logger LOGGER = Logger.getLogger(UserRepository.class);

	MongoOperations mongoOperations = MongoDBContextOperations
			.getMongoOperations();
	

	public List<User> getAllUsersList() {
		List<User> getAllTutorsList= mongoOperations.findAll(User.class);
		return getAllTutorsList;

	}
	
	public List<User> searchCounty(String key) {
		Query query = new Query();
		query.addCriteria(Criteria.where("County").regex("^"+key, "i"));
		List<User> searchcounty = mongoOperations.find(query, User.class);
		return searchcounty;
	}

	public Boolean Login(String username, String password) {

		Criteria criteria = new Criteria();
		criteria.andOperator(Criteria.where("username").is(username),Criteria.where("password").is(password));
        Query query = new Query(criteria);
        Admin admin = mongoOperations.findOne(query, Admin.class);
        String dbPassword = admin.getPassword();
        if(mongoOperations.findOne(query, Admin.class) != null) {
			return true;
		}
        else
        {
        	return false;
        }

	}
}
