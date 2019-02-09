package com.example.demo.beans;

public class Movie {

	private String id;
	private String name;
	private String releaseYear;
	private Float imdbRating;
	private String actor;
	private String actress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Float getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(Float imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}

}