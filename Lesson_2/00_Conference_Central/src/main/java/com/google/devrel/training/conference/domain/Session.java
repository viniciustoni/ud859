package com.google.devrel.training.conference.domain;

import java.io.Serializable;
import java.util.Date;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.google.devrel.training.conference.ennumerated.TypeOfSession;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Session implements Serializable {

	private static final long serialVersionUID = 7977211796044777473L;

	@Id
	private String sessionName;

	private String highlights;

	@Index
	private String speaker;

	private String duration;

	@Index
	private TypeOfSession typeOfSession;

	private Date date;

	private Date startTime;

	@Parent
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	private Key<Conference> conferenceKey;
	
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

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public Key<Conference> getConferenceKey() {

		return conferenceKey;
	}

	public void setConferenceKey(Key<Conference> conferenceKey) {

		this.conferenceKey = conferenceKey;
	}

}
