package com.uninsured.web.app.config;


import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.uninsured.data.entity.User;

public class MongoTest {
	
	/*  public static String random(int size) {

	        StringBuilder generatedToken = new StringBuilder();
	        try {
	            SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
	            // Generate 20 integers 0..20
	            for (int i = 0; i < size; i++) {
	                generatedToken.append(number.nextInt(9));
	            }
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }

	        return generatedToken.toString();
	    }*/

public static void main(String[] args) throws Exception {
		
		MongoOperations mongoOperations = MongoDBContextOperations.getMongoOperations();
		Query query = new Query();
		query.addCriteria(Criteria.where("County").regex("a$", "i"));
		List<User> users = mongoOperations.find(query,User.class);
				System.out.println(users);
				for (User tutor : users) {
					System.out.println(tutor.getCounty());
				}
				
				String as = "Erie";
				Query query1 = new Query();
				query1.addCriteria(Criteria.where("County").regex("^"+as, "i"));
				List<User> users1 = mongoOperations.find(query1,User.class);
						System.out.println(users1);
						for (User tutor : users1) {
							System.out.println(tutor.getCounty());
						}
		/*Query query = new Query();
		query.addCriteria(Criteria.where("email").is("a@gmail.com"));

		Update update = new Update();
		update.set("otp", "156151");
		//update.set("description", tutor.getDesc());
		//update.set("price", tutor.getPriceRangePerHour());

		mongoOperations.updateFirst(query, update, Tutor.class);
		System.out.println("156151");*/
	/*	Criteria criteria = new Criteria();
		 Criteria priceCriteria = where("priceRangePerHour").gt("100").andOperator(where("priceRangePerHour").lt("300"));
		criteria.orOperator(Criteria.where("experience").is("2"),Criteria.where("qualification").is("Btech"),Criteria.where("subjectList").is("SQL/PLSQL")
				,Criteria.where("pincode").is("502032"),Criteria.where("lessonLocationList").is("Tutor's Location"),
				Criteria.where("priceRangePerHour").gt("100").andOperator(where("priceRangePerHour").lt("300")));
        Query query = new Query(criteria);
		List<Tutor> sortTutorListByPrice = mongoOperations.find(query, Tutor.class, "tutor");
		System.out.println(sortTutorListByPrice);
		
		for (Tutor tutor : sortTutorListByPrice) {
			System.out.println(tutor.getTutorName());
		}*/
		
		 /*URL oracle = new URL("http://localhost:8080/spytutorsrest/login/"+"ddfs"+"/"+"adsa");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();*/
		//final String TUTOR_COLLECTION_NAME = "tutors"; 
		
		//MongoOperations mongoOperations = MongoDBContextOperations.getMongoOperations(); 
		
			/*List<Tutor> restaurantList =  mongoOperations.findAll(Tutor.class);
			System.out.println(restaurantList);
			for (Tutor restaurant : restaurantList) {
				System.out.println(restaurant.getTutorName());
			}*/
		
	/*	Criteria criteria = new Criteria();
		criteria.andOperator(Criteria.where("email").is("a@gmail.com"),Criteria.where("password").is("ubhuybuhb"));
        Query query = new Query(criteria);
		if(mongoOperations.findOne(query, Tutor.class) != null) {
			System.out.println("bcbcbbcr");
		}
        else
        {
        	System.out.println("dcde");
        }
		*/
		String county = "Clearfield";
		/*List<Tutor> restaurantList =  mongoOperations.findAll(Tutor.class);
		

		for (Tutor restaurant : restaurantList) {
			System.out.println(restaurant.getPopulation_18to64years_Uninsured());
			Query query1 = new Query(Criteria.where("Population - 18 to 64 years - Uninsured").is("15047"));
			Tutor tutor = mongoOperations.findOne(Query.query(Criteria.where("County").is(county)), Tutor.class);
			System.out.println("Population is:---"+tutor);
		}*/
		
		/*Criteria criteria = new Criteria();
		criteria.where("Population").is("76508");
        Query query = new Query(criteria);
		if(mongoOperations.findOne(query, Tutor.class) != null) {
			System.out.println(mongoOperations.findOne(query, Tutor.class).getCounty());
		}
        else
        {
        	System.out.println("dcde");
        }
		final String TUTOR_COLLECTION_NAME = "user";
		List<Tutor> getAllTutorsList= mongoOperations.findAll(Tutor.class);
		System.out.println("Size is:---"+getAllTutorsList.size());
		for (Tutor restaurant : getAllTutorsList) {
			
			System.out.println("Population is:---"+restaurant.getCounty());
			
			
		}
		
		System.out.println(getAllTutorsList);*/
			//System.out.println(output.getMappedResults());
/*		Query query1 = new Query(Criteria.where("County").is("Clearfield"));
		 System.out.println(mongoOperations.findOne(query1, Tutor.class));
		 System.out.println("Population is:"+mongoOperations.findOne(query1, Tutor.class).getPopulation());*/
		/*query1.addCriteria(Criteria.where("tutorName").is("abhishek"))
		Update update = new Update();
		List<Reviews> reviews = new ArrayList<Reviews>(0);
		//for (Reviews review : tutorDTO.getSelectedSubjectList()) {.
		Reviews review = new Reviews();
		review.setComment("he is very good tutor");
		review.setAddress("abh");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		review.setSchedule(dateFormat.format(date));
		review.setStudentName("fvfvvbtvt");
		reviews.add(review);
		System.out.println(reviews);
		//res.setReviews(reviews);
		update.set("reviews", reviews);
		mongoOperations.updateFirst(query1, update, Tutor.class);*/
		
		/*Tutor res = new Tutor();
		res.setTutorName("krishna");
		res.setDesc("krishna is a tutor");
		res.setExperience("2");
		res.setPriceRangePerHour("400");
		res.setAddress("fvtvhgvghvghvhvh");
		res.setPassword("ubhuybuhb");
		res.setPhonenumber("7095639836");
		res.setPincode("520011");
		List<String> availableDayList = new ArrayList<>();
		availableDayList.add("monday");
		res.setAvailableDayList(availableDayList);
		List<String> availableTimeList = new ArrayList<>();
		availableTimeList.add("10:00PM");
		res.setAvailableDayList(availableTimeList);
		List<String> lessonLocationList = new ArrayList<>();
		lessonLocationList.add("online");
		res.setAvailableDayList(lessonLocationList);
		List<String> qualification = new ArrayList<>();
		qualification.add("Btech");
		List<String> subjects = new ArrayList<>();
		subjects.add("Android");
		res.setSubjectList(subjects);
		res.setAvailableDayList(qualification);
		res.setExperience("5");
		res.setEmail("venkatakrishnaabhi@gmail.com");
		res.setGoals("dcnfdbfhd");
		res.setRating("3.0");
		List<Reviews> reviews = new ArrayList<Reviews>(0);
		//for (Reviews review : tutorDTO.getSelectedSubjectList()) {
		Reviews review = new Reviews();
		review.setComment("he is very good tutor");
		review.setAddress("Vijayawada");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		review.setSchedule(dateFormat.format(date));
		review.setStudentName("abhi");
		reviews.add(review);
		System.out.println(reviews);
		res.setReviews(reviews);
		mongoOperations.save(res);
		*/
	/*	String exp = "5";
		String qu="B.Tech";
		Criteria criteria = new Criteria();
		criteria.andOperator(Criteria.where("experience").is(exp),Criteria.where("qualification").is(qu));
        Query query = new Query(criteria);
		List<Tutor> sortTutorListByPrice = mongoOperations.find(query, Tutor.class, "tutor");
		for (Tutor tutor : sortTutorListByPrice) {
			System.out.println(tutor.getTutorName());
		}*/
		
		
		/*Query query = new Query();
		//query5.addCriteria(Criteria.where("age").gte(30));
		query.with(new Sort(Sort.Direction.ASC, "priceRangePerHour"));
		List<Tutor> allTutorList = mongoOperations.findAll(Tutor.class);
		List<Tutor> userTest5 = mongoOperations.find(query, Tutor.class);
		for (Tutor tutor : allTutorList) {
			userTest5.add(tutor);
		}
		System.out.println(userTest5);*/
		
/*		Query query5 = new Query();
		//query5.addCriteria(Criteria.where("age").gte(30));
		query5.with(new Sort(Sort.Direction.ASC, "priceRangePerHour"));

		List<Tutor> userTest5 = mongoOperations.find(query5, Tutor.class);
		System.out.println("query5 - " + query5.toString());

		for (Tutor user : userTest5) {
			System.out.println("userTest5 - " + user.getPriceRangePerHour());
		}*/
		/*private BasicDBList mapCars(List<Car> cars) {
		  BasicDBList result = new BasicDBList();
		  for (Car car: cars) {
		    BasicDBObject dbCar = new BasicDBObject();
		    dbCar.append("name", car.getName());
		    result.add(dbCar);
		  }

		  return result;
		}*/
				
		/*	
		List<Restaurant> restaurantList = mongoOperations.findAll(Restaurant.class);		
		List<FoodType> foodTypeList = new ArrayList<FoodType>(0);
		
		for (Restaurant restaurant : restaurantList) {			
			if(restaurant.getCity().getCityName().equalsIgnoreCase("podili")){				
				System.out.println(restaurant.getName());
				foodTypeList.addAll(restaurant.getFoodTypeList());
			}			
		}
	
		for (FoodType foodType : foodTypeList) {
			System.out.println("\t"+foodType.getDesc());
		}	

		*/
		/*MongoClientURI uri  = new MongoClientURI("mongodb://scott:tiger@ds023325.mlab.com:23325/yuppmeal"); 
        MongoClient client = new MongoClient(uri);
        DB db = client.getDB(uri.getDatabase());
        System.out.println(db.getCollectionNames());*/
            
   
		
	}

}
