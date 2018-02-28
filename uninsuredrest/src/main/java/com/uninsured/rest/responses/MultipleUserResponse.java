package com.uninsured.rest.responses;

import java.util.List;

import com.uninsured.data.entity.User;


public class MultipleUserResponse {
	
	private boolean success;
	private List<User> tutors;
	
	public MultipleUserResponse(boolean success,List<User> tutors){
		this.success = success;
		this.setTutors(tutors);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<User> getTutors() {
		return tutors;
	}

	public void setTutors(List<User> tutors) {
		this.tutors = tutors;
	}

}
