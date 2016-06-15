package com.google.devrel.training.conference.domain;

public class Announcement {

	private String message;

	public Announcement() {}
	
	
	public Announcement(final String message) {
		this.message = message;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

}
