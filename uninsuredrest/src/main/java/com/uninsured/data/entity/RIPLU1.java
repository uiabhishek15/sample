package com.uninsured.data.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class RIPLU1 implements Serializable{

	private static final long serialVersionUID = 7871399494547437052L;
	
	@Field("38 to 1")
	private RIPLU11 _38_to_1;

	public RIPLU11 get_38_to_1() {
		return _38_to_1;
	}

	public void set_38_to_1(RIPLU11 _38_to_1) {
		this._38_to_1 = _38_to_1;
	}
	
}
