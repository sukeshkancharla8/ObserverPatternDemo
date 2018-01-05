package com.accolite.observer;

import java.beans.PropertyChangeEvent;

public class ComputerListner implements ObserverInt{
	private String name;
	private String username;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(name+" notified");
		System.out.println("property:"+evt.getPropertyName()+"\noldvalue:"+evt.getOldValue()+"\nnewValue:"+evt.getNewValue());
		System.out.println("-------------------------");
	}
	public ComputerListner(String name, String username) {
		super();
		this.name = name;
		this.username = username;
	}
}
