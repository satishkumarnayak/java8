package org.garage.java8.consumer;

public class Movie {

	String name;
	String director;
	String actor;

	public Movie(String name, String director, String actor) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + ", actor=" + actor + "]";
	}
	
	

}
