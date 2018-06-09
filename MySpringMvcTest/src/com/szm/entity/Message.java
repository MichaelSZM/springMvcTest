package com.szm.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Message implements Serializable{
	
	private List<String> names;
	private Set<String> cities;
	private Map<String,Object> maps;
	private Properties properties;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Message [names=" + names + ", cities=" + cities + ", maps="
				+ maps + ", properties=" + properties + "]";
	}
	
	

}
