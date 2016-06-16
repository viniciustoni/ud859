package com.google.devrel.training.conference.converter;

import java.util.ArrayList;
import java.util.List;

import com.google.devrel.training.conference.domain.Conference;
import com.google.devrel.training.conference.domain.Session;
import com.google.devrel.training.conference.form.SessionForm;
import com.googlecode.objectify.Key;

public abstract class SessionConverter {

	public static Session converterToSessionFromSessionForm(final SessionForm sessionForm, final String websafeConferenceKey) {

		Session session = null;

		if (sessionForm != null) {

			session = new Session();

			final Key<Conference> conferenceKey = Key.create(websafeConferenceKey);

			session.setConferenceKey(conferenceKey);
			session.setSessionName(sessionForm.getSessionName());
			session.setHighlights(sessionForm.getHighlights());
			session.setSpeaker(sessionForm.getSpeaker());
			session.setTypeOfSession(sessionForm.getTypeOfSession());
			session.setDuration(sessionForm.getDuration());
			session.setDate(sessionForm.getDate());
			session.setStartTime(sessionForm.getStartTime());

		}

		return session;

	}

	public static SessionForm converterToSessionFormFromSession(final Session session) {

		SessionForm sessionForm = null;

		if (session != null) {

			sessionForm = new SessionForm();

			sessionForm.setSessionName(session.getSessionName());
			sessionForm.setHighlights(session.getHighlights());
			sessionForm.setSpeaker(session.getSpeaker());
			sessionForm.setTypeOfSession(session.getTypeOfSession());
			sessionForm.setDuration(session.getDuration());
			sessionForm.setDate(session.getDate());
			sessionForm.setStartTime(session.getStartTime());
		}

		return sessionForm;
	}
	
	public static List<SessionForm> converterToSessionListFormFromSessionList(final List<Session> sessions) {

		List<SessionForm> sessionsForm = null;
		
		if (sessions != null && !sessions.isEmpty()) {
			sessionsForm = new ArrayList<>();
			
			for (Session session : sessions) {
				sessionsForm.add(converterToSessionFormFromSession(session));
			}
		}
		
		return sessionsForm;
		
	}

}
