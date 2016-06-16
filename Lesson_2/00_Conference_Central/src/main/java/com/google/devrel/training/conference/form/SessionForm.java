package com.google.devrel.training.conference.form;

import java.io.Serializable;
import java.util.Date;

import com.google.devrel.training.conference.ennumerated.TypeOfSession;

public class SessionForm implements Serializable {

	private static final long serialVersionUID = 7977211796044777473L;

	private String sessionName;
	private String highlights;
	private String speaker;
	private String duration;
	private TypeOfSession typeOfSession;
	private Date date;
	private Date startTime;

	public String getSessionName() {

		return sessionName;
	}

	public void setSessionName(String sessionName) {

		this.sessionName = sessionName;
	}

	public String getHighlights() {

		return highlights;
	}

	public void setHighlights(String highlights) {

		this.highlights = highlights;
	}

	public String getSpeaker() {

		return speaker;
	}

	public void setSpeaker(String speaker) {

		this.speaker = speaker;
	}

	public String getDuration() {

		return duration;
	}

	public void setDuration(String duration) {

		this.duration = duration;
	}

	public TypeOfSession getTypeOfSession() {

		return typeOfSession;
	}

	public void setTypeOfSession(TypeOfSession typeOfSession) {

		this.typeOfSession = typeOfSession;
	}

	public Date getDate() {

		return date;
	}

	public void setDate(Date date) {

		this.date = date;
	}

	public Date getStartTime() {

		return startTime;
	}

	public void setStartTime(Date startTime) {

		this.startTime = startTime;
	}

}
