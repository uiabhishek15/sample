package com.uninsured.rest.responses;

import com.uninsured.data.entity.User;



public class SingleUserResponse {
	
	private boolean success;
	private User tutor;
	
	public SingleUserResponse(boolean success,User tutor){
		this.success = success;
		this.setTutor(tutor);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public User getTutor() {
		return tutor;
	}

	public void setTutor(User tutor) {
		this.tutor = tutor;
	}


}
