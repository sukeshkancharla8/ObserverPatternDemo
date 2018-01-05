package com.accolite.observer;
public class Main {
	public static void main(String[] args) {
		ObserverInt l1 = new Listners("sukesh","sukeshkancharla");
		ObserverInt l2 = new Listners("rithvik", "rithvikReddy");
		ObserverInt l3 = new Listners("saiteja", "SaitejaM");
		ObserverInt l4 = new ComputerListner("computer1","com1");
		ObserverInt l5 = new ComputerListner("computer2","com2");
		Score score = new Score("match", 10, 0, 2);
		score.addListner(l1);
		score.addListner(l2);
		score.addListner(l4);
		score.addListner(l5);
		score.setOvers(3);
	}
}
