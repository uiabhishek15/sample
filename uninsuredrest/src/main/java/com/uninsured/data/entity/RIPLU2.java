package com.uninsured.data.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class RIPLU2 implements Serializable {

	private static final long serialVersionUID = 6022670377856613029L;

	@Field("00 of poverty and over")
	private String _00_of_poverty_and_over;
	
	@Field("00 of poverty and over MOE")
	private String _00_of_poverty_and_over_MOE;

	@Field("00 of poverty and over - Uninsured")
	private String _00_of_poverty_and_over_Uninsured;
	
	@Field("00 of poverty and over - Uninsured MOE")
	private String _00_of_poverty_and_over_Uninsured_MOE;
	
	@Field("00 of poverty and over - Uninsured Pct")
	private String _00_of_poverty_and_over_Uninsured_Pct;
	
	@Field("00 of poverty and over - Uninsured Pct MOE")
	private String _00_of_poverty_and_over_Pct_MOE;

	public String get_00_of_poverty_and_over() {
		return _00_of_poverty_and_over;
	}

	public void set_00_of_poverty_and_over(String _00_of_poverty_and_over) {
		this._00_of_poverty_and_over = _00_of_poverty_and_over;
	}

	public String get_00_of_poverty_and_over_MOE() {
		return _00_of_poverty_and_over_MOE;
	}

	public void set_00_of_poverty_and_over_MOE(String _00_of_poverty_and_over_MOE) {
		this._00_of_poverty_and_over_MOE = _00_of_poverty_and_over_MOE;
	}

	public String get_00_of_poverty_and_over_Uninsured() {
		return _00_of_poverty_and_over_Uninsured;
	}

	public void set_00_of_poverty_and_over_Uninsured(
			String _00_of_poverty_and_over_Uninsured) {
		this._00_of_poverty_and_over_Uninsured = _00_of_poverty_and_over_Uninsured;
	}

	public String get_00_of_poverty_and_over_Uninsured_MOE() {
		return _00_of_poverty_and_over_Uninsured_MOE;
	}

	public void set_00_of_poverty_and_over_Uninsured_MOE(
			String _00_of_poverty_and_over_Uninsured_MOE) {
		this._00_of_poverty_and_over_Uninsured_MOE = _00_of_poverty_and_over_Uninsured_MOE;
	}

	public String get_00_of_poverty_and_over_Uninsured_Pct() {
		return _00_of_poverty_and_over_Uninsured_Pct;
	}

	public void set_00_of_poverty_and_over_Uninsured_Pct(
			String _00_of_poverty_and_over_Uninsured_Pct) {
		this._00_of_poverty_and_over_Uninsured_Pct = _00_of_poverty_and_over_Uninsured_Pct;
	}

	public String get_00_of_poverty_and_over_Pct_MOE() {
		return _00_of_poverty_and_over_Pct_MOE;
	}

	public void set_00_of_poverty_and_over_Pct_MOE(
			String _00_of_poverty_and_over_Pct_MOE) {
		this._00_of_poverty_and_over_Pct_MOE = _00_of_poverty_and_over_Pct_MOE;
	}
	
	
}
