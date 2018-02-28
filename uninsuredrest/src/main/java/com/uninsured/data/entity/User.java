package com.uninsured.data.entity;

import java.io.Serializable;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="user")
@TypeAlias("user")
public class User implements Serializable{

	private static final long serialVersionUID = 1103350484894685667L;
	
/*	@Id
	private ObjectId id;
	
	public Tutor(){
		this.id = ObjectId.get();
	}*/
	
	@Field("County")
	@TextIndexed(weight=1)
	private String county;	
	
	@Field("Population")
	private String population;
	
	@Field("Population MOE")
	private String population_MOE;
	
	@Field("Uninsured")
	private String uninsured;
	
	@Field("Uninsured MOE")
	private String uninsured_MOE;
	
	@Field("Uninsured Pct")
	private String uninsured_Pct;
	
	@Field("Uninsured Pct MOE")
	private String uninsured_Pct_MOE;
	
	@Field("Population - Under 18 years")
	private String population_Under18years;
	
	@Field("Population - Under 18 years MOE")
	private String population_Under18years_MOE;
	
	@Field("Population - Under 18 years - Uninsured")
	private String population_Under18years_Uninsured;
	
	@Field("Population - Under 18 years - Uninsured MOE")
	private String population_Under18years_Uninsured_MOE;
	
	@Field("Population - Under 18 years - Uninsured Pct")
	private String population_Under18years_Uninsured_Pct;
	
	@Field("Population - Under 18 years - Uninsured Pct MOE")
	private String population_Under18years_Uninsured_Pct_MOE;

	
	@Field("Population - 18 to 64 years")
	private String population_18to64years;
	
	@Field("Population - 18 to 64 years MOE")
	private String population_18to64years_MOE;
	
	@Field("Population - 18 to 64 years - Uninsured")
	private String population_18to64years_Uninsured;
	
	@Field("Population - 18 to 64 years - Uninsured MOE")
	private String population_18to64years_Uninsured_MOE;

	@Field("Population - 18 to 64 years - Uninsured Pct")
	private String population_18to64years_Uninsured_Pct;
	
	@Field("Population - 18 to 64 years - Uninsured Pct MOE")
	private String population_18to64years_Uninsured_Pct_MOE;
	
	@Field("Population - 65 years and older")
	private String population_65yearsandolder;
	
	@Field("Population - 65 years and older MOE")
	private String population_65yearsandolder_MOE;
	
	@Field("Population - 65 years and older - Uninsured")
	private String population_65yearsandolder_Uninsured;
	
	@Field("Population - 65 years and older - Uninsured MOE")
	private String population_65yearsandolder_Uninsured_MOE;
	
	@Field("Population - 65 years and older - Uninsured Pct")
	private String population_65yearsandolder_Uninsured_Pct;
	
	@Field("Population - 65 years and older - Uninsured Pct MOE")
	private String population_65yearsandolder_Uninsured_Pct_MOE;

	@Field("Population - 19 to 25 years")
	private String population_19to25years;
	
	@Field("Population - 19 to 25 years MOE")
	private String population_19to25years_MOE;
	
	@Field("Population - 19 to 25 years - Uninsured")
	private String population_19to25years_Uninsured;
	
	@Field("Population - 19 to 25 years - Uninsured MOE")
	private String population_19to25years_Uninsured_MOE;
	
	@Field("Population - 19 to 25 years - Uninsured Pct")
	private String population_19to25years_Uninsured_Pct;
	
	@Field("Population - 19 to 25 years - Uninsured Pct MOE")
	private String population_19to25years_Uninsured_Pct_MOE;
	
	@Field("Male")
	private String male;
	
	@Field("Male MOE")
	private String male_MOE;

	@Field("Male - Uninsured")
	private String male_Uninsured;
	
	@Field("Male - Uninsured MOE")
	private String male_Uninsured_MOE;
	
	@Field("Male - Uninsured Pct")
	private String male_Uninsured_Pct;
	
	@Field("Male - Uninsured Pct MOE")
	private String male_Uninsured_Pct_MOE;
	
	@Field("Female")
	private String female;
	
	@Field("Female MOE")
	private String female_MOE;

	@Field("Female - Uninsured")
	private String female_Uninsured;
	
	@Field("Female - Uninsured MOE")
	private String female_Uninsured_MOE;
	
	@Field("Female - Uninsured Pct")
	private String female_Uninsured_Pct;
	
	@Field("Female - Uninsured Pct MOE")
	private String female_Uninsured_Pct_MOE;
	
	@Field("Race - One Race")
	private String race_One_Race;
	
	@Field("Race - One Race MOE")
	private String race_One_Race_MOE;

	@Field("Race - One Race - Uninsured")
	private String race_One_Race_Uninsured;
	
	@Field("Race - One Race - Uninsured MOE")
	private String race_One_Race_Uninsured_MOE;
	
	@Field("Race - One Race - Uninsured Pct")
	private String race_One_Race_Uninsured_Pct;
	
	@Field("Race - One Race - Uninsured Pct MOE")
	private String race_One_Race_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - White")
	private String race_One_Race_White;
	
	@Field("Race - One Race - White MOE")
	private String race_One_Race_White_MOE;

	@Field("Race - One Race - White - Uninsured")
	private String race_One_Race_White_Uninsured;
	
	@Field("Race - One Race - White - Uninsured MOE")
	private String race_One_Race_White_Uninsured_MOE;
	
	@Field("Race - One Race - White - Uninsured Pct")
	private String race_One_Race_White_Uninsured_Pct;
	
	@Field("Race - One Race - White - Uninsured Pct MOE")
	private String race_One_Race_White_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - Black or African American")
	private String race_One_Race_Black_or_African_American;
	
	@Field("Race - One Race - Black or African American MOE")
	private String race_One_Race_Black_or_African_American_MOE;

	@Field("Race - One Race - Black or African American - Uninsured")
	private String race_One_Race_Black_or_African_American_Uninsured;
	
	@Field("Race - One Race - Black or African American - Uninsured MOE")
	private String race_One_Race_Black_or_African_American_Uninsured_MOE;
	
	@Field("Race - One Race - Black or African American - Uninsured Pct")
	private String race_One_Race_Black_or_African_American_Uninsured_Pct;
	
	@Field("Race - One Race - Black or African American - Uninsured Pct MOE")
	private String race_One_Race_Black_or_African_American_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - American Indian and Alaska Native")
	private String race_One_Race_American_Indian_AlaskaNative;
	
	@Field("Race - One Race - American Indian and Alaska Native MOE")
	private String race_One_Race_American_Indian_AlaskaNative_MOE;

	@Field("Race - One Race - American Indian and Alaska Native - Uninsured")
	private String race_One_Race_American_Indian_AlaskaNative_Uninsured;
	
	@Field("Race - One Race - American Indian and Alaska Native - Uninsured MOE")
	private String race_One_Race_American_Indian_AlaskaNative_Uninsured_MOE;
	
	@Field("Race - One Race - American Indian and Alaska Native - Uninsured Pct")
	private String race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct;
	
	@Field("Race - One Race - American Indian and Alaska Native - Uninsured Pct MOE")
	private String race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - Asian")
	private String race_One_Race_Asian;
	
	@Field("Race - One Race - Asian MOE")
	private String race_One_Race_Asian_MOE;

	@Field("Race - One Race - Asian - Uninsured")
	private String race_One_Race_Asian_Uninsured;
	
	@Field("Race - One Race - Asian - Uninsured MOE")
	private String race_One_Race_Asian_Uninsured_MOE;
	
	@Field("Race - One Race - Asian - Uninsured Pct")
	private String race_One_Race_Asian_Uninsured_Pct;
	
	@Field("Race - One Race - Asian - Uninsured Pct MOE")
	private String race_One_Race_Asian_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander;
	
	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander MOE")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE;

	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander - Uninsured")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured;
	
	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander - Uninsured MOE")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE;
	
	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander - Uninsured Pct")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct;
	
