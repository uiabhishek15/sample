package com.uninsured.data.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class RIPLU implements Serializable{

	private static final long serialVersionUID = 8902406142509387970L;

	@Field("38 of poverty")
	private String _38_of_poverty;
	
	@Field("38 of poverty MOE")
	private String _38_of_poverty_MOE;

	@Field("38 of poverty - Uninsured")
	private String _38_of_poverty_Uninsured;
	
	@Field("38 of poverty - Uninsured MOE")
	private String _38_of_poverty_Uninsured_MOE;
	
	@Field("38 of poverty - Uninsured Pct")
	private String _38_of_poverty_Uninsured_Pct;
	
	@Field("38 of poverty - Uninsured Pct MOE")
	private String _38_of_poverty_Pct_MOE;

	public String get_38_of_poverty() {
		return _38_of_poverty;
	}

	public void set_38_of_poverty(String _38_of_poverty) {
		this._38_of_poverty = _38_of_poverty;
	}

	public String get_38_of_poverty_MOE() {
		return _38_of_poverty_MOE;
	}

	public void set_38_of_poverty_MOE(String _38_of_poverty_MOE) {
		this._38_of_poverty_MOE = _38_of_poverty_MOE;
	}

	public String get_38_of_poverty_Uninsured() {
		return _38_of_poverty_Uninsured;
	}

	public void set_38_of_poverty_Uninsured(String _38_of_poverty_Uninsured) {
		this._38_of_poverty_Uninsured = _38_of_poverty_Uninsured;
	}

	public String get_38_of_poverty_Uninsured_MOE() {
		return _38_of_poverty_Uninsured_MOE;
	}

	public void set_38_of_poverty_Uninsured_MOE(String _38_of_poverty_Uninsured_MOE) {
		this._38_of_poverty_Uninsured_MOE = _38_of_poverty_Uninsured_MOE;
	}

	public String get_38_of_poverty_Uninsured_Pct() {
		return _38_of_poverty_Uninsured_Pct;
	}

	public void set_38_of_poverty_Uninsured_Pct(String _38_of_poverty_Uninsured_Pct) {
		this._38_of_poverty_Uninsured_Pct = _38_of_poverty_Uninsured_Pct;
	}

	public String get_38_of_poverty_Pct_MOE() {
		return _38_of_poverty_Pct_MOE;
	}

	public void set_38_of_poverty_Pct_MOE(String _38_of_poverty_Pct_MOE) {
		this._38_of_poverty_Pct_MOE = _38_of_poverty_Pct_MOE;
	}
	
	
}
