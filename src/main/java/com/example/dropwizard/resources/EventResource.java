package com.example.dropwizard.resources;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.example.dropwizard.api.EventDetail;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {

	@GET
	@Timed
	public List<EventDetail> getEventDetail(){
		EventDetail event = new EventDetail();
		event.setDate(new Date());
		event.setDescription("Table Tenis Event");
		event.setId(new AtomicInteger(100).get());
		event.setLocation("Bangalore");
		event.setName("Win and GET Bear");
		
		return Collections.singletonList(event);
	}
}
