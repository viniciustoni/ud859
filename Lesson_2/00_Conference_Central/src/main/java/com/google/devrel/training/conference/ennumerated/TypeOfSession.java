package com.google.devrel.training.conference.ennumerated;

public enum TypeOfSession {

	LECTURE("Lecture"), KEYNOTE("Keynote"), WORKSHOP("Workshop"), VIDEO("Video");

	private final String description;

	private TypeOfSession(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
