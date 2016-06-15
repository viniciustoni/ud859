package com.google.devrel.training.conference.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.devrel.training.conference.form.ProfileForm.TeeShirtSize;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Profile {

	@Id
	private String userId;

	private String displayName;

	private String mainEmail;

	private TeeShirtSize teeShirtSize;

	// List of conferences the user has registered to attend
	private List<String> conferenceKeysToAttend = new ArrayList<>(0);

	public Profile() {
	}

	/**
	 * Public constructor for Profile.
	 * 
	 * @param userId
	 *            The user id, obtained from the email
	 * @param displayName
	 *            Any string user wants us to display him/her on this system.
	 * @param mainEmail
	 *            User's main e-mail address.
	 * @param teeShirtSize
	 *            The User's tee shirt size
	 * 
	 */
	public Profile(String userId, String displayName, String mainEmail, TeeShirtSize teeShirtSize) {
		this.userId = userId;
		this.displayName = displayName;
		this.mainEmail = mainEmail;
		this.teeShirtSize = teeShirtSize;
	}

	public void update(final String displayName, final TeeShirtSize teeShirtSize) {

		if (displayName != null) {
			this.displayName = displayName;
		}
		if (teeShirtSize != null) {
			this.teeShirtSize = teeShirtSize;
		}
	}

	public List<String> getConferenceKeysToAttend() {

		return ImmutableList.copyOf(conferenceKeysToAttend);
	}

	public void addToConferenceKeysToAttend(String conferenceKey) {

		conferenceKeysToAttend.add(conferenceKey);
	}

	/**
	 * Remove the conferenceId from conferenceIdsToAttend.
	 *
	 * @param conferenceKey
	 *            a websafe String representation of the Conference Key.
	 */
	public void unregisterFromConference(String conferenceKey) {

		if (conferenceKeysToAttend.contains(conferenceKey)) {
			conferenceKeysToAttend.remove(conferenceKey);
		} else {
			throw new IllegalArgumentException("Invalid conferenceKey: " + conferenceKey);
		}
	}

	public String getDisplayName() {

		return displayName;
	}

	public String getMainEmail() {

		return mainEmail;
	}

	public TeeShirtSize getTeeShirtSize() {

		return teeShirtSize;
	}

	public String getUserId() {

		return userId;
	}

}
