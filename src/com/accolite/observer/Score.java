package com.accolite.observer;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class Score{
	public static final String SCORE ="score";
	public static final String WICKETS ="wickets";
	public static final String OVERS = "overs";
	private List<ObserverInt> listners;
	private String name;
	private int score;
	private int wickets;
	private int overs;
	public Score(String name, int score, int wickets, int overs) {
		this.listners = new ArrayList<ObserverInt>();
		this.name = name;
		this.score = score;
		this.wickets = wickets;
		this.overs = overs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		notifyListners(this, SCORE, this.score, score);
		this.score = score;		
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		notifyListners(this, WICKETS, this.wickets, wickets);
		this.wickets = wickets;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		notifyListners(this, OVERS, this.overs, overs);
		this.overs = overs;
	}
	private void notifyListners(Object obj, String property, int old, int newValue) {
		// TODO Auto-generated method stub
		for(ObserverInt listner: listners) {
			listner.propertyChange(new PropertyChangeEvent(obj, property, String.valueOf(old), String.valueOf(newValue)));
		}
	}
	public void addListner(ObserverInt listner) {
		listners.add(listner);
	}
}