	@Field("Race - One Race - Native Hawaiian and Other Pacific Islander - Uninsured Pct MOE")
	private String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE;
	
	@Field("Race - One Race - Some other race")
	private String race_One_Race_Some_other_race;
	
	@Field("Race - One Race - Some other race MOE")
	private String race_One_Race_Some_other_race_MOE;

	@Field("Race - One Race - Some other race - Uninsured")
	private String race_One_Race_Some_other_race_Uninsured;
	
	@Field("Race - One Race - Some other race - Uninsured MOE")
	private String race_One_Race_Some_other_race_Uninsured_MOE;
	
	@Field("Race - One Race - Some other race - Uninsured Pct")
	private String race_One_Race_Some_other_race_Uninsured_Pct;
	
	@Field("Race - One Race - Some other race - Uninsured Pct MOE")
	private String race_One_Race_Some_other_race_Uninsured_Pct_MOE;
	
	@Field("Race - Two or more races")
	private String race_Two_or_more_races;
	
	@Field("Race - Two or more races MOE")
	private String race_Two_or_more_races_MOE;

	@Field("Race - Two or more races - Uninsured")
	private String race_Two_or_more_races_Uninsured;
	
	@Field("Race - Two or more races - Uninsured MOE")
	private String race_Two_or_more_races_Uninsured_MOE;
	
	@Field("Race - Two or more races - Uninsured Pct")
	private String race_Two_or_more_races_Uninsured_Pct;
	
	@Field("Race - Two or more races - Uninsured Pct MOE")
	private String race_Two_or_more_races_Uninsured_Pct_MOE;
	
	@Field("White, not Hispanic or Latino")
	private String white_not_Hispanic_or_Latino;
	
	@Field("White, not Hispanic or Latino MOE")
	private String white_not_Hispanic_or_Latino_MOE;

	@Field("White, not Hispanic or Latino - Uninsured")
	private String white_not_Hispanic_or_Latino_Uninsured;
	
	@Field("White, not Hispanic or Latino - Uninsured MOE")
	private String white_not_Hispanic_or_Latino_Uninsured_MOE;
	
	@Field("White, not Hispanic or Latino - Uninsured Pct")
	private String white_not_Hispanic_or_Latino_Uninsured_Pct;
	
	@Field("White, not Hispanic or Latino - Uninsured Pct MOE")
	private String white_not_Hispanic_or_Latino_Uninsured_Pct_MOE;
	
	@Field("Hispanic or Latino (of any race)")
	private String hispanic_or_Latino__ofanyrace;
	
	@Field("Hispanic or Latino (of any race) MOE")
	private String hispanic_or_Latino__ofanyrace_MOE;

	@Field("Hispanic or Latino (of any race) - Uninsured")
	private String hispanic_or_Latino__ofanyrace_Uninsured;
	
	@Field("Hispanic or Latino (of any race) - Uninsured MOE")
	private String hispanic_or_Latino__ofanyrace_Uninsured_MOE;
	
	@Field("Hispanic or Latino (of any race) - Uninsured Pct")
	private String hispanic_or_Latino__ofanyrace_Uninsured_Pct;
	
	@Field("Hispanic or Latino (of any race) - Uninsured Pct MOE")
	private String hispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE;
	
	@Field("Household Income")
	private String household_Income;
	
	@Field("Household Income MOE")
	private String household_Income_MOE;

	@Field("Household Income - Uninsured")
	private String household_Income_Uninsured;
	
	@Field("Household Income - Uninsured MOE")
	private String household_Income_Uninsured_MOE;
	
	@Field("Household Income - Uninsured Pct")
	private String household_Income_Uninsured_Pct;
	
	@Field("Household Income - Uninsured Pct MOE")
	private String household_Income_Pct_MOE;
	
	@Field("Household Income - Under $25,000")
	private String household_Income_Under_$25000;
	
	@Field("Household Income - Under $25,000 MOE")
	private String household_Income_Under_$25000_MOE;

	@Field("Household Income - Under $25,000 - Uninsured")
	private String household_Income_Under_$25000_Uninsured;
	
	@Field("Household Income - Under $25,000 - Uninsured MOE")
	private String household_Income_Under_$25000_Uninsured_MOE;
	
	@Field("Household Income - Under $25,000 - Uninsured Pct")
	private String household_Income_Under_$25000_Uninsured_Pct;
	
	@Field("Household Income - Under $25,000 - Uninsured Pct MOE")
	private String household_Income_Under_$25000_Pct_MOE;
	
	@Field("Household Income - $25,000 to $49,999")
	private String household_Income_$25000_to_$49999;
	
	@Field("Household Income - $25,000 to $49,999 MOE")
	private String household_Income_$25000_to_$49999_MOE;

	@Field("Household Income - $25,000 to $49,999 - Uninsured")
	private String household_Income_$25000_to_$49999_Uninsured;
	
	@Field("Household Income - $25,000 to $49,999 - Uninsured MOE")
	private String household_Income_$25000_to_$49999_Uninsured_MOE;
	
	@Field("Household Income - $25,000 to $49,999 - Uninsured Pct")
	private String household_Income_$25000_to_$49999_Uninsured_Pct;
	
	@Field("Household Income - $25,000 to $49,999 - Uninsured Pct MOE")
	private String household_Income_$25000_to_$49999_Pct_MOE;
	
	@Field("Household Income - $50,000 to $74,999")
	private String household_Income_$50000_to_$74999;
	
	@Field("Household Income - $50,000 to $74,999 MOE")
	private String household_Income_$50000_to_$74999_MOE;

	@Field("Household Income - $50,000 to $74,999 - Uninsured")
	private String household_Income_$50000_to_$74999_Uninsured;
	
	@Field("Household Income - $50,000 to $74,999 - Uninsured MOE")
	private String household_Income_$50000_to_$74999_Uninsured_MOE;
	
	@Field("Household Income - $50,000 to $74,999 - Uninsured Pct")
	private String household_Income_$50000_to_$74999_Uninsured_Pct;
	
	@Field("Household Income - $50,000 to $74,999 - Uninsured Pct MOE")
	private String household_Income_$50000_to_$74999_Pct_MOE;
	
	@Field("Household Income - $75,000 to $99,999")
	private String household_Income_$75000_to_$99999;
	
	@Field("Household Income - $75,000 to $99,999 MOE")
	private String household_Income_$75000_to_$99999_MOE;

	@Field("Household Income - $75,000 to $99,999 - Uninsured")
	private String household_Income_$75000_to_$99999_Uninsured;
	
	@Field("Household Income - $75,000 to $99,999 - Uninsured MOE")
	private String household_Income_$75000_to_$99999_Uninsured_MOE;
	
	@Field("Household Income - $75,000 to $99,999 - Uninsured Pct")
	private String household_Income_$75000_to_$99999_Uninsured_Pct;
	
	@Field("Household Income - $75,000 to $99,999 - Uninsured Pct MOE")
	private String household_Income_$75000_to_$99999_Pct_MOE;
	
	@Field("Household Income - $100,000 and over")
	private String household_Income_$100000_and_over;
	
	@Field("Household Income - $100,000 and over MOE")
	private String household_Income_$100000_and_over_MOE;

	@Field("Household Income - $100,000 and over - Uninsured")
	private String household_Income_$100000_and_over_Uninsured;
	
	@Field("Household Income - $100,000 and over - Uninsured MOE")
	private String household_Income_$100000_and_over_Uninsured_MOE;
	
	@Field("Household Income - $100,000 and over - Uninsured Pct")
	private String household_Income_$100000_and_over_Uninsured_Pct;
	
	@Field("Household Income - $100,000 and over - Uninsured Pct MOE")
	private String household_Income_$100000_and_over_Pct_MOE;
	
	@Field("Ratio of Income to Poverty Level")
	private String ratio_of_Income_to_Poverty_Level;
	
	@Field("Ratio of Income to Poverty Level MOE")
	private String ratio_of_Income_to_Poverty_Level_MOE;

	@Field("Ratio of Income to Poverty Level - Uninsured")
	private String ratio_of_Income_to_Poverty_Level_Uninsured;
	
