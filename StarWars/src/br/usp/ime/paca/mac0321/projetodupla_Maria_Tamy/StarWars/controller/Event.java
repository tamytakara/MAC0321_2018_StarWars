package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.controller;

public abstract class Event {
	private long evtTime;
	
	public Event(long eventTime) {
		evtTime = eventTime;
	}
	
	public boolean ready() {
		return System.currentTimeMillis() >= evtTime;
	}
	abstract public void action();
	abstract public String description();
}
