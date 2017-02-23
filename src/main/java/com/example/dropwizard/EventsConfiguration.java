
package com.example.dropwizard;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class EventsConfiguration extends Configuration {

	@NotEmpty
	private String dateFormat;

	@JsonProperty
	public String getDateFormat() {
		return dateFormat;
	}

	@JsonProperty
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

}