	@Field("Ratio of Income to Poverty Level - Uninsured MOE")
	private String ratio_of_Income_to_Poverty_Level_Uninsured_MOE;
	
	@Field("Ratio of Income to Poverty Level - Uninsured Pct")
	private String ratio_of_Income_to_Poverty_Level_Uninsured_Pct;
	
	@Field("Ratio of Income to Poverty Level - Uninsured Pct MOE")
	private String ratio_of_Income_to_Poverty_Level_Pct_MOE;
	
	
	@Field("Ratio of Income to Poverty Level - Under 1")
	private RIPLU ratio_of_Income_to_Poverty_Level_Under_1;

	@Field("Ratio of Income to Poverty Level - 1")
	private RIPLU1 ratio_of_Income_to_Poverty_Level_1;
	
	@Field("Ratio of Income to Poverty Level - 2")
	private RIPLU2 ratio_of_Income_to_Poverty_Level_2;
	
	@Field("Location 1")
	private String Location1;

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getPopulation_MOE() {
		return population_MOE;
	}

	public void setPopulation_MOE(String population_MOE) {
		this.population_MOE = population_MOE;
	}

	public String getUninsured() {
		return uninsured;
	}

	public void setUninsured(String uninsured) {
		this.uninsured = uninsured;
	}

	public String getUninsured_MOE() {
		return uninsured_MOE;
	}

	public void setUninsured_MOE(String uninsured_MOE) {
		this.uninsured_MOE = uninsured_MOE;
	}

	public String getUninsured_Pct() {
		return uninsured_Pct;
	}

	public void setUninsured_Pct(String uninsured_Pct) {
		this.uninsured_Pct = uninsured_Pct;
	}

	public String getUninsured_Pct_MOE() {
		return uninsured_Pct_MOE;
	}

	public void setUninsured_Pct_MOE(String uninsured_Pct_MOE) {
		this.uninsured_Pct_MOE = uninsured_Pct_MOE;
	}

	public String getPopulation_Under18years() {
		return population_Under18years;
	}

	public void setPopulation_Under18years(String population_Under18years) {
		this.population_Under18years = population_Under18years;
	}

	public String getPopulation_Under18years_MOE() {
		return population_Under18years_MOE;
	}

	public void setPopulation_Under18years_MOE(String population_Under18years_MOE) {
		this.population_Under18years_MOE = population_Under18years_MOE;
	}

	public String getPopulation_Under18years_Uninsured() {
		return population_Under18years_Uninsured;
	}

	public void setPopulation_Under18years_Uninsured(
			String population_Under18years_Uninsured) {
		this.population_Under18years_Uninsured = population_Under18years_Uninsured;
	}

	public String getPopulation_Under18years_Uninsured_MOE() {
		return population_Under18years_Uninsured_MOE;
	}

	public void setPopulation_Under18years_Uninsured_MOE(
			String population_Under18years_Uninsured_MOE) {
		this.population_Under18years_Uninsured_MOE = population_Under18years_Uninsured_MOE;
	}

	public String getPopulation_Under18years_Uninsured_Pct() {
		return population_Under18years_Uninsured_Pct;
	}

	public void setPopulation_Under18years_Uninsured_Pct(
			String population_Under18years_Uninsured_Pct) {
		this.population_Under18years_Uninsured_Pct = population_Under18years_Uninsured_Pct;
	}

	public String getPopulation_Under18years_Uninsured_Pct_MOE() {
		return population_Under18years_Uninsured_Pct_MOE;
	}

	public void setPopulation_Under18years_Uninsured_Pct_MOE(
			String population_Under18years_Uninsured_Pct_MOE) {
		this.population_Under18years_Uninsured_Pct_MOE = population_Under18years_Uninsured_Pct_MOE;
	}

	public String getPopulation_18to64years() {
		return population_18to64years;
	}

	public void setPopulation_18to64years(String population_18to64years) {
		this.population_18to64years = population_18to64years;
	}

	public String getPopulation_18to64years_MOE() {
		return population_18to64years_MOE;
	}

	public void setPopulation_18to64years_MOE(String population_18to64years_MOE) {
		this.population_18to64years_MOE = population_18to64years_MOE;
	}

	public String getPopulation_18to64years_Uninsured() {
		return population_18to64years_Uninsured;
	}

	public void setPopulation_18to64years_Uninsured(
			String population_18to64years_Uninsured) {
		this.population_18to64years_Uninsured = population_18to64years_Uninsured;
	}

	public String getPopulation_18to64years_Uninsured_MOE() {
		return population_18to64years_Uninsured_MOE;
	}

	public void setPopulation_18to64years_Uninsured_MOE(
			String population_18to64years_Uninsured_MOE) {
		this.population_18to64years_Uninsured_MOE = population_18to64years_Uninsured_MOE;
	}

	public String getPopulation_18to64years_Uninsured_Pct() {
		return population_18to64years_Uninsured_Pct;
	}

	public void setPopulation_18to64years_Uninsured_Pct(
			String population_18to64years_Uninsured_Pct) {
		this.population_18to64years_Uninsured_Pct = population_18to64years_Uninsured_Pct;
	}

	public String getPopulation_18to64years_Uninsured_Pct_MOE() {
		return population_18to64years_Uninsured_Pct_MOE;
	}

	public void setPopulation_18to64years_Uninsured_Pct_MOE(
			String population_18to64years_Uninsured_Pct_MOE) {
		this.population_18to64years_Uninsured_Pct_MOE = population_18to64years_Uninsured_Pct_MOE;
	}

	public String getPopulation_65yearsandolder() {
		return population_65yearsandolder;
	}

	public void setPopulation_65yearsandolder(String population_65yearsandolder) {
		this.population_65yearsandolder = population_65yearsandolder;
	}

	public String getPopulation_65yearsandolder_MOE() {
		return population_65yearsandolder_MOE;
	}

	public void setPopulation_65yearsandolder_MOE(
			String population_65yearsandolder_MOE) {
		this.population_65yearsandolder_MOE = population_65yearsandolder_MOE;
	}

	public String getPopulation_65yearsandolder_Uninsured() {
		return population_65yearsandolder_Uninsured;
	}

	public void setPopulation_65yearsandolder_Uninsured(
			String population_65yearsandolder_Uninsured) {
		this.population_65yearsandolder_Uninsured = population_65yearsandolder_Uninsured;
	}

	public String getPopulation_65yearsandolder_Uninsured_MOE() {
		return population_65yearsandolder_Uninsured_MOE;
	}

	public void setPopulation_65yearsandolder_Uninsured_MOE(
			String population_65yearsandolder_Uninsured_MOE) {
		this.population_65yearsandolder_Uninsured_MOE = population_65yearsandolder_Uninsured_MOE;
	}

	public String getPopulation_65yearsandolder_Uninsured_Pct() {
		return population_65yearsandolder_Uninsured_Pct;
	}

	public void setPopulation_65yearsandolder_Uninsured_Pct(
			String population_65yearsandolder_Uninsured_Pct) {
		this.population_65yearsandolder_Uninsured_Pct = population_65yearsandolder_Uninsured_Pct;
	}

	public String getPopulation_65yearsandolder_Uninsured_Pct_MOE() {
		return population_65yearsandolder_Uninsured_Pct_MOE;
	}

	public void setPopulation_65yearsandolder_Uninsured_Pct_MOE(
			String population_65yearsandolder_Uninsured_Pct_MOE) {
		this.population_65yearsandolder_Uninsured_Pct_MOE = population_65yearsandolder_Uninsured_Pct_MOE;
	}

	public String getPopulation_19to25years() {
		return population_19to25years;
	}

	public void setPopulation_19to25years(String population_19to25years) {
		this.population_19to25years = population_19to25years;
	}

	public String getPopulation_19to25years_MOE() {
		return population_19to25years_MOE;
	}

	public void setPopulation_19to25years_MOE(String population_19to25years_MOE) {
		this.population_19to25years_MOE = population_19to25years_MOE;
	}

