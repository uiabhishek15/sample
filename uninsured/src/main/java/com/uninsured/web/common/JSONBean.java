package com.uninsured.web.common;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.uninsured.data.entity.User;


@ManagedBean(name="json")
@ViewScoped
public class JSONBean implements Serializable {

	private static final long serialVersionUID = 25924094432794817L;

	private List<User> users;
	
	private List<User> filterusers;
	
	private String key;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<User> getFilterusers() {
		return filterusers;
	}

	public void setFilterusers(List<User> filterusers) {
		this.filterusers = filterusers;
	}

	@PostConstruct
	public void init() {
		String url = "http://localhost:8080//uninsuredrest/users";
		
		String filterurl = "http://localhost:8080//uninsuredrest/searchcounty/"+key;
		try {
			Document data = Jsoup.connect(url).ignoreContentType(true).get();
			String json = data.select("body").text();
			users = new Gson().fromJson(json, new TypeToken<List<User>>() {}.getType());
			Document filterdata = Jsoup.connect(filterurl).ignoreContentType(true).get();
			String filterjson = filterdata.select("body").text();
			filterusers = new Gson().fromJson(filterjson, new TypeToken<List<User>>() {}.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