	public String getPopulation_19to25years_Uninsured() {
		return population_19to25years_Uninsured;
	}

	public void setPopulation_19to25years_Uninsured(
			String population_19to25years_Uninsured) {
		this.population_19to25years_Uninsured = population_19to25years_Uninsured;
	}

	public String getPopulation_19to25years_Uninsured_MOE() {
		return population_19to25years_Uninsured_MOE;
	}

	public void setPopulation_19to25years_Uninsured_MOE(
			String population_19to25years_Uninsured_MOE) {
		this.population_19to25years_Uninsured_MOE = population_19to25years_Uninsured_MOE;
	}

	public String getPopulation_19to25years_Uninsured_Pct() {
		return population_19to25years_Uninsured_Pct;
	}

	public void setPopulation_19to25years_Uninsured_Pct(
			String population_19to25years_Uninsured_Pct) {
		this.population_19to25years_Uninsured_Pct = population_19to25years_Uninsured_Pct;
	}

	public String getPopulation_19to25years_Uninsured_Pct_MOE() {
		return population_19to25years_Uninsured_Pct_MOE;
	}

	public void setPopulation_19to25years_Uninsured_Pct_MOE(
			String population_19to25years_Uninsured_Pct_MOE) {
		this.population_19to25years_Uninsured_Pct_MOE = population_19to25years_Uninsured_Pct_MOE;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public String getMale_MOE() {
		return male_MOE;
	}

	public void setMale_MOE(String male_MOE) {
		this.male_MOE = male_MOE;
	}

	public String getMale_Uninsured() {
		return male_Uninsured;
	}

	public void setMale_Uninsured(String male_Uninsured) {
		this.male_Uninsured = male_Uninsured;
	}

	public String getMale_Uninsured_MOE() {
		return male_Uninsured_MOE;
	}

	public void setMale_Uninsured_MOE(String male_Uninsured_MOE) {
		this.male_Uninsured_MOE = male_Uninsured_MOE;
	}

	public String getMale_Uninsured_Pct() {
		return male_Uninsured_Pct;
	}

	public void setMale_Uninsured_Pct(String male_Uninsured_Pct) {
		this.male_Uninsured_Pct = male_Uninsured_Pct;
	}

	public String getMale_Uninsured_Pct_MOE() {
		return male_Uninsured_Pct_MOE;
	}

	public void setMale_Uninsured_Pct_MOE(String male_Uninsured_Pct_MOE) {
		this.male_Uninsured_Pct_MOE = male_Uninsured_Pct_MOE;
	}

	public String getFemale() {
		return female;
	}

	public void setFemale(String female) {
		this.female = female;
	}

	public String getFemale_MOE() {
		return female_MOE;
	}

	public void setFemale_MOE(String female_MOE) {
		this.female_MOE = female_MOE;
	}

	public String getFemale_Uninsured() {
		return female_Uninsured;
	}

	public void setFemale_Uninsured(String female_Uninsured) {
		this.female_Uninsured = female_Uninsured;
	}

	public String getFemale_Uninsured_MOE() {
		return female_Uninsured_MOE;
	}

	public void setFemale_Uninsured_MOE(String female_Uninsured_MOE) {
		this.female_Uninsured_MOE = female_Uninsured_MOE;
	}

	public String getFemale_Uninsured_Pct() {
		return female_Uninsured_Pct;
	}

	public void setFemale_Uninsured_Pct(String female_Uninsured_Pct) {
		this.female_Uninsured_Pct = female_Uninsured_Pct;
	}

	public String getFemale_Uninsured_Pct_MOE() {
		return female_Uninsured_Pct_MOE;
	}

	public void setFemale_Uninsured_Pct_MOE(String female_Uninsured_Pct_MOE) {
		this.female_Uninsured_Pct_MOE = female_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race() {
		return race_One_Race;
	}

	public void setRace_One_Race(String race_One_Race) {
		this.race_One_Race = race_One_Race;
	}

	public String getRace_One_Race_MOE() {
		return race_One_Race_MOE;
	}

	public void setRace_One_Race_MOE(String race_One_Race_MOE) {
		this.race_One_Race_MOE = race_One_Race_MOE;
	}

	public String getRace_One_Race_Uninsured() {
		return race_One_Race_Uninsured;
	}

	public void setRace_One_Race_Uninsured(String race_One_Race_Uninsured) {
		this.race_One_Race_Uninsured = race_One_Race_Uninsured;
	}

	public String getRace_One_Race_Uninsured_MOE() {
		return race_One_Race_Uninsured_MOE;
	}

	public void setRace_One_Race_Uninsured_MOE(String race_One_Race_Uninsured_MOE) {
		this.race_One_Race_Uninsured_MOE = race_One_Race_Uninsured_MOE;
	}

	public String getRace_One_Race_Uninsured_Pct() {
		return race_One_Race_Uninsured_Pct;
	}

	public void setRace_One_Race_Uninsured_Pct(String race_One_Race_Uninsured_Pct) {
		this.race_One_Race_Uninsured_Pct = race_One_Race_Uninsured_Pct;
	}

	public String getRace_One_Race_Uninsured_Pct_MOE() {
		return race_One_Race_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_Uninsured_Pct_MOE(
			String race_One_Race_Uninsured_Pct_MOE) {
		this.race_One_Race_Uninsured_Pct_MOE = race_One_Race_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_White() {
		return race_One_Race_White;
	}

	public void setRace_One_Race_White(String race_One_Race_White) {
		this.race_One_Race_White = race_One_Race_White;
	}

	public String getRace_One_Race_White_MOE() {
		return race_One_Race_White_MOE;
	}

	public void setRace_One_Race_White_MOE(String race_One_Race_White_MOE) {
		this.race_One_Race_White_MOE = race_One_Race_White_MOE;
	}

	public String getRace_One_Race_White_Uninsured() {
		return race_One_Race_White_Uninsured;
	}

	public void setRace_One_Race_White_Uninsured(
			String race_One_Race_White_Uninsured) {
		this.race_One_Race_White_Uninsured = race_One_Race_White_Uninsured;
	}

	public String getRace_One_Race_White_Uninsured_MOE() {
		return race_One_Race_White_Uninsured_MOE;
	}

	public void setRace_One_Race_White_Uninsured_MOE(
			String race_One_Race_White_Uninsured_MOE) {
		this.race_One_Race_White_Uninsured_MOE = race_One_Race_White_Uninsured_MOE;
	}

	public String getRace_One_Race_White_Uninsured_Pct() {
		return race_One_Race_White_Uninsured_Pct;
	}

	public void setRace_One_Race_White_Uninsured_Pct(
			String race_One_Race_White_Uninsured_Pct) {
		this.race_One_Race_White_Uninsured_Pct = race_One_Race_White_Uninsured_Pct;
	}

	public String getRace_One_Race_White_Uninsured_Pct_MOE() {
		return race_One_Race_White_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_White_Uninsured_Pct_MOE(
			String race_One_Race_White_Uninsured_Pct_MOE) {
		this.race_One_Race_White_Uninsured_Pct_MOE = race_One_Race_White_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_Black_or_African_American() {
		return race_One_Race_Black_or_African_American;
	}

	public void setRace_One_Race_Black_or_African_American(
			String race_One_Race_Black_or_African_American) {
		this.race_One_Race_Black_or_African_American = race_One_Race_Black_or_African_American;
	}

	public String getRace_One_Race_Black_or_African_American_MOE() {
		return race_One_Race_Black_or_African_American_MOE;
	}

	public void setRace_One_Race_Black_or_African_American_MOE(
			String race_One_Race_Black_or_African_American_MOE) {
		this.race_One_Race_Black_or_African_American_MOE = race_One_Race_Black_or_African_American_MOE;
	}

	public String getRace_One_Race_Black_or_African_American_Uninsured() {
		return race_One_Race_Black_or_African_American_Uninsured;
	}

	public void setRace_One_Race_Black_or_African_American_Uninsured(
			String race_One_Race_Black_or_African_American_Uninsured) {
		this.race_One_Race_Black_or_African_American_Uninsured = race_One_Race_Black_or_African_American_Uninsured;
	}

	public String getRace_One_Race_Black_or_African_American_Uninsured_MOE() {
		return race_One_Race_Black_or_African_American_Uninsured_MOE;
	}

	public void setRace_One_Race_Black_or_African_American_Uninsured_MOE(
			String race_One_Race_Black_or_African_American_Uninsured_MOE) {
		this.race_One_Race_Black_or_African_American_Uninsured_MOE = race_One_Race_Black_or_African_American_Uninsured_MOE;
	}

	public String getRace_One_Race_Black_or_African_American_Uninsured_Pct() {
		return race_One_Race_Black_or_African_American_Uninsured_Pct;
	}

	public void setRace_One_Race_Black_or_African_American_Uninsured_Pct(
			String race_One_Race_Black_or_African_American_Uninsured_Pct) {
		this.race_One_Race_Black_or_African_American_Uninsured_Pct = race_One_Race_Black_or_African_American_Uninsured_Pct;
	}

	public String getRace_One_Race_Black_or_African_American_Uninsured_Pct_MOE() {
		return race_One_Race_Black_or_African_American_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_Black_or_African_American_Uninsured_Pct_MOE(
			String race_One_Race_Black_or_African_American_Uninsured_Pct_MOE) {
		this.race_One_Race_Black_or_African_American_Uninsured_Pct_MOE = race_One_Race_Black_or_African_American_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative() {
		return race_One_Race_American_Indian_AlaskaNative;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative(
			String race_One_Race_American_Indian_AlaskaNative) {
		this.race_One_Race_American_Indian_AlaskaNative = race_One_Race_American_Indian_AlaskaNative;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative_MOE() {
		return race_One_Race_American_Indian_AlaskaNative_MOE;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative_MOE(
			String race_One_Race_American_Indian_AlaskaNative_MOE) {
		this.race_One_Race_American_Indian_AlaskaNative_MOE = race_One_Race_American_Indian_AlaskaNative_MOE;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative_Uninsured() {
		return race_One_Race_American_Indian_AlaskaNative_Uninsured;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative_Uninsured(
			String race_One_Race_American_Indian_AlaskaNative_Uninsured) {
		this.race_One_Race_American_Indian_AlaskaNative_Uninsured = race_One_Race_American_Indian_AlaskaNative_Uninsured;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative_Uninsured_MOE() {
		return race_One_Race_American_Indian_AlaskaNative_Uninsured_MOE;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative_Uninsured_MOE(
			String race_One_Race_American_Indian_AlaskaNative_Uninsured_MOE) {
		this.race_One_Race_American_Indian_AlaskaNative_Uninsured_MOE = race_One_Race_American_Indian_AlaskaNative_Uninsured_MOE;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative_Uninsured_Pct() {
		return race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative_Uninsured_Pct(
			String race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct) {
		this.race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct = race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct;
	}

	public String getRace_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE() {
		return race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE(
			String race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE) {
		this.race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE = race_One_Race_American_Indian_AlaskaNative_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_Asian() {
		return race_One_Race_Asian;
	}

	public void setRace_One_Race_Asian(String race_One_Race_Asian) {
		this.race_One_Race_Asian = race_One_Race_Asian;
	}

	public String getRace_One_Race_Asian_MOE() {
		return race_One_Race_Asian_MOE;
	}

	public void setRace_One_Race_Asian_MOE(String race_One_Race_Asian_MOE) {
		this.race_One_Race_Asian_MOE = race_One_Race_Asian_MOE;
	}

	public String getRace_One_Race_Asian_Uninsured() {
		return race_One_Race_Asian_Uninsured;
	}

	public void setRace_One_Race_Asian_Uninsured(
			String race_One_Race_Asian_Uninsured) {
		this.race_One_Race_Asian_Uninsured = race_One_Race_Asian_Uninsured;
	}

	public String getRace_One_Race_Asian_Uninsured_MOE() {
		return race_One_Race_Asian_Uninsured_MOE;
	}

	public void setRace_One_Race_Asian_Uninsured_MOE(
			String race_One_Race_Asian_Uninsured_MOE) {
		this.race_One_Race_Asian_Uninsured_MOE = race_One_Race_Asian_Uninsured_MOE;
	}

	public String getRace_One_Race_Asian_Uninsured_Pct() {
		return race_One_Race_Asian_Uninsured_Pct;
	}

	public void setRace_One_Race_Asian_Uninsured_Pct(
			String race_One_Race_Asian_Uninsured_Pct) {
		this.race_One_Race_Asian_Uninsured_Pct = race_One_Race_Asian_Uninsured_Pct;
	}

	public String getRace_One_Race_Asian_Uninsured_Pct_MOE() {
		return race_One_Race_Asian_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_Asian_Uninsured_Pct_MOE(
			String race_One_Race_Asian_Uninsured_Pct_MOE) {
		this.race_One_Race_Asian_Uninsured_Pct_MOE = race_One_Race_Asian_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander = race_One_Race_Native_Hawaiian_and_Other_PacificIslander;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE = race_One_Race_Native_Hawaiian_and_Other_PacificIslander_MOE;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured = race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE = race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_MOE;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct = race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct;
	}

	public String getRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE() {
		return race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE(
			String race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE) {
		this.race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE = race_One_Race_Native_Hawaiian_and_Other_PacificIslander_Uninsured_Pct_MOE;
	}

	public String getRace_One_Race_Some_other_race() {
		return race_One_Race_Some_other_race;
	}

	public void setRace_One_Race_Some_other_race(
			String race_One_Race_Some_other_race) {
		this.race_One_Race_Some_other_race = race_One_Race_Some_other_race;
	}

	public String getRace_One_Race_Some_other_race_MOE() {
		return race_One_Race_Some_other_race_MOE;
	}

	public void setRace_One_Race_Some_other_race_MOE(
			String race_One_Race_Some_other_race_MOE) {
		this.race_One_Race_Some_other_race_MOE = race_One_Race_Some_other_race_MOE;
	}

	public String getRace_One_Race_Some_other_race_Uninsured() {
		return race_One_Race_Some_other_race_Uninsured;
	}

	public void setRace_One_Race_Some_other_race_Uninsured(
			String race_One_Race_Some_other_race_Uninsured) {
		this.race_One_Race_Some_other_race_Uninsured = race_One_Race_Some_other_race_Uninsured;
	}

	public String getRace_One_Race_Some_other_race_Uninsured_MOE() {
		return race_One_Race_Some_other_race_Uninsured_MOE;
	}

	public void setRace_One_Race_Some_other_race_Uninsured_MOE(
			String race_One_Race_Some_other_race_Uninsured_MOE) {
		this.race_One_Race_Some_other_race_Uninsured_MOE = race_One_Race_Some_other_race_Uninsured_MOE;
	}

	public String getRace_One_Race_Some_other_race_Uninsured_Pct() {
		return race_One_Race_Some_other_race_Uninsured_Pct;
	}

	public void setRace_One_Race_Some_other_race_Uninsured_Pct(
			String race_One_Race_Some_other_race_Uninsured_Pct) {
		this.race_One_Race_Some_other_race_Uninsured_Pct = race_One_Race_Some_other_race_Uninsured_Pct;
	}

	public String getRace_One_Race_Some_other_race_Uninsured_Pct_MOE() {
		return race_One_Race_Some_other_race_Uninsured_Pct_MOE;
	}

	public void setRace_One_Race_Some_other_race_Uninsured_Pct_MOE(
			String race_One_Race_Some_other_race_Uninsured_Pct_MOE) {
		this.race_One_Race_Some_other_race_Uninsured_Pct_MOE = race_One_Race_Some_other_race_Uninsured_Pct_MOE;
	}

	public String getRace_Two_or_more_races() {
		return race_Two_or_more_races;
	}

	public void setRace_Two_or_more_races(String race_Two_or_more_races) {
		this.race_Two_or_more_races = race_Two_or_more_races;
	}

	public String getRace_Two_or_more_races_MOE() {
		return race_Two_or_more_races_MOE;
	}

	public void setRace_Two_or_more_races_MOE(String race_Two_or_more_races_MOE) {
		this.race_Two_or_more_races_MOE = race_Two_or_more_races_MOE;
	}

	public String getRace_Two_or_more_races_Uninsured() {
		return race_Two_or_more_races_Uninsured;
	}

	public void setRace_Two_or_more_races_Uninsured(
			String race_Two_or_more_races_Uninsured) {
		this.race_Two_or_more_races_Uninsured = race_Two_or_more_races_Uninsured;
	}

	public String getRace_Two_or_more_races_Uninsured_MOE() {
		return race_Two_or_more_races_Uninsured_MOE;
	}

	public void setRace_Two_or_more_races_Uninsured_MOE(
			String race_Two_or_more_races_Uninsured_MOE) {
		this.race_Two_or_more_races_Uninsured_MOE = race_Two_or_more_races_Uninsured_MOE;
	}

	public String getRace_Two_or_more_races_Uninsured_Pct() {
		return race_Two_or_more_races_Uninsured_Pct;
	}

	public void setRace_Two_or_more_races_Uninsured_Pct(
			String race_Two_or_more_races_Uninsured_Pct) {
		this.race_Two_or_more_races_Uninsured_Pct = race_Two_or_more_races_Uninsured_Pct;
	}

	public String getRace_Two_or_more_races_Uninsured_Pct_MOE() {
		return race_Two_or_more_races_Uninsured_Pct_MOE;
	}

	public void setRace_Two_or_more_races_Uninsured_Pct_MOE(
			String race_Two_or_more_races_Uninsured_Pct_MOE) {
		this.race_Two_or_more_races_Uninsured_Pct_MOE = race_Two_or_more_races_Uninsured_Pct_MOE;
	}

	public String getWhite_not_Hispanic_or_Latino() {
		return white_not_Hispanic_or_Latino;
	}

	public void setWhite_not_Hispanic_or_Latino(String white_not_Hispanic_or_Latino) {
		this.white_not_Hispanic_or_Latino = white_not_Hispanic_or_Latino;
	}

	public String getWhite_not_Hispanic_or_Latino_MOE() {
		return white_not_Hispanic_or_Latino_MOE;
	}

	public void setWhite_not_Hispanic_or_Latino_MOE(
			String white_not_Hispanic_or_Latino_MOE) {
		this.white_not_Hispanic_or_Latino_MOE = white_not_Hispanic_or_Latino_MOE;
	}

	public String getWhite_not_Hispanic_or_Latino_Uninsured() {
		return white_not_Hispanic_or_Latino_Uninsured;
	}

	public void setWhite_not_Hispanic_or_Latino_Uninsured(
			String white_not_Hispanic_or_Latino_Uninsured) {
		this.white_not_Hispanic_or_Latino_Uninsured = white_not_Hispanic_or_Latino_Uninsured;
	}

	public String getWhite_not_Hispanic_or_Latino_Uninsured_MOE() {
		return white_not_Hispanic_or_Latino_Uninsured_MOE;
	}

	public void setWhite_not_Hispanic_or_Latino_Uninsured_MOE(
			String white_not_Hispanic_or_Latino_Uninsured_MOE) {
		this.white_not_Hispanic_or_Latino_Uninsured_MOE = white_not_Hispanic_or_Latino_Uninsured_MOE;
	}

	public String getWhite_not_Hispanic_or_Latino_Uninsured_Pct() {
		return white_not_Hispanic_or_Latino_Uninsured_Pct;
	}

	public void setWhite_not_Hispanic_or_Latino_Uninsured_Pct(
			String white_not_Hispanic_or_Latino_Uninsured_Pct) {
		this.white_not_Hispanic_or_Latino_Uninsured_Pct = white_not_Hispanic_or_Latino_Uninsured_Pct;
	}

	public String getWhite_not_Hispanic_or_Latino_Uninsured_Pct_MOE() {
		return white_not_Hispanic_or_Latino_Uninsured_Pct_MOE;
	}

	public void setWhite_not_Hispanic_or_Latino_Uninsured_Pct_MOE(
			String white_not_Hispanic_or_Latino_Uninsured_Pct_MOE) {
		this.white_not_Hispanic_or_Latino_Uninsured_Pct_MOE = white_not_Hispanic_or_Latino_Uninsured_Pct_MOE;
	}

	public String getHispanic_or_Latino__ofanyrace() {
		return hispanic_or_Latino__ofanyrace;
	}

	public void setHispanic_or_Latino__ofanyrace(
			String hispanic_or_Latino__ofanyrace) {
		this.hispanic_or_Latino__ofanyrace = hispanic_or_Latino__ofanyrace;
	}

	public String getHispanic_or_Latino__ofanyrace_MOE() {
		return hispanic_or_Latino__ofanyrace_MOE;
	}

	public void setHispanic_or_Latino__ofanyrace_MOE(
			String hispanic_or_Latino__ofanyrace_MOE) {
		this.hispanic_or_Latino__ofanyrace_MOE = hispanic_or_Latino__ofanyrace_MOE;
	}

	public String getHispanic_or_Latino__ofanyrace_Uninsured() {
		return hispanic_or_Latino__ofanyrace_Uninsured;
	}

	public void setHispanic_or_Latino__ofanyrace_Uninsured(
			String hispanic_or_Latino__ofanyrace_Uninsured) {
		this.hispanic_or_Latino__ofanyrace_Uninsured = hispanic_or_Latino__ofanyrace_Uninsured;
	}

	public String getHispanic_or_Latino__ofanyrace_Uninsured_MOE() {
		return hispanic_or_Latino__ofanyrace_Uninsured_MOE;
	}

	public void setHispanic_or_Latino__ofanyrace_Uninsured_MOE(
			String hispanic_or_Latino__ofanyrace_Uninsured_MOE) {
		this.hispanic_or_Latino__ofanyrace_Uninsured_MOE = hispanic_or_Latino__ofanyrace_Uninsured_MOE;
	}

	public String getHispanic_or_Latino__ofanyrace_Uninsured_Pct() {
		return hispanic_or_Latino__ofanyrace_Uninsured_Pct;
	}

	public void setHispanic_or_Latino__ofanyrace_Uninsured_Pct(
			String hispanic_or_Latino__ofanyrace_Uninsured_Pct) {
		this.hispanic_or_Latino__ofanyrace_Uninsured_Pct = hispanic_or_Latino__ofanyrace_Uninsured_Pct;
	}

	public String getHispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE() {
		return hispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE;
	}

	public void setHispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE(
			String hispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE) {
		this.hispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE = hispanic_or_Latino__ofanyrace_Uninsured_Pct_MOE;
	}

	public String getHousehold_Income() {
		return household_Income;
	}

	public void setHousehold_Income(String household_Income) {
		this.household_Income = household_Income;
	}

	public String getHousehold_Income_MOE() {
		return household_Income_MOE;
	}

	public void setHousehold_Income_MOE(String household_Income_MOE) {
		this.household_Income_MOE = household_Income_MOE;
	}

	public String getHousehold_Income_Uninsured() {
		return household_Income_Uninsured;
	}

	public void setHousehold_Income_Uninsured(String household_Income_Uninsured) {
		this.household_Income_Uninsured = household_Income_Uninsured;
	}

	public String getHousehold_Income_Uninsured_MOE() {
		return household_Income_Uninsured_MOE;
	}

	public void setHousehold_Income_Uninsured_MOE(
			String household_Income_Uninsured_MOE) {
		this.household_Income_Uninsured_MOE = household_Income_Uninsured_MOE;
	}

	public String getHousehold_Income_Uninsured_Pct() {
		return household_Income_Uninsured_Pct;
	}

	public void setHousehold_Income_Uninsured_Pct(
			String household_Income_Uninsured_Pct) {
		this.household_Income_Uninsured_Pct = household_Income_Uninsured_Pct;
	}

	public String getHousehold_Income_Pct_MOE() {
		return household_Income_Pct_MOE;
	}

	public void setHousehold_Income_Pct_MOE(String household_Income_Pct_MOE) {
		this.household_Income_Pct_MOE = household_Income_Pct_MOE;
	}

	public String getHousehold_Income_Under_$25000() {
		return household_Income_Under_$25000;
	}

	public void setHousehold_Income_Under_$25000(
			String household_Income_Under_$25000) {
		this.household_Income_Under_$25000 = household_Income_Under_$25000;
	}

	public String getHousehold_Income_Under_$25000_MOE() {
		return household_Income_Under_$25000_MOE;
	}

	public void setHousehold_Income_Under_$25000_MOE(
			String household_Income_Under_$25000_MOE) {
		this.household_Income_Under_$25000_MOE = household_Income_Under_$25000_MOE;
	}

	public String getHousehold_Income_Under_$25000_Uninsured() {
		return household_Income_Under_$25000_Uninsured;
	}

	public void setHousehold_Income_Under_$25000_Uninsured(
			String household_Income_Under_$25000_Uninsured) {
		this.household_Income_Under_$25000_Uninsured = household_Income_Under_$25000_Uninsured;
	}

	public String getHousehold_Income_Under_$25000_Uninsured_MOE() {
		return household_Income_Under_$25000_Uninsured_MOE;
	}

	public void setHousehold_Income_Under_$25000_Uninsured_MOE(
			String household_Income_Under_$25000_Uninsured_MOE) {
		this.household_Income_Under_$25000_Uninsured_MOE = household_Income_Under_$25000_Uninsured_MOE;
	}

	public String getHousehold_Income_Under_$25000_Uninsured_Pct() {
		return household_Income_Under_$25000_Uninsured_Pct;
	}

	public void setHousehold_Income_Under_$25000_Uninsured_Pct(
			String household_Income_Under_$25000_Uninsured_Pct) {
		this.household_Income_Under_$25000_Uninsured_Pct = household_Income_Under_$25000_Uninsured_Pct;
	}

	public String getHousehold_Income_Under_$25000_Pct_MOE() {
		return household_Income_Under_$25000_Pct_MOE;
	}

	public void setHousehold_Income_Under_$25000_Pct_MOE(
			String household_Income_Under_$25000_Pct_MOE) {
		this.household_Income_Under_$25000_Pct_MOE = household_Income_Under_$25000_Pct_MOE;
	}

	public String getHousehold_Income_$25000_to_$49999() {
		return household_Income_$25000_to_$49999;
	}

	public void setHousehold_Income_$25000_to_$49999(
			String household_Income_$25000_to_$49999) {
		this.household_Income_$25000_to_$49999 = household_Income_$25000_to_$49999;
	}

	public String getHousehold_Income_$25000_to_$49999_MOE() {
		return household_Income_$25000_to_$49999_MOE;
	}

	public void setHousehold_Income_$25000_to_$49999_MOE(
			String household_Income_$25000_to_$49999_MOE) {
		this.household_Income_$25000_to_$49999_MOE = household_Income_$25000_to_$49999_MOE;
	}

	public String getHousehold_Income_$25000_to_$49999_Uninsured() {
		return household_Income_$25000_to_$49999_Uninsured;
	}

	public void setHousehold_Income_$25000_to_$49999_Uninsured(
			String household_Income_$25000_to_$49999_Uninsured) {
		this.household_Income_$25000_to_$49999_Uninsured = household_Income_$25000_to_$49999_Uninsured;
	}

	public String getHousehold_Income_$25000_to_$49999_Uninsured_MOE() {
		return household_Income_$25000_to_$49999_Uninsured_MOE;
	}

	public void setHousehold_Income_$25000_to_$49999_Uninsured_MOE(
			String household_Income_$25000_to_$49999_Uninsured_MOE) {
		this.household_Income_$25000_to_$49999_Uninsured_MOE = household_Income_$25000_to_$49999_Uninsured_MOE;
	}

	public String getHousehold_Income_$25000_to_$49999_Uninsured_Pct() {
		return household_Income_$25000_to_$49999_Uninsured_Pct;
	}

	public void setHousehold_Income_$25000_to_$49999_Uninsured_Pct(
			String household_Income_$25000_to_$49999_Uninsured_Pct) {
		this.household_Income_$25000_to_$49999_Uninsured_Pct = household_Income_$25000_to_$49999_Uninsured_Pct;
	}

	public String getHousehold_Income_$25000_to_$49999_Pct_MOE() {
		return household_Income_$25000_to_$49999_Pct_MOE;
	}

	public void setHousehold_Income_$25000_to_$49999_Pct_MOE(
			String household_Income_$25000_to_$49999_Pct_MOE) {
		this.household_Income_$25000_to_$49999_Pct_MOE = household_Income_$25000_to_$49999_Pct_MOE;
	}

	public String getHousehold_Income_$50000_to_$74999() {
		return household_Income_$50000_to_$74999;
	}

	public void setHousehold_Income_$50000_to_$74999(
			String household_Income_$50000_to_$74999) {
		this.household_Income_$50000_to_$74999 = household_Income_$50000_to_$74999;
	}

	public String getHousehold_Income_$50000_to_$74999_MOE() {
		return household_Income_$50000_to_$74999_MOE;
	}

	public void setHousehold_Income_$50000_to_$74999_MOE(
			String household_Income_$50000_to_$74999_MOE) {
		this.household_Income_$50000_to_$74999_MOE = household_Income_$50000_to_$74999_MOE;
	}

	public String getHousehold_Income_$50000_to_$74999_Uninsured() {
		return household_Income_$50000_to_$74999_Uninsured;
	}

	public void setHousehold_Income_$50000_to_$74999_Uninsured(
			String household_Income_$50000_to_$74999_Uninsured) {
		this.household_Income_$50000_to_$74999_Uninsured = household_Income_$50000_to_$74999_Uninsured;
	}

	public String getHousehold_Income_$50000_to_$74999_Uninsured_MOE() {
		return household_Income_$50000_to_$74999_Uninsured_MOE;
	}

	public void setHousehold_Income_$50000_to_$74999_Uninsured_MOE(
			String household_Income_$50000_to_$74999_Uninsured_MOE) {
		this.household_Income_$50000_to_$74999_Uninsured_MOE = household_Income_$50000_to_$74999_Uninsured_MOE;
	}

	public String getHousehold_Income_$50000_to_$74999_Uninsured_Pct() {
		return household_Income_$50000_to_$74999_Uninsured_Pct;
	}

	public void setHousehold_Income_$50000_to_$74999_Uninsured_Pct(
			String household_Income_$50000_to_$74999_Uninsured_Pct) {
		this.household_Income_$50000_to_$74999_Uninsured_Pct = household_Income_$50000_to_$74999_Uninsured_Pct;
	}

	public String getHousehold_Income_$50000_to_$74999_Pct_MOE() {
		return household_Income_$50000_to_$74999_Pct_MOE;
	}

	public void setHousehold_Income_$50000_to_$74999_Pct_MOE(
			String household_Income_$50000_to_$74999_Pct_MOE) {
		this.household_Income_$50000_to_$74999_Pct_MOE = household_Income_$50000_to_$74999_Pct_MOE;
	}

	public String getHousehold_Income_$75000_to_$99999() {
		return household_Income_$75000_to_$99999;
	}

	public void setHousehold_Income_$75000_to_$99999(
			String household_Income_$75000_to_$99999) {
		this.household_Income_$75000_to_$99999 = household_Income_$75000_to_$99999;
	}

	public String getHousehold_Income_$75000_to_$99999_MOE() {
		return household_Income_$75000_to_$99999_MOE;
	}

	public void setHousehold_Income_$75000_to_$99999_MOE(
			String household_Income_$75000_to_$99999_MOE) {
		this.household_Income_$75000_to_$99999_MOE = household_Income_$75000_to_$99999_MOE;
	}

	public String getHousehold_Income_$75000_to_$99999_Uninsured() {
		return household_Income_$75000_to_$99999_Uninsured;
	}

	public void setHousehold_Income_$75000_to_$99999_Uninsured(
			String household_Income_$75000_to_$99999_Uninsured) {
		this.household_Income_$75000_to_$99999_Uninsured = household_Income_$75000_to_$99999_Uninsured;
	}

	public String getHousehold_Income_$75000_to_$99999_Uninsured_MOE() {
		return household_Income_$75000_to_$99999_Uninsured_MOE;
	}

	public void setHousehold_Income_$75000_to_$99999_Uninsured_MOE(
			String household_Income_$75000_to_$99999_Uninsured_MOE) {
		this.household_Income_$75000_to_$99999_Uninsured_MOE = household_Income_$75000_to_$99999_Uninsured_MOE;
	}

	public String getHousehold_Income_$75000_to_$99999_Uninsured_Pct() {
		return household_Income_$75000_to_$99999_Uninsured_Pct;
	}

	public void setHousehold_Income_$75000_to_$99999_Uninsured_Pct(
			String household_Income_$75000_to_$99999_Uninsured_Pct) {
		this.household_Income_$75000_to_$99999_Uninsured_Pct = household_Income_$75000_to_$99999_Uninsured_Pct;
	}

	public String getHousehold_Income_$75000_to_$99999_Pct_MOE() {
		return household_Income_$75000_to_$99999_Pct_MOE;
	}

	public void setHousehold_Income_$75000_to_$99999_Pct_MOE(
			String household_Income_$75000_to_$99999_Pct_MOE) {
		this.household_Income_$75000_to_$99999_Pct_MOE = household_Income_$75000_to_$99999_Pct_MOE;
	}

	public String getHousehold_Income_$100000_and_over() {
		return household_Income_$100000_and_over;
	}

	public void setHousehold_Income_$100000_and_over(
			String household_Income_$100000_and_over) {
		this.household_Income_$100000_and_over = household_Income_$100000_and_over;
	}

	public String getHousehold_Income_$100000_and_over_MOE() {
		return household_Income_$100000_and_over_MOE;
	}

	public void setHousehold_Income_$100000_and_over_MOE(
			String household_Income_$100000_and_over_MOE) {
		this.household_Income_$100000_and_over_MOE = household_Income_$100000_and_over_MOE;
	}

	public String getHousehold_Income_$100000_and_over_Uninsured() {
		return household_Income_$100000_and_over_Uninsured;
	}

	public void setHousehold_Income_$100000_and_over_Uninsured(
			String household_Income_$100000_and_over_Uninsured) {
		this.household_Income_$100000_and_over_Uninsured = household_Income_$100000_and_over_Uninsured;
	}

	public String getHousehold_Income_$100000_and_over_Uninsured_MOE() {
		return household_Income_$100000_and_over_Uninsured_MOE;
	}

	public void setHousehold_Income_$100000_and_over_Uninsured_MOE(
			String household_Income_$100000_and_over_Uninsured_MOE) {
		this.household_Income_$100000_and_over_Uninsured_MOE = household_Income_$100000_and_over_Uninsured_MOE;
	}

	public String getHousehold_Income_$100000_and_over_Uninsured_Pct() {
		return household_Income_$100000_and_over_Uninsured_Pct;
	}

	public void setHousehold_Income_$100000_and_over_Uninsured_Pct(
			String household_Income_$100000_and_over_Uninsured_Pct) {
		this.household_Income_$100000_and_over_Uninsured_Pct = household_Income_$100000_and_over_Uninsured_Pct;
	}

	public String getHousehold_Income_$100000_and_over_Pct_MOE() {
		return household_Income_$100000_and_over_Pct_MOE;
	}

	public void setHousehold_Income_$100000_and_over_Pct_MOE(
			String household_Income_$100000_and_over_Pct_MOE) {
		this.household_Income_$100000_and_over_Pct_MOE = household_Income_$100000_and_over_Pct_MOE;
	}

	public String getRatio_of_Income_to_Poverty_Level() {
		return ratio_of_Income_to_Poverty_Level;
	}

	public void setRatio_of_Income_to_Poverty_Level(
			String ratio_of_Income_to_Poverty_Level) {
		this.ratio_of_Income_to_Poverty_Level = ratio_of_Income_to_Poverty_Level;
	}

	public String getRatio_of_Income_to_Poverty_Level_MOE() {
		return ratio_of_Income_to_Poverty_Level_MOE;
	}

	public void setRatio_of_Income_to_Poverty_Level_MOE(
			String ratio_of_Income_to_Poverty_Level_MOE) {
		this.ratio_of_Income_to_Poverty_Level_MOE = ratio_of_Income_to_Poverty_Level_MOE;
	}

	public String getRatio_of_Income_to_Poverty_Level_Uninsured() {
		return ratio_of_Income_to_Poverty_Level_Uninsured;
	}

	public void setRatio_of_Income_to_Poverty_Level_Uninsured(
			String ratio_of_Income_to_Poverty_Level_Uninsured) {
		this.ratio_of_Income_to_Poverty_Level_Uninsured = ratio_of_Income_to_Poverty_Level_Uninsured;
	}

	public String getRatio_of_Income_to_Poverty_Level_Uninsured_MOE() {
		return ratio_of_Income_to_Poverty_Level_Uninsured_MOE;
	}

	public void setRatio_of_Income_to_Poverty_Level_Uninsured_MOE(
			String ratio_of_Income_to_Poverty_Level_Uninsured_MOE) {
		this.ratio_of_Income_to_Poverty_Level_Uninsured_MOE = ratio_of_Income_to_Poverty_Level_Uninsured_MOE;
	}

	public String getRatio_of_Income_to_Poverty_Level_Uninsured_Pct() {
		return ratio_of_Income_to_Poverty_Level_Uninsured_Pct;
	}

	public void setRatio_of_Income_to_Poverty_Level_Uninsured_Pct(
			String ratio_of_Income_to_Poverty_Level_Uninsured_Pct) {
		this.ratio_of_Income_to_Poverty_Level_Uninsured_Pct = ratio_of_Income_to_Poverty_Level_Uninsured_Pct;
	}

	public String getRatio_of_Income_to_Poverty_Level_Pct_MOE() {
		return ratio_of_Income_to_Poverty_Level_Pct_MOE;
	}

	public void setRatio_of_Income_to_Poverty_Level_Pct_MOE(
			String ratio_of_Income_to_Poverty_Level_Pct_MOE) {
		this.ratio_of_Income_to_Poverty_Level_Pct_MOE = ratio_of_Income_to_Poverty_Level_Pct_MOE;
	}

	public RIPLU getRatio_of_Income_to_Poverty_Level_Under_1() {
		return ratio_of_Income_to_Poverty_Level_Under_1;
	}

	public void setRatio_of_Income_to_Poverty_Level_Under_1(
			RIPLU ratio_of_Income_to_Poverty_Level_Under_1) {
		this.ratio_of_Income_to_Poverty_Level_Under_1 = ratio_of_Income_to_Poverty_Level_Under_1;
	}

	public RIPLU1 getRatio_of_Income_to_Poverty_Level_1() {
		return ratio_of_Income_to_Poverty_Level_1;
	}

	public void setRatio_of_Income_to_Poverty_Level_1(
			RIPLU1 ratio_of_Income_to_Poverty_Level_1) {
		this.ratio_of_Income_to_Poverty_Level_1 = ratio_of_Income_to_Poverty_Level_1;
	}

	public RIPLU2 getRatio_of_Income_to_Poverty_Level_2() {
		return ratio_of_Income_to_Poverty_Level_2;
	}

	public void setRatio_of_Income_to_Poverty_Level_2(
			RIPLU2 ratio_of_Income_to_Poverty_Level_2) {
		this.ratio_of_Income_to_Poverty_Level_2 = ratio_of_Income_to_Poverty_Level_2;
	}

	public String getLocation1() {
		return Location1;
	}

	public void setLocation1(String location1) {
		Location1 = location1;
	}
	
}